package bank;

import myutils.MyArrayList;

import java.math.BigDecimal;
/**
 * Bank
 *
 * @author  Ruslan
 * @version 1.0
 *
 */
public class Bank {
    String name;
     String address;
    Director director;
    Employe [] employes = new Employe[5];
    private MyArrayList<Customer> customerList = new MyArrayList();
    private MyArrayList<CustomerAccount> accountList = new MyArrayList();
    int currentNumberOfEmployee = 0;
    private int accountNumber = 0;

    int idEmploye = 1_000;
    int idCustomer = 1_000;

    public Bank(String name,  String ad, Director d){
       this.name = name;
       this.address = ad;
       this.director =d;
        System.out.println("Hello from constructor");
    }
    public Bank(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(idCustomer, firstName, lastName);
        idCustomer = idCustomer + 120;
        customerList.add(customer);


    }

    /**
     * creates new account of customer if amount is positive
     * if amount is negative do nothing
     *
     *
     * @param idCustomer id of customer
     * @param amount amount; I must be positive number
     */
    public void createAccount (int idCustomer, double amount){
        if (amount > 0) {
            Customer c = getCustomerById(idCustomer);
            BigDecimal amountBD = new BigDecimal(amount);
            CustomerAccount a = new CustomerAccount(accountNumber++, c, amountBD);
            accountList.add(a);
        }
    }

    public void createAccount (int idCustomer){
        Customer c = getCustomerById(idCustomer);
        CustomerAccount a = new CustomerAccount(accountNumber++, c);
        accountList.add(a);
    }



    public void printAccountById(int idCustomer){
        for (int i = 0; i < accountList.size(); i++) {
            CustomerAccount ca = accountList.get(i);
            if(idCustomer == ca.getCustomer().getId()){
                ca.printAccountInformation();
            }
        }
    }

    public void printCustomers(){
        for (int i = 0; i < customerList.size(); i++) {
            Customer c = customerList.get(i);
            c.printInformation();
        }

    }

    public void addEmployee(String firstName, String lastName, int salary){
        if(currentNumberOfEmployee <employes.length ){
            Employe employe = new Employe(idEmploye++,firstName, lastName, salary);
            employes[currentNumberOfEmployee++]  = employe;
        } else{
            System.out.println("Ups!!!");
        }

    }

    public Employe getEmployeById(int id){
        for (int i = 0; i < currentNumberOfEmployee; i++) {
            if (id==this.employes[i].getId()){
                return  this.employes[i];
            }
        }
        return  null;
    }




    public Customer getCustomerById(int id){
        for (int i = 0; i < customerList.size(); i++) {
            Customer c = this.customerList.get(i);
            if (id==c.getId()){
                return  c;
            }
        }
        return  null;
    }

    public void printEmployes(){
        for (int i = 0; i < currentNumberOfEmployee; i++) {
            Employe employe = employes[i];
            employe.printInformation();
        }


    }

    public void printInformation(){
        System.out.println(name +  " " + address);
    }
    public void printInformationDirector() {
        director.printInformation();
    }



}

