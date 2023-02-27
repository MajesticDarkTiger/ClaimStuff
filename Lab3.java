package homeWork;

import java.util.Scanner;


public class Lab3 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = scr.nextLine();
        System.out.print("Enter what character you wish to be removed: ");
        String letterRemove = scr.nextLine();
        char charToRemove = letterRemove.charAt(0);
        System.out.println(charToRemove);
        proccessOfRemoving(sentence, charToRemove);






        scr.close();
    }

    public static void proccessOfRemoving(String sentence, char charToRemove) {

        char[] charArrayOfSentence;
        charArrayOfSentence = sentence.toCharArray();
        
        for (int i = 0; i < charArrayOfSentence.length; i++) {
            if(charToRemove == charArrayOfSentence[i]) {
                charArrayOfSentence[i] = ' ';
            }
        }
        System.out.println(charArrayOfSentence);
    }
        

    public static void removeMultipleChar() {
            // Write a method to remove duplicate characters from a string.


    }

    public static void coutVowels() {
            // Write a method to count the number of vowels and consonants in a string. E.g. if the input is
            // Java the result should be 2 vowels and 2 consonants


    }

    public static void nonRepeatedAndRepeated() {
            // Write a method to display first non repeated character of a string then the repeating characters.
            // E.g. input morning should display morignn

    }


}
