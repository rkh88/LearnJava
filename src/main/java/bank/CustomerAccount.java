package bank;

import java.math.BigDecimal;

public class CustomerAccount {
    private int accountNumber;
    private Customer customer;
    private BigDecimal amount;

    public CustomerAccount(int accountNumber, Customer customer){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.amount = new BigDecimal(0);
    }

    public CustomerAccount(int accountNumber, Customer customer, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void printAccountInformation() {
        System.out.println(accountNumber + " " + amount);
    }
}
