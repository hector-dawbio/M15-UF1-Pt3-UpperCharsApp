/*
 * DESCOMENTAR CADA UNO DE LOS TEST PARAMETRIZADOS PARA PROBARLOS
 *
 */
package uppercharsapp;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hector
 */
@RunWith(value=Parameterized.class)
public class UpperCharsAppParametrizedTest {
    
    
    /**
     * 
     * DESCOMENTAR CADA UNO DE LOS TEST PARAMETRIZADOS PARA PROBARLOS
     * 
     */

    
    /*Parameterized Test isVowel()*/  
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List <Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{'a',true});
        obj.add(new Object[]{'e',true});
        obj.add(new Object[]{'t',false});
        return obj;
    }
    
    private char character;
    private boolean boolExp;
    
    public UpperCharsAppParametrizedTest (char character, boolean boolExp) {
        this.character=character;
        this.boolExp=boolExp;
    }
    
    @Test
    public void tsVowelTest() {
        User user=new User();
        boolean result =user.isVowel(character);
        assertEquals(boolExp, result);
    }
    /**/
    
    
    
    
    
    
    
    /*  Parameterized Test countlConsonant()
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List <Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{"aaaa",0});
        obj.add(new Object[]{"ffff",4});
        obj.add(new Object[]{"aserte",3});
        return obj;
    }
    
    private String name;
    private int counter;
    
    public UpperCharsAppParametrizedTest (String name,int counter) {
        this.name=name;
        this.counter=counter;
    }
    
    @Test
    public void countlConsonantTest(){
        User user=new User();
        int result =user.countlConsonant(name);
        assertEquals(counter, result);
    }
    */

    
    
    

    /*  Parameterized Test countlVowel()
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List <Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{"aaaa",4});
        obj.add(new Object[]{"ffff",0});
        obj.add(new Object[]{"aserte",3});
        obj.add(new Object[]{"abcdefghijklmnñopqrstuvwxyz",5});
        return obj;
    }
    
    private String name;
    private int counter;
    
    public UpperCharsAppParametrizedTest (String name,int counter) {
        this.name=name;
        this.counter=counter;
    }
    @Test 
    public void countlVowelTest(){
        User user=new User();
        int result =user.countlVowel(name);
        assertEquals(counter, result);
    }
    */
    
    
    
    
    
    
 
    /*  Parameterized Test lowerConsonants()
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
    List <Object[]> obj=new ArrayList<>();
    obj.add(new Object[]{"CASA","cAsA"});
    obj.add(new Object[]{"PERRO","pErrO"});
    obj.add(new Object[]{"CARPINTERO","cArpIntErO"});
    obj.add(new Object[]{"MURCIELAGO","mUrcIElAgO"});
    return obj;
    }
    
    private String name;
    private String modifiedName;
   
    public UpperCharsAppParametrizedTest (String name,String modifiedName) {
        this.name=name;
        this.modifiedName=modifiedName;
    }
    @Test 
    public void lowerConsonantsTest(){
        User user=new User();
        String result =user.lowerConsonants(name);
        assertEquals(modifiedName, result);
    }
    */
    
    
    
    
    
    
    
    
    
    /*  Parameterized Test upperVowels()
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
    List <Object[]> obj=new ArrayList<>();
    obj.add(new Object[]{"casa","cAsA"});
    obj.add(new Object[]{"perro","pErrO"});
    obj.add(new Object[]{"carpintero","cArpIntErO"});
    obj.add(new Object[]{"murcielago","mUrcIElAgO"});
    return obj;
    }
    
    private String name;
    private String modifiedName;
   
    public UpperCharsAppParametrizedTest (String name,String modifiedName) {
        this.name=name;
        this.modifiedName=modifiedName;
    }
    @Test 
    public void upperVowelsTest(){
        User user=new User();
        String result =user.upperVowels(name);
        assertEquals(modifiedName, result);
    }
    */

}
