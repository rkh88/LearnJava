package task28;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayQueueTest {

    @Test

    public void testArrayQueue(){

        ArrayQueue<Integer> aq1 = new ArrayQueue<Integer>(3);
        aq1.enque(0);
        aq1.enque(1);
        aq1.enque(2);
        assertEquals(0, aq1.deque());
        assertEquals(1, aq1.getHead());
        assertEquals(2, aq1.getTail());



    }

}
