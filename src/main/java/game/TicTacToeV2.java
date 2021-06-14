package game;

import java.util.Scanner;

public class TicTacToeV2 {

    Desk desk = new Desk();

    String currentToken = "X";
    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter the number");
            int number = sc.nextInt();
            if(desk.setToken(currentToken, number)){
                switchToken();
            }
            desk.printState();
            if(isWon()){
                break;
            }
        }
    }

    private boolean isWon() {
        return desk.hasWinCombination();
    }

    private void switchToken() {
        if(currentToken.equals("X")){
            currentToken = "O";
        } else {
            currentToken = "X";
        }
    }
}
