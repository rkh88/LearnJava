package lesson3;

public class Demo5 {

    public static void main(String[] args) {
      /*  int result = max(5,6);
        System.out.println("Max is " + result);
        method();

        int result2 = max(1,-7,12,15);
        System.out.println(result2);
        System.out.println(nds(100));
        System.out.println(date(12,5,2020));
        int a = Math.max(5,11);
        //String s = System.out.println("");
        String str = "Hello";
        System.out.println(str.toUpperCase());
*/
        sum1(-5,5);
        binar(25);
        sqrtMulti(5);
        euklid (100,48);

    }

    public static int max(int x, int y) {
        if (x > y) {
           return x;
        } else {
            return y;
        }
    }

    public static int max(int a, int b, int c, int d) {
        int max1 = max(a,b);
        int max2 = max(c,d);
        int max3 = max(max1, max2);
        return max3;

    }

    public static double nds(double  price){
        double nds = price*0.13;
        return nds;
    }

    public static void method(){
        int result = max(5,6);
        System.out.println("MAX is " + result);
    }

    public static String date(int day, int month, int year){
        //yyyy-mm-dd
        return year + "-" + month + "-" + day;
    }

    public static void sum1 (int a, int b){
        int sum = 0;
        int i=a;
        while (i <= b) {
            if (i>=0){
                sum = sum + i;
            } else {
                 sum= sum + (-i);
            }
            i++;
        }
        System.out.println(sum);

    }

    public static void binar(int a){
        int b;
        String result = "";
        while(a !=0){
            b = a % 2;
            result = b + result;
            a = a / 2;
        }
        System.out.println(result);

    }

    public static void sqrtMulti(int n) {
        double result1 = Math.sqrt(2);
        for (int i = 0; i<n; i++) {
            result1 = Math.sqrt(2+result1);

        }
        System.out.println(result1);

    }

        public static void euklid(int a,int b) {
            while (b !=0) {
                int temp = a%b;
                a = b;
                b = temp;
            }
            System.out.println(a);;
        }

}
