package task25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvancedDllTest {


    @Test
    public void testAdvancedDll() {
        AdvancedDll<Integer> ll1 = new AdvancedDll<>();
        assertEquals(true, ll1.addFirst(1));
        assertEquals(true, ll1.addLast(2));
        assertEquals(1, ll1.removeFirst(1));
        assertEquals(2, ll1.removeLast(2));

    }
}
