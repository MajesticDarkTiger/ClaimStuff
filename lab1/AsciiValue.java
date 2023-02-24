package homeWork.lab1;

import java.util.Scanner;

public class AsciiValue {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter a letter: ");
        char userChar = scr.nextLine().charAt(0);
        int asciiValue = userChar;
        System.out.println("The ASCII value of " + userChar + " is: " + asciiValue +  ".");

        scr.close();
    }

}

//5. Write a method to prompt the user for a letter of the alphabet and display it's ascii value.