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

    public SalesManager getSumOfSalesBySalesManagerNumber (salesManagerNumber){
        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = this.salesManagersList.get(i);
            if (salesManagerNumber==m.getId()){
                int sumOfSales = salesManagersList[i].sumOfSales;
                return  sumOfSales;
            }
        }
        return  null;


    }

    public void setSumOfSales(int sumOfSales) {
        this.sumOfSales = sumOfSales;
    }

    public void printSalesManagers(){
    System.out.println(salesManagerNumber + " " + this.firstName + " " + this.lastName + " " + this.department);




}


}
