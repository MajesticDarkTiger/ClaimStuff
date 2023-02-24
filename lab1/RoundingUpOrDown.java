package homeWork.lab1;

import java.util.Scanner;

public class RoundingUpOrDown {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter your double number: ");
        float userFloat = scr.nextFloat();
        int userRound = Math.round(userFloat);
        
        System.out.println("Your entered " + userFloat + ", your new value is: " + userRound + ".");
        

        scr.close();

    }

}

/*6. Write a method to prompt the user for a double then display the value as a whole number.
 eg user enter "15 .8" result is: "You entered 15.8, the new value is 16". eg user enter "15 .4"
  result is: "You entered 15.4, the new value is 15". */