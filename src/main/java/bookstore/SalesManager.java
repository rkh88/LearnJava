package bookstore;

public class SalesManager extends Person {
    int salesManagerNumber;
    String department;
    int sumOfSales;

    public SalesManager(String firstName, String lastName, int salesManagerNumber, String department, int sumOfSales) {
        super(firstName, lastName);
        this.salesManagerNumber = salesManagerNumber;
        this.department = department;
        this.sumOfSales = sumOfSales;
    }

    public int getSalesManagerNumber() {
        return salesManagerNumber;
    }

    public String getDepartment() {
        return department;
    }

    public int getSumOfSales() {
        return sumOfSales;
    }

    public void printSalesManagers(){
    System.out.println(salesManagerNumber + " " + this.firstName + " " + this.lastName + " " + this.department);




}


}
