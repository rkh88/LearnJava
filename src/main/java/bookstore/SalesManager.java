package bookstore;

public class SalesManager {
    String salesManagerName;
    String firstName;
    String lastName;
    int salesManagerNumber;
    String department;
    int sumOfSales;

    public SalesManager(String salesManagerName, String firstName, String lastName, int salesManagerNumber, String department, int sumOfSales) {
        this.salesManagerName = salesManagerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salesManagerNumber = salesManagerNumber;
        this.department = department;
        this.sumOfSales = sumOfSales;
    }

    public void printSalesManagers(){
    System.out.println(salesManagerNumber + " " + this.firstName + " " + this.lastName + " " + this.department);




}


}
