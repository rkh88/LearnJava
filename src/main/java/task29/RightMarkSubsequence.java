package task29;
import task25.*;
import task27.*;

public class RightMarkSubsequence {

    ListStack<Character> st = new ListStack<Character>();
    private char ob1 = '(';
    private char ob2 = '[';
    private char ob3 = '{';
    private char cb1 = ')';
    private char cb2 = ']';
    private char cb3 = '}';

    public boolean markProcedure(String s){
        for (int i = 0; i < s.length(); i++) {
            if(!st.isEmpty()){
                if (s.charAt(i) == cb1 && st.peekLast() == ob1 || s.charAt(i) == cb2 && st.peekLast() == ob2 || s.charAt(i) == cb3 && st.peekLast() == ob3){
                    st.pollLast();
                }
            }
            if(s.charAt(i) == ob1 || s.charAt(i) == ob2 || s.charAt(i) == ob3){
                st.push(s.charAt(i));

            }
        }
        return (st.isEmpty());
    }
}
