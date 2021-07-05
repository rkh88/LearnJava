package task28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListQueueTest {

    @Test

    public void testListQueue() {

        ListQueue<Integer> lq1 = new ListQueue<Integer>();
        lq1.enque(0);
        lq1.enque(1);
        lq1.enque(2);
        assertEquals(0, (int) lq1.dequeue());

    }


}
