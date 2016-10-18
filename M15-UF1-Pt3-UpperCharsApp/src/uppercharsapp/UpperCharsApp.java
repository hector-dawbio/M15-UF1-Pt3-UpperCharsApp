/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppercharsapp;
/**
 *
 * @author hector
 */
public class UpperCharsApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        String name="ANTONIO";
        //name = user.setName(name);
        System.out.println("Nombre: "+user.setName(name));
        System.out.println("N consonantes: "+user.countlConsonant(name));
        System.out.println("N vocales: "+user.countlVowel(name));
        System.out.println("Vocales Mayus: "+user.upperVowels(name));
        System.out.println("Consonantes Minus: "+user.lowerConsonants(name));
        
        // TODO code application logic here
    }
}
