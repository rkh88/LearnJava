package task29;
import task25.*;
import task27.*;

public class RightMarkSubsequence {

    Stack<Character> st = new ListStack<Character>();
    private String s1 = "{";
    private String s2 = "(";
    private String s3 = "[";
    private String s11 = "}";
    private String s22 = ")";
    private String s33 = "]";

    public boolean markProcedure(String s){
        for (int i = 0; i < s.length(); i++) {
            if(st.isEmpty() == false){
                if (charAt(i).equals(s11) && st.peekLast().equals(s1) || charAt(i).equals(s22) && st.peekLast().equals(s2) || charAt(i).equals(s33) && st.peekLast().equals(s3)){
                    st.pollLast();
                }
            }
            if(s.charAt(i) == s1 || s.charAt(i) == s2 || s.charAt(i) == s3){
                st.push(s.charAt(i));

                }
            }
        return (st.isEmpty());
        }
    }
