package core;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {


    @Test
    public void testDistance(){
        Line line = new Line(new Point(), new Point(1,0,0));
        assertEquals(1, line.length(),0.000000001);
    }


}
