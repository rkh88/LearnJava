package task25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DllTest {

    @Test

    public void testDll() {
            Dll<Integer> ll1 = new Dll<>();
            assertEquals(false, ll1.add(null));
            int int1 = 1;
            int int2 = 2;
            int int3 = 3;
            int int4 = 4;
            int int5 = 5;
            ll1.add(int1);
            ll1.add(int2);
            ll1.add(int3);
            assertEquals(true, ll1.add(int4);
            assertEquals(true, ll1.add(4, int5));
            Dll<Integer> ll2 = new Dll<>();
            int int6 = 6;
            int int7 = 7;
            ll2.add(int6);
            ll2.add(int7);
            assertEquals(true, ll1.add(ll2));
            assertEquals(true, ll1.add(0, ll2));
            int int8 = 8;
            assertEquals(true, ll1.remove(1));
            assertEquals(false, ll1.remove(8));
            assertEquals(true, ll1.removeByIndex(0));



    }

}
