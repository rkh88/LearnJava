package demoobject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Person implements Cloneable {

    String name;
    int age ;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Vas";
        person.age = 34;
        System.out.println(person);


        Person person1 = new Person();
        person1.name = "Vas";
        person1.age = 34;
        //demo tostring
        System.out.println(person1);
//demo equals and hashcode
        System.out.println(person == person1);

        System.out.println(person.equals(person1));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(16);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Set<Person> set1 = new HashSet<>();
        set1.add(person);
        set1.add(person1);
        Iterator<Person> it1 = set1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }


        //demo clone
        try {
            Person p3 = (Person) person.clone();
            System.out.println("TEST " + p3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
/*
Если объекты равны  по существу, то у них должен быть одинаковый хеш-код.
Если у двух объектов одинаковый хеш-код, то это не значит, что объекты равны.


5 % 2 == 1
3 % 2 == 1
5 % 2 == 1
 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
