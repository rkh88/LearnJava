package bookstore;

import bank.Customer;

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

    public SalesManager getSalesManagerByNumber (salesManagerNumber){
        for (int i = 0; i < salesManagersList.size(); i++) {
            SalesManager m = this.salesManagersList.get(i);
            if (salesManagerNumber==m.getSalesManagerNumber()){
                return  m;
            }
        }
        return  null;


    }

    public void setSumOfSales(int sum) {
        this.sumOfSales = this.sumOfSales + sum;
    }




}


}
