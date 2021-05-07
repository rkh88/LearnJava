package lesson1;

public class DemoMethods {

    public static void main(String[] args) {
        hello();
        hello();
        hello();
        hello();
        hello();
        hello();
        hello();
        hello("Robert");
        hello("M");
        max(1, 10);
        printTenTimes();
    }

    public static void hello(){
        System.out.println("Hello");
    }

    public static void hello(String name){
        System.out.println("Hello, " + name);
    }

    public static void printTenTimes() {
        int i = 0;
        while (i<10){
            System.out.println("Это строка");
            i = i+1;//i++
        }


    }

    public static void max(int x, int y) {
       // System.out.println("Algorithm for searching max between" + x + " and "+ y );
        if (x>y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        //System.out.println(String.format("Algorithm for searching max between %d and %d ", x,y ));
    }

    public static void max(double x, double y) {
        System.out.println("Algorithm for searching max between" + x + " and "+ y + "!!!!!");
    }
}
