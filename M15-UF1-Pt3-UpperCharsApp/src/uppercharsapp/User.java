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
     /**
      * This method returns true if it finds a vowel and false if not
      * @param c letter to compare with vowels
      * @return 
      */
    public boolean isVowel(char c){
        if ((Character.toLowerCase(c)=='a') || (Character.toLowerCase(c)=='e') || (Character.toLowerCase(c)=='i') || (Character.toLowerCase(c)=='o') || (Character.toLowerCase(c)=='u'))
            return true;
        else return false;		        
    }
    /**
     * This method counts the consonants and save them to counter variable
     * @author Hector
     * @param name
     * @return the consonant's counter
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
     * This method counts the vowels and save them to counter variable
     * @author Marc
     * @param name
     * @return vowel's counter
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
     * This method turns vowels(name) to capital letter
     * @author Hector
     * @param name to convert
     * @return name with vowel letters converted to capital letter
     */
    public String upperVowels(String name){
        String result="";
        char c;
        for(int x=0;x<name.length();x++) {
            if (isVowel(name.charAt(x))){
                c=Character.toUpperCase(name.charAt(x));
                result+=c;
            }
            else{
                c=name.charAt(x);
                result+= c;
            }
        }       
	return result;
    }
    /**
     * This method turns consonants(name) to lower case
     * @author Marc
     * @param name to convert
     * @return name with consonants converted to lowercase
     */
    public String lowerConsonants(String name){
        String result="";
        char c;
        for(int x=0;x<name.length();x++) {
            if (!isVowel(name.charAt(x))){
                c=Character.toLowerCase(name.charAt(x));
                result+=c;
            }
            else{
                c=name.charAt(x);
                result+=c;
            }
        }       
	return result;
    }    
}
