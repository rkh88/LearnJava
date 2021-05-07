package leson2;

public class DemoSum {

    public static void main(String[] args) {
        sum (5);
        sum (5, 10);
        sumOddNumber(5,10);
        sumSquare(5,10);
        System.out.println(5. / 2);
        printNumbersMod(-10);
        sumFact(20);
        /*
        int / int = int
        double / int = double
        int / double = double
        double / double = double
         */
    }

    public static void sum(int n){
        int i=0;
        int sum=0;
        while (i<=n) {
            sum = sum+ i;
            i=i+1;

        }
        System.out.println(sum);

    }
    public static void sum(int n, int m){
        int i=n;
        int sum=0;
        while (i<=m) {
            sum = sum + i;
            i=i+1;

        }
        System.out.println(sum);
    }

    public static void sumOddNumber(int n, int m){
        int i=n;
        int sum=0;
        while (i<=m) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
            i = i + 1;
        }
        System.out.println(sum);
    }

    public static void sumSquare(int n, int m){
        int i=n;
        int sum=0;
        while (i<=m) {
            sum = sum + i;
            i=i+1;

        }
        if (sum % 3 ==0) {
            sum=sum*sum;

        } else {
            if (sum % 3 ==1) {
                sum= sum*sum*sum;
            }

        }

        System.out.println(sum);
    }

    public static void printNumbersMod(int x) {
        int start = 0;
        int finish = x;
        if (x < 0){
            start = x;
            finish = 0;
        }
        int i = start;
        while (i < finish) {
            System.out.println(i);
            i++;
        }
        /*if (x>0) {
            while (i < x) {
                System.out.println(i);
                i = i + 1;
            }
        } else {
            while (i < -x+1) {
                System.out.println(x+i);
                i = i + 1;
            }


        }*/

    }

    public static void sumFact(int k) {
        double sum=0;
        int fact =1;

        for (int n=1;n<k; n++) {
            sum = sum + 1. / fact;
            fact = fact * n;
        }
        System.out.println(sum);
    }


}
