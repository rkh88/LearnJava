package task28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayQueueTest {

    @Test

    public void testArrayQueue(){

        ArrayQueue<Integer> aq1 = new ArrayQueue<Integer>(3);
        aq1.enque(0);
        aq1.enque(1);
        aq1.enque(2);
        assertEquals(0, (int) aq1.dequeue());
        assertEquals(1, (int) aq1.getHead());
        assertEquals(2, (int) aq1.getTail());



    }

}
