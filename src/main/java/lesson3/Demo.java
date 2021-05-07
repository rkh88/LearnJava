package lesson3;

public class Demo {

    public static void main(String[] args) {
        int x = 100;
        do{
            System.out.println("Hello");
            x++;
        } while (x<10);

        for(int i = 0, k = 1; i < 10 && k < 5; i++,  k = 2 * k ){

            System.out.println(i + " " + k);
        }
        for(int i = 0; i < 10; i++){}
    }
}
