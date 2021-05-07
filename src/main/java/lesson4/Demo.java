package lesson4;

public class Demo {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(max + 1);
        System.out.println(min - 1);
        char x = 'A';
        System.out.println(x);
        int y = x;//32 bit
        System.out.println(y);
        char c = (char)y;//8  bit
        System.out.println((char)(y  + 1));
        double d = 8.5; // 64 bit
        int u = (int)d;//32 bit
        if (u == 7){
            System.out.println("@");
        }
        if (c == 'A'){
            System.out.println("!");
        }
        String str = "Hello";
        if (str.equals("Hello")){
            System.out.println("Yes");
        }
    }

    public static void exp(int x, int p){


    }
}
