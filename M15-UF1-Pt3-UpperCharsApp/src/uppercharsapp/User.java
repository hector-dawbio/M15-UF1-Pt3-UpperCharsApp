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
    public String setName(String name) {
        this.name = name;
        return this.name;
    }
    //Methods
    public boolean isVowel(char c){
        if ((Character.toLowerCase(c)=='a') || (Character.toLowerCase(c)=='e') || (Character.toLowerCase(c)=='i') || (Character.toLowerCase(c)=='o') || (Character.toLowerCase(c)=='u'))
            return true;
        else return false;		        
    }
    /**
     * @author Hector
     * @param name
     * @return 
     */
    public int countlConsonant(String name){
        int counter=0;
        for(int x=0;x<name.length();x++) {
            if (!isVowel(name.charAt(x))){
                counter++;
            }      
        }       
	return counter;
    }
    /**
     * @author Marc
     * @param name
     * @return 
     */
    public int countlVowel(String name){
        int counter=0;
        for(int x=0;x<name.length();x++) {
            if (isVowel(name.charAt(x))){
                counter++;
            }      
        }       
	return counter;
    }
    /**
     * @author Hector
     * @param name to convert
     * @return name with vowel letters converted to capital letter
     */
    public String upperVowels(String name){
        int counter=0;
        for(int x=0;x<name.length();x++) {
            if (isVowel(name.charAt(x))){
                Character.toUpperCase(name.charAt(x));
            }      
        }       
	return name;
    }
    /**
     * This method con
     * @author Marc
     * @param name to convert
     * @return name with consonants converted to lowercase
     */
    public String lowerConsonants(String name){
        int counter=0;
        for(int x=0;x<name.length();x++) {
            if (!isVowel(name.charAt(x))){
                Character.toLowerCase(name.charAt(x));
            }      
        }       
	return name;
    }    
}
