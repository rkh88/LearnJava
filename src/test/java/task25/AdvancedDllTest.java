package task25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdvancedDllTest {


    @Test
    public void testAdvancedDll() {
        AdvancedDll<Integer> ll1 = new AdvancedDll<Integer>();
        assertEquals(true, ll1.addFirst(1));// as alternative assertTrue(
        assertTrue( ll1.addLast(2));
        assertEquals(1, (int)ll1.removeFirst());
        assertEquals(2, (int)ll1.removeLast());

    }
}
