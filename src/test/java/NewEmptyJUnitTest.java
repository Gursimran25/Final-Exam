/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author User
 */
public class NewEmptyJUnitTest {

     public NewEmptyJUnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

     @Test
    public void testCartSizeGood() {
        System.out.println("cartSize");
        int items = 1;
        boolean expResult = true;
        boolean result = PasswordValidator.validateLength(password);
        assertEquals(expResult, result, "Password does not have the min length required");
    }
     @Test
    public void testCartSizeBad() {
        System.out.println("cartSize");
        int items = 2.2;
        boolean result = PasswordValidator.validateLength(password);
        assertFalse( result, "Password does not have the min length required");   
    }

}