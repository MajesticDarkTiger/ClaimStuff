package homeWork;

import java.util.Scanner;

public class Lab5 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // 1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?
        System.out.print("Enter a string: ");
        String userString = scr.nextLine();
        countingA(userString);

        // 2. Write a method to remove all white spaces from a char array?


        // 3. Write a method to find duplicate characters in a char array?


        // 4. Write a method to display the words in reverse order.  “How are you” should be displayed “you are How”
        





        scr.close();
    }
    
    public static void countingA(String uString) {
        // Write a method to count the number of occurrences of the letter ‘a’ in a char array?

        int aCount= 0;

        for (int i = 0; i < uString.length(); i++) {
            if (uString.charAt(i) == 'a') {
                aCount++;
            }
        }
        System.out.println(aCount);

    }




}
