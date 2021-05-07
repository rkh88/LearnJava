package game;

public class Desk {

    private String[] tokens = new String[9];

    public Desk() {
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = "";
        }
    }
    
    public void printState() {

        for (int i = 0; i < tokens.length; i++) { //доработать вывод
            if ((i + 1) % 3 == 0){
                System.out.print(tokens[i]);
            } else {
                System.out.print(tokens[i] + "|");
            }
            System.out.println();
            System.out.println("--+--+--");
        }


        System.out.println("Print desk");
    }


    public void changeDeskStateX(int i) {
        tokens[i] = "X";
    }

    public void changeDeskStateO(int i) {
        tokens[i] = "O";
    }

    public boolean deskControl(int i) {
        boolean j = true;
        if (tokens[i] != "") {
            j=false;
        }
        return j;
    }

    public int anybodyWonControl(){


        for (int i = 0; i < 9; i=i+3) {
            if (tokens[i]==tokens[i+1]&tokens[i+1]==tokens[i+2]&tokens[i]=="X"|tokens[i]==tokens[i+3]&tokens[i+3]==tokens[i+6]&tokens[i]=="X"|tokens[i]==tokens[i+4]&tokens[i+4]==tokens[i+8]&tokens[i]=="X"|tokens[i+2]==tokens[i+4]&tokens[i+4]==tokens[i+6]&tokens[i+2]=="X")
            {
               return 1;
            }
        }
        for (int i = 0; i < 9; i=i+3) {
            if (tokens[i]==tokens[i+1]&tokens[i+1]==tokens[i+2]&tokens[i]=="O"|tokens[i]==tokens[i+3]&tokens[i+3]==tokens[i+6]&tokens[i]=="O"|tokens[i]==tokens[i+4]&tokens[i+4]==tokens[i+8]&tokens[i]=="O"|tokens[i+2]==tokens[i+4]&tokens[i+4]==tokens[i+6]&tokens[i+2]=="O")
            {
                return -1;
            }
        }
        return 0;


    }



}