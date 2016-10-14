/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppercharsapp;

/**
 * That program converts the vowel to capital letter and consonant to lowercase and count both
 * @author marc &hector
 */
public class User {
    private String name;
    //Constructros
    public User(){}
    public User(String name){
        this.name=name;
    }
    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Methods
    /**
     * @author Hector
     * @param name
     * @return 
     */
    public int countlConsonant(String name){
        return 1;
    }
    /**
     * @author Marc
     * @param name
     * @return 
     */
    public int countlVowel(String name){
        return 1;
    }
    /**
     * @author Hector
     * @param name to convert
     * @return name with vowel letters converted to capital letter
     */
    public String upperVowels(String name){
        return "Probando";
    }
    /**
     * This method con
     * @author Marc
     * @param name to convert
     * @return name with consonants converted to lowercase
     */
    public String lowerConsonants(String name){
        return "";
    }    
}
