package homeWork.Labs.lab1;

import java.util.Scanner;

public class EvenCharacters {
    
    public static void main(String[] args) {
        
        System.out.print("What is the String: ->");

        Scanner scr = new Scanner(System.in);
        String myString = scr.nextLine();
        evenCharacters(myString);

        scr.close();

    }

    public static void evenCharacters(String myString) {
        for(int i = 0; i < myString.length(); i+=2) {
            System.out.println(myString.charAt(i));
        }

    }

}
