package lesson1;

public class ClassB {

    public static void main(String[] args) {
        abs(4);
        abs(-7);
        square(5);

    }
    public static void abs(double x){
        if (x < 0) {
            x = -x;
        }
        System.out.println(x);
        //System.out.println(x < 0 ? -x : x);
    }
    public static void square(double r){
        System.out.println(3.14 * r*r);
    }
    public static void method1(int a, int b){
        if (a>b){
            System.out.println(true);

        } else {
            System.out.println(false);

        }


        //System.out.println(a - b > 0);
    }

}
