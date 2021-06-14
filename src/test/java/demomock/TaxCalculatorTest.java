package demomock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {


    TaxBroker broker;


    @Before
    public void init() {
        broker = Mockito.mock(TaxBroker.class);
    }

    @Test
    public void getNdsTest(){

        TaxCalculator taxcal = new TaxCalculator(broker);
        Mockito.when(broker.getNds()).thenReturn(0.5);
        assertEquals(50,taxcal.getNds(100), 0.00000001);

    }


}
