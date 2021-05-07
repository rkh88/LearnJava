package game;

import java.util.Scanner;

public class TickTacToeGame {

    private Desk desk = new Desk();

    public void start() {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {

            String j;
            if (i % 2 != 0) {
                j = "X";
            } else {
                j = "O";
            }
            System.out.println("Enter number of place 1-9, " + j + "turn");
            int number = sc.nextInt() - 1;
            System.out.println(number + 1);
            if (desk.deskControl(number) == true) {
                desk.changeDeskStateX(number);
                desk.printState();
                System.out.println("Change token");
            } else {
                System.out.println("Space is not empty, enter another number");
                i = i - 1;
            }

        }


        if (desk.anybodyWonControl() == 0) {
            System.out.println("Nobody won");
        } else {
            if (desk.anybodyWonControl() == 1) {
                System.out.println("X won");
            } else {
                System.out.println("O won");
            }
        }
    }
}