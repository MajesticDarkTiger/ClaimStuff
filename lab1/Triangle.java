package homeWork.lab1;

import java.util.Scanner;

public class Triangle {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the base width: "); 
        double baseWidth = scr.nextDouble();
        
        System.out.println("Enter the height: ");
        double height = scr.nextDouble();

        double area = .5 * (baseWidth * height);
        System.out.println("Area: " + area);
         
        scr.close();
    }

}


//area = 1/2 * base * height
//2. Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.