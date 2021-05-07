package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {

    Calculator calculator;

    @Before
    public void init(){
         calculator = new Calculator();
    }


    @Test
    public void testSum(){
        assertEquals(4, calculator.sum(2,2));
    }


    @Test
    public void testSum1(){
        assertEquals(4.5, calculator.sum(2.5,2.0),0.000001 );

    }
}
