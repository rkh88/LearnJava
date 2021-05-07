package bank;

import myutils.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    @Test
    public void testAdd(){

        MyArrayList<Integer> myarraylist = new MyArrayList();
        int size =myarraylist.size();
        assertEquals(0, size);
        myarraylist.add(5);
        myarraylist.add(-7);
        myarraylist.add(0);
        int result = myarraylist.get(0);
        assertEquals( 5,  result);
        result = myarraylist.get(1);
        assertEquals(-7,result);
        result = myarraylist.get(2);
        assertEquals(0, result);
        size = myarraylist.size();
        assertEquals(3, size);

    }



}
