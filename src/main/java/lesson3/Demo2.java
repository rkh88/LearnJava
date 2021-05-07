package lesson3;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("Type a number. Press -1 for break ");
            i = sc.nextInt();
        }while (i != - 1);
    }
}
