/*
 * Allyn Vo
 * CS 302
 * Date:
 * Assignment:
 */
package pkgfinal.task;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author allynvo
 */
public class CPasswordTest {
    
    public CPasswordTest() {
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
     * Test of character method, of class CPassword.
     */
    @Test
    public void testCharacter() {
        System.out.println("character");
        String password = "Abc123!";
        CPassword instance = new CPassword();
        boolean expResult = true;
        boolean result = instance.character(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of lower method, of class CPassword.
     */
    @Test
    public void testLower() {
        System.out.println("lower");
        String password = "Abc123!";
        CPassword instance = new CPassword();
        boolean expResult = true;
        boolean result = instance.lower(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of upper method, of class CPassword.
     */
    @Test
    public void testUpper() {
        System.out.println("upper");
        String password = "Abc123!";
        CPassword instance = new CPassword();
        boolean expResult = true;
        boolean result = instance.upper(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of digit method, of class CPassword.
     */
    @Test
    public void testDigit() {
        System.out.println("digit");
        String password = "Abc123!";
        CPassword instance = new CPassword();
        boolean expResult = true;
        boolean result = instance.digit(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of special method, of class CPassword.
     */
    @Test
    public void testSpecial() {
        System.out.println("special");
        String password = "Abc123!";
        CPassword instance = new CPassword();
        boolean expResult = true;
        boolean result = instance.special(password);
        assertEquals(expResult, result);

    }
    
}


