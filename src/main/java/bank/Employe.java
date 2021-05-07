package bank;

public class Employe  extends Person {

    private int salary;

    public Employe(int id, String firstName, String lastName, int salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void printInformation() {
        System.out.println(id + " " + firstName + " " +
                lastName + " " + salary );

    }
}
