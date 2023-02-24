package homeWork.lab1;

import java.util.Scanner;

public class CircleThingy {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        

        System.out.println("Enter the radius of the circle: ");
        int radius = in.nextInt();

        double circumference = (2 * Math.PI) * (radius);  
        double area = (Math.PI * (radius) * (radius));
        
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        in.close();


    }

}


/*1.	Write a method to prompt the user to enter the radius of the circle then calculate the area and circumference of the circle.

2. Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.

3. Write a method to prompt the user for a number then display check if the number is Even or Odd.
 */