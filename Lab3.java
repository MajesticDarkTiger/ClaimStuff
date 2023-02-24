package homeWork;

import java.util.Scanner;

public class Lab3 {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your sentence here: -> ");
        String userString = scr.nextLine();
        System.out.print("Enter what letter you want to remove from the sentence(Ex.Aa): ");
        String charRemoving = scr.nextLine();
        removeCertainCharacter(userString, charRemoving);



        scr.close();
    }



    public static void removeCertainCharacter(String userString, String charRemoving) {
            // Write a method to remove a given character from a string. E.g. remove all 'Aa' from
            // Average should return verge (core logic only, no .replace or .replaceAll)
            // Set up an array that looks through the imputed string
        for(int i = 0; i < userString.length(); i++) {


        }


    }

}
