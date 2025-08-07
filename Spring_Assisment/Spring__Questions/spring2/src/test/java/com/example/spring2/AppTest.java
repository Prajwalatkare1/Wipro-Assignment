package com.example.spring2;

import java.util.Scanner;

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
//	
//	 Scanner scanner = new Scanner(System.in);
//
//     System.out.println("==================================");
//     System.out.println("    AUTOWIRED ANNOTATION DEMO    ");
//     System.out.println("==================================");
//     System.out.println("Options:");
//     System.out.println("1. Autowired");
//     System.out.println("2. Autowired with Qualifier");
//     System.out.print("Select option: ");
//     int option = scanner.nextInt();
//	
//	
	
	
	
	
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
    public void testApp()
    {
        assertTrue( true );
    }
}
