package test;

import junit.framework.TestCase;
import mypackage.MyConcatenator;

public class HelloTest extends TestCase{

    
    public void testConcatenate(){
        String concatenated =
                MyConcatenator.concatenate(
                        "one", "two", "three", "four");

       assertEquals("one,two,three,four", concatenated);
    }
    
}