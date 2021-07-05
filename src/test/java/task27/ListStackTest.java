package task27;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListStackTest {

    @Test

    public void testListStack(){

        ListStack<Integer> ls1 = new ListStack<Integer>();
        ls1.push(0);
        ls1.push(1);
        ls1.push(2);
        assertEquals(2, ls1.pop());
        assertEquals(false, ls1.isEmpty());

    }



}
