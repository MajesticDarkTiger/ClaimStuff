package homeWork.Labs.lab1;

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter a number here: ");
        int userInt = scr.nextInt();
        int remander = userInt %= 2;

        if (remander == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
          scr.close();  
        

    } 

}
