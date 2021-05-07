package bank;

public class Customer extends Person {


    private Status status;

    public Customer(int id, String firstName, String lastName) {
        this(id, firstName, lastName, Status.GOOD);
    }

    public Customer(int id, String firstName, String lastName, Status status){
        super(id, firstName, lastName);
        this.status = status;

    }

}
