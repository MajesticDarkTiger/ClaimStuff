package homeWork;

import java.util.Scanner;

public class Lab2 {
    
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        //max, min, middle
        // System.out.print("Enter your first number: ->");
        // int numberOne = scr.nextInt();
        // System.out.print("Enter your second number: ->");
        // int numberTwo = scr.nextInt();
        // System.out.print("Enter your third number: ->");
        // int numberThree = scr.nextInt();
        
        //xor
        //System.out.print("Enter your first boolean: -> ");
        //boolean bool = scr.nextBoolean();
        // System.out.print("Enter your next boolean: -> ");
        // boolean boolTwo = scr.nextBoolean();

        //factor
        // System.out.print("Enter a number you would like to get a factor of: -> ");
        // int factorOne = scr.nextInt();
        // System.out.print("Enter a number you wish to know if it's a factor of " + factorOne + " here: -> ");
        // int factorTwo = scr.nextInt();

        //perfect
        System.out.println("Enter a number to see if it's a perfect number: ");
        int perfectNum = scr.nextInt();
    




        //prime
        System.out.println("Enter a number to see if it's a prime number: ");
        int primeNum = scr.nextInt();





        scr.close();
        // max3(numberOne, numberTwo, numberThree);
        // min3(numberOne, numberTwo, numberThree);
        // middle3(numberOne, numberTwo, numberThree);
        //xor(bool, boolTwo);
        //isFactor(factorOne, factorTwo);
        isPerfect(perfectNum);
        isPrime(primeNum);
    }

    public static void max3(int numberOne, int numberTwo, int numberThree) {
        //Write a method called "max3" that finds the largest of THREE integers.

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("The max number you entered is: " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("The max number you entered is: " + numberTwo);
        } else {
            System.out.println("The max number you entered is: " + numberThree);
        }


    }

    public static void min3(int numberOne, int numberTwo, int numberThree) {

        if (numberOne < numberTwo && numberOne < numberThree) {
            System.out.println("The minimun number you entered is: " + numberOne);
        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            System.out.println("The minimun number you entered is: " + numberTwo);
        } else {
            System.out.println("The minimun number you entered is: " + numberThree);
        }

    }

    public static void middle3(int numberOne, int numberTwo, int numberThree) {

        if ((numberOne < numberTwo && numberOne < numberThree) || (numberThree < numberTwo && numberTwo < numberOne)) {
            System.out.println("The middle of the numbers you entered is: " + numberTwo);
        } else if ((numberTwo < numberOne && numberOne < numberThree) || (numberThree < numberOne && numberOne < numberTwo)) {
        System.out.println("The middle of the numbers you entered is: " + numberOne);
        } else {
            System.out.println("The middle of the numbers you entered is: " + numberThree);
        }

    }

    public static void xor(boolean bool, boolean boolTwo) {
             /*4.	Write a method called "xor" that takes two boolean values (either true or false) and
             returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them.
             This is called the "xor" function, or "eXclusive OR" (where we are excluding the case where both
             values are true). */

        if (bool == boolTwo) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
        
    }
    
    public static boolean isFactor(int factorOne, int factorTwo) {
    //     /*5.	Write a method "isFactor" which takes two integers (k and n) and returns true
    //      if ("if and only if") k is a factor of n. */

        if (factorOne % factorTwo == 0) {
             //System.out.println("True");
             return true;
        } else {
           // System.out.println("False");
            return false;
        }

    }

    public static void isPerfect(int perfectNum) {
                /* Write a method "isPerfect" which takes an integer and returns true if that integer is
                 a perfect number Your method MUST call the "isFactor" method you wrote for problem #5. */
        int totalFactors = 0;
        for(int i = 1; i < perfectNum; i++) {
            if (isFactor(perfectNum, i)) {
            totalFactors += i;
            }
        }

        if(totalFactors == perfectNum) {
            System.out.println("It's a perfect number!");
        } else {
            System.out.println("It is not a perfect number :(");
        }
         

        
    }

    public static void isPrime(int primeNum) {
                // Write a method "isPrime" which takes an integer and returns true if it is a prime number.
                // Your method MUST call the "isFactor" method you wrote for problem #5
        
        for(int i = 2; i < primeNum; i++ ) {
            if (isFactor(primeNum, i)) {
                System.out.println("It's not a prime!");
            } else {
                System.out.println("It is a prime!");  
            }
        }
            
        
        
    }

}
