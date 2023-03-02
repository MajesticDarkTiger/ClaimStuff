package homeWork.Labs.lab1;

import java.util.Scanner;

public class YearStuff {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter the year (like so yyyy): ");
        int year = scr.nextInt();
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

        if (leapYear == true) {
            System.out.println("It is a Leap Year! :D");
        } else {
            System.out.println("It is not a Leap Year! ;D");
        }

        scr.close();
    }

}



/*7. Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.

How to determine whether a year is a leap year
To determine whether a year is a leap year, follow these steps:

1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3 .If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days).

boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

       if (leapYear == true) {
        System.out.println("");
       }
       
       
       
       //year % 4 == 0 && year % 100 != 0 || year % 400 == 0

 */