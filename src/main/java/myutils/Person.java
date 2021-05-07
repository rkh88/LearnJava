package myutils;

public class Person {

    String name ;
    public static void main(String[] args) {
        Person p  = new Person();
        p.name = "Vasja";
        Person p1 = p;
        p1.name= "Petya";
        something(p1);
        System.out.println(p.name);
        int x = 5;
        int y = x;
        y = 8;
    }

    public static void something(Person p){
        p.name = "Alex";
    }
}
