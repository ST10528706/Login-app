/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package loginApp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testValidRegistration() {
        Login login = new Login("John", "Doe");
        String result = login.registerUser("Jon_1", "Cb&&eec@ml77?", "+27638568976");
        assertEquals("User successfully registered.", result);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testInvalidUsername() {
        Login login = new Login("John", "Doe");
        String result = login.registerUser("JohnDoe", "Cb&&eec@ml77?", "+27638568976");
        assertTrue(result.contains("Username is not correctly formatted"));
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login.
     */
    @Test
    public void testInvalidPassword() {
        Login login = new Login("John", "Doe");
        String result = login.registerUser("Jon_1", "password", "+27638568976");
        assertTrue(result.contains("Password is not correctly formatted"));
       
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testInvalidCellPhone() {
        Login login = new Login("John", "Doe");
        String result = login.registerUser("Jon_1", "Cb&&eec@ml77?", "06966553");
        assertTrue(result.contains("cell number is incorrectly formatted"));
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testSuccessfulLogin() {
       Login login = new Login("John", "Doe");
       login.registerUser("Jon_1", "Cb&&eec@ml77?", "+27638568976");
       boolean result = login.loginUser("Jon_1", "Cb&&eec@ml77?");
       assertTrue(result);
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testFailedLogin() {
        Login login = new Login("John", "Doe");
        login.registerUser("Jon_1", "Cb&&eec@ml77?", "+27638568976");
        boolean result = login.loginUser("Jon_1", "wrongPassword");
        assertFalse(result);
    }
    
}
