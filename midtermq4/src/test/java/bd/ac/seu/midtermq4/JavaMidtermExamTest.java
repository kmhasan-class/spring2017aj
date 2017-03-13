/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.midtermq4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kmhasan
 */
public class JavaMidtermExamTest {
    
    public JavaMidtermExamTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSquaredSum method, of class JavaMidtermExam.
     */
    @Test
    public void testGetSquaredSumWithEmptyList() {
        System.out.println("getSquaredSum");
        ArrayList<Integer> numbersList = new ArrayList<>();
        JavaMidtermExam instance = new JavaMidtermExam();
        int expResult = 0;
        int result = instance.getSquaredSum(numbersList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(timeout = 10)
    public void testGetSquaredSumWithSingleEntry() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaMidtermExamTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("getSquaredSum");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(15);
        JavaMidtermExam instance = new JavaMidtermExam();
        int expResult = 225;
        int result = instance.getSquaredSum(numbersList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
