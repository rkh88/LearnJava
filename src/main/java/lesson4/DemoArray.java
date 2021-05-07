package lesson4;

public class DemoArray {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 12;
        a[1] = -75;
        a[2] = 4;
        a[3] = 8;
        a[4] = 7;

        /*printArray(a);*/
        System.out.println("===============");
        /*int[] b = {-5, -1, -2, -8, -9, -2};
        shift(b);
        printArray(b);
        sumArray(a);
        System.out.println(findElement(a, 75));
        System.out.println(max(b));
        int x = 5;
        System.out.println("x = " + x);
        inc(x);
        System.out.println("x = " + x);
        int[][] m = {{4, 7, 7}, {3, 1, 9}, {9, 9, 8, 6}};
        printArray(m);
        System.out.println("===============");*/
        System.out.println(exponentiation(2, 5));
        System.out.println("===============");
        mark(1.0);
        System.out.println("===============");
        System.out.println(sumArrayOdd(a));
        System.out.println("===============");
        System.out.println(sumArrayOddIndex(a));
        System.out.println("===============");
        System.out.println(secondMax(a));
        System.out.println("===============");
        System.out.println(simpleNumberTrigger(a));
        System.out.println("===============");
        System.out.println(eratosfen(a));
        System.out.println("===============");

    }

    /*public static void printArray(int[][] k) {
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void inc(int[] k) {
        k[0] = k[0] + 1;
    }

    public static void inc(int k) {
        k = k + 1;
    }

    public static void shift(int[] k) {
        int last = k[k.length - 1];
        //  1 1 5
        for (int i = k.length - 1; i > 0; i--) {
            k[i] = k[i - 1];
        }
        k[0] = last;
    }


    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum" + sum);
    }

    public static boolean findElement(int a[], int b) {
        boolean result;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return true;
            }
        }
        return false;
    }

    public static int max(int[] b) {
        int mx = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > mx) {
                mx = b[i];
            }
        }
        return mx;
    }*/
    public static int exponentiation(int x, int p) {
        int expResult = x;
        for (int i = 2; i <= p; i++) {
            expResult = expResult * x;
        }
        System.out.println("Task 13");
        return expResult;

    }

    public static void mark(double x) {
        System.out.println("Task 14");
        int y = (int) x*10;
        switch (y) {

            case (10):
                System.out.println("38-40");
                break;
            case (13):
                System.out.println("36-37.5");
                break;
            case (17):
                System.out.println("34-35.5");
                break;
            case (20):
                System.out.println("32-33.5");
                break;
            case (23):
                System.out.println("30-31.5");
                break;
            case (27):
                System.out.println("28-29.5");
                break;
            case (30):
                System.out.println("26-77.5");
                break;
            case (33):
                System.out.println("24-25.5");
                break;
            case (37):
                System.out.println("22-23.5");
                break;
            case (40):
                System.out.println("20-215");
                break;
            case (50):
                System.out.println("0-19.5");
                break;
            default:
                System.out.println("Incorrect mark");;
                break;

        }

    }
    public static int sumArrayOdd(int a[]) {
        int sumArray = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sumArray = sumArray + a[i];
            }
        }
        System.out.println("Task 15.1");
        return sumArray;

    }

    public static int sumArrayOddIndex(int a[]) {
        int sumArrayIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sumArrayIndex = sumArrayIndex + a[i];
            }
        }
        System.out.println("Task 15.2");
        return sumArrayIndex;

    }

    public static int secondMax(int a[]){
        int frstMax = a[0];
        int scndMax=a[1];




        for (int i = 1; i < a.length;i++){
            if (a[i]>frstMax){
                scndMax = frstMax;
                frstMax = a[i];

            }
        }

        System.out.println("Task 15.3");
        return scndMax;
        }

    public static boolean simpleNumberTrigger(int a[]) {
        System.out.println("Task 16");
        boolean trigger = false;
        int frstMax = a[0];
        // 6 5 0 0 17 0
        for (int i = 1; i < a.length; i++) {
            if (a[i] > frstMax) {
                frstMax = a[i];
            }
        }

        for (int i = 2; i <= frstMax; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] != i) {
                    if (a[j] % i == 0) {
                        a[j] = 0;
                    }
                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                trigger = true;
            }
        }
        /*for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
            System.out.println("---");
        }*/


        return trigger;

    }

    public static int eratosfen(int[] a) {
        System.out.println("Task 17");
        int frstMax = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > frstMax) {
                frstMax = a[i];
            }
        }

        for (int i = 2; i <= frstMax; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] != i) {
                    if (a[j] % i == 0) {
                        a[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }


        }

        return frstMax;
    }


}