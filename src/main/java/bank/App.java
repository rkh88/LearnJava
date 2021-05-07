package bank;

public class App {




    public static void main(String[] args) {
        Director dir = new Director("Petya", "Vasechkin", 50000);

        Bank b1 = new Bank("Sberbank", "Moskau", dir);
      //  b1.printInformation();
      //  b1.printInformationDirector();

        b1.addEmployee("Vasya", "Vasechkin", 10000);
        b1.addEmployee("Vasya", "Vasechkin", 10000);
        b1.addEmployee("Vasya", "Vasechkin", 10000);
        Employe e = b1.getEmployeById(1000);
        e.setSalary(-2000000);

        b1.printEmployes();
        b1.addCustomer("Vanya", "Ivanov");
        b1.printCustomers();
        b1.createAccount(1000,4000);
        b1.createAccount(1000,6000);
        b1.printAccountById(1000);
       // Bank b2 = new Bank("Alfabank", "Moskau",dir);
      //  Bank f = new Bank("")
       // b2.printInformation();
    }

}
