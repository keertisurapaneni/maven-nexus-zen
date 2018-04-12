package com.learnmaven.mavendemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {
        assertEquals(10, new Calculator().add(5, 5));
    }
    
    public void testSubtract()
    {
        assertEquals(10, new Calculator().subtract(20, 10));
    }
    
    public void testDivide()
    {
        assertEquals(1.0, new Calculator().divide(5, 5));
    }
}
