package task27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayStackTest {

    @Test

    public void testArrayStack() {

        ArrayStack<Integer> as1 = new ArrayStack<Integer>(3);
        as1.push(0);
        as1.push(1);
        as1.push(2);
        assertEquals(2, (int)as1.pop());
        assertEquals(false, as1.isEmpty());

    }

}
