package game;

public class Desk {

    private String[] tokens = new String[9];

    public Desk() {
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = " ";
        }
    }

    public void printState() {

        for (int i = 0; i < tokens.length; i++) {
            if ((i + 1) % 3 == 0) {
                System.out.print(tokens[i]);
                System.out.println();
                System.out.println("------");
            } else {
                System.out.print(tokens[i] + "|");
            }

        }


    }


    public void changeDeskState(int i) {
        if (i % 2 == 0) {
            tokens[i] = "X";
        } else {
            tokens[i] = "O";
        }
    }


    public boolean deskControl(int i) {
        boolean j = true;
        if (tokens[i] != " ") {
            j = false;
        }
        return j;
    }

    public int anybodyWonControl() {

        for (int i = 0; i < 7; i=i+3) {
            if (tokens[i]==tokens[i+1]&tokens[i+1]==tokens[i+2]&tokens[i]=="X") {
                return 1;
            } else {
                if (tokens[i]==tokens[i+1]&tokens[i+1]==tokens[i+2]&tokens[i]=="O")
                {
                    return-1;
                }

            }
        }

        for (int i = 0; i < 3; i++) {
            if (tokens[i]==tokens[i+3]&tokens[i+3]==tokens[i+6]&tokens[i]=="X") {
                return 1;
            } else {
                if (tokens[i]==tokens[i+3]&tokens[i+3]==tokens[i+6]&tokens[i]=="O")
                {
                    return-1;
                }

            }
        }

        if (tokens[0]==tokens[4]&tokens[4]==tokens[8]&tokens[0]=="X") {
            return 1;
        } else {
            if (tokens[0]==tokens[4]&tokens[4]==tokens[8]&tokens[0]=="O")
            {
                return-1;
            }

        }

        if (tokens[2]==tokens[4]&tokens[4]==tokens[6]&tokens[2]=="X") {
            return 1;
        } else {
            if (tokens[2]==tokens[4]&tokens[4]==tokens[6]&tokens[2]=="O")
            {
                return-1;
            }

        }

        return 0;
        }

    public int endControl (){

        for (int k = 0; k < 9; k++) {
            if (tokens[k] == " ") {
                return 1;
            }
        }
        return -1;
    }


    public boolean hasWinCombination() {
        return isVerticalWon() || isHorintalWon() || isDiagonalWon();
    }

    private boolean isHorintalWon() {
        return true;
    }

    private boolean isVerticalWon() {
        return true;
    }

    private boolean isDiagonalWon() {
        return true;
    }

    public boolean setToken(String currentToken, int number) {
        return true;
    }
}





