package algo;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(fib(4));
    }

    public static int  sum(int n){
        if(n <= 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int fib(int n){
        if (n < 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
