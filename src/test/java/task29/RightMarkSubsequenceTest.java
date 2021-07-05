package task29;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RightMarkSubsequenceTest {

    @Test

    public void testRMS() {

        RightMarkSubsequence rms = new RightMarkSubsequence();
        assertTrue( rms.markProcedure("[]"));
        assertEquals(false, rms.markProcedure("[])"));
        assertEquals(false, rms.markProcedure("[)"));

    }
}
