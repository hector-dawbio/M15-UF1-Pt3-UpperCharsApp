/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppercharsapp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author hector
 */
public class UpperCharsAppTest {
    static User user;    
    @Test 
    public void isVowelTest(){
        user = new User();
        assertTrue(user.isVowel('a'));
    }
    @Test
    public void countlConsonantTest(){
        user = new User();
        assertEquals(2, user.countlConsonant("casa"));
    }
    @Test 
    public void countlVowelTest(){
        user = new User();
        assertEquals(2, user.countlVowel("casa"));
    }
    @Test 
    public void upperVowelsTest(){
        user = new User();
        assertEquals("cAsA", user.upperVowels("casa"));
    }
    @Test 
    public void lowerConsonantsTest(){
        user = new User();
        assertEquals("cAsA", user.lowerConsonants("CASA"));
    }
}