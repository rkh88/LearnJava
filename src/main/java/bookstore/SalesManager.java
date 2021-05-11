package bookstore;

public class SalesManager extends Person {
    private int salesManagerNumber;
    private String department;
    private int sumOfSales;

    public SalesManager(String firstName, String lastName, int salesManagerNumber, String department, int sumOfSales) {
        super(firstName, lastName);
        this.salesManagerNumber = salesManagerNumber;
        this.department = department;
        this.sumOfSales = sumOfSales;
    }

    public int getSalesManagerNumber() {
        return salesManagerNumber;
    }






    public int getSumOfSales() {
        return sumOfSales;
    }

    public void setSumOfSales(int sum) {
        this.sumOfSales = this.sumOfSales + sum;
    }







    }






