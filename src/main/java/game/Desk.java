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
            if ((i + 1) % 3 == 0){
                System.out.print(tokens[i]);
                System.out.println();
                System.out.println("------");
            } else {
                System.out.print(tokens[i] + "|");
            }

        }


    }


    public void changeDeskState(int i) {
        if (i % 2 == 0){
            tokens[i] = "X";}
        else {
            tokens[i] = "O";
        }
    }



    public boolean deskControl(int i) {
        boolean j = true;
        if (tokens[i] != " ") {
            j=false;
        }
        return j;
    }

    public int anybodyWonControl(){


        for (int k = 0; k < 9; k=k+3) {
            if (tokens[k]==tokens[k+1]&tokens[k+1]==tokens[k+2]&tokens[k]=="X"|tokens[k]==tokens[k+3]&tokens[k+3]==tokens[k+6]&tokens[k]=="X"|tokens[k]==tokens[k+4]&tokens[k+4]==tokens[k+8]&tokens[k]=="X"|tokens[k+2]==tokens[k+4]&tokens[k+4]==tokens[k+6]&tokens[k+2]=="X")
            {
               return 1;
            }
        }
        for (int l = 0; l < 9; l=l+3) {
            if (tokens[l]==tokens[l+1]&tokens[l+1]==tokens[l+2]&tokens[l]=="O"|tokens[l]==tokens[l+3]&tokens[l+3]==tokens[l+6]&tokens[l]=="O"|tokens[l]==tokens[l+4]&tokens[l+4]==tokens[l+8]&tokens[l]=="O"|tokens[l+2]==tokens[l+4]&tokens[l+4]==tokens[l+6]&tokens[l+2]=="O")
            {
                return -1;
            }
        }
        return 0;


    }



}