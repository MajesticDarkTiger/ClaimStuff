package homeWork.Labs;

import java.util.Scanner;


public class Lab3 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = scr.nextLine();
        System.out.print("Enter what character you wish to be removed (Ex. Aa): ");
        String letterRemove = scr.nextLine();
        char upperCase = letterRemove.charAt(0);
        char lowerCase = letterRemove.charAt(1);
        // char charToRemove = letterRemove.charAt(0);
        proccessOfRemoving(sentence, upperCase, lowerCase);

        System.out.print("Enter a word ");
        String newVowelCounter = scr.nextLine();
        coutVowels(newVowelCounter);

        System.out.print("Enter a word you would like to see which letter are repeated and not repeated: ");
        String newRepNotRep = scr.nextLine();
        nonRepeated(newRepNotRep);
        repeatedCharaters(newRepNotRep);



        scr.close();
    }

    public static void proccessOfRemoving(String sentence, char upperCase, char lowerCase) {

        char[] charArrayOfSentence;
        charArrayOfSentence = sentence.toCharArray();
        
        for (int i = 0; i < charArrayOfSentence.length; i++) {
            if(upperCase == charArrayOfSentence[i]) {
                charArrayOfSentence[i] = ' ';
            }
            if(lowerCase == charArrayOfSentence[i]) {
                charArrayOfSentence[i] = ' ';
            }
        }
        System.out.println(charArrayOfSentence);
    }
        

    

    public static void coutVowels(String newVowelCounter) {
            // Write a method to count the number of vowels and consonants in a string. E.g. if the input is
            // Java the result should be 2 vowels and 2 consonants
        newVowelCounter = newVowelCounter.toLowerCase();
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < newVowelCounter.length(); i++) {
            if (newVowelCounter.charAt(i) == 'a' || newVowelCounter.charAt(i) == 'e' || newVowelCounter.charAt(i) == 'i' || newVowelCounter.charAt(i) == 'o' || newVowelCounter.charAt(i) == 'u') {
                ++vCount;
            } else if (newVowelCounter.charAt(i) >= 'a' && newVowelCounter.charAt(i)<='z'){
                ++cCount;
            }
        }
        System.out.println("Number of Vowels: " + vCount);   
        System.out.println("Number of consonants: " + cCount);

    }

    public static void nonRepeated(String newRepNonRep) {
            // Write a method to display first non repeated character of a string then the repeating characters.
            // E.g. input morning should display morignn

           newRepNonRep = newRepNonRep.toLowerCase();
            for(char i :newRepNonRep.toCharArray()){
                if ( newRepNonRep.indexOf(i) == newRepNonRep.lastIndexOf(i)) {
                    System.out.print("Non-repeating characters are: "+ i);

                }

            }

    }
    public static void repeatedCharaters(String newRepNonRep) {

        char[] charArrayOfRep = newRepNonRep.toCharArray();
        int cnt = 0;
        System.out.println("Repeated characters are: ");
        for (int i = 0; i < newRepNonRep.length(); i++) {
            for (int j = i + 1; j < newRepNonRep.length(); j++) {
                if (charArrayOfRep[i] == charArrayOfRep[j]) {
                    System.out.print(charArrayOfRep[j] + ",");
                    cnt++;
                    break;
                }
            }
        }
    }
}
