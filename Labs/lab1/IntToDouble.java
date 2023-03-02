package homeWork.Labs.lab1;

import java.util.Scanner;

public class IntToDouble {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int userInt = scr.nextInt();

        double conversion = userInt;
        System.out.println("You entered " + userInt + ", your new value is " + conversion + ".");

        scr.close();
    }

}

/* 4. Write a method to prompt the user for an Integer then display the same value 
with one decimal place. eg user enter "15 " result is: "You entered 15, the new value 
is 15.0". */