package homeWork.Labs;

import java.util.Scanner;

public class Lab5 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // 1. Write a method to count the number of occurrences of the letter ‘a’ in a char array?
        // System.out.print("Enter a string: ");
        // String userString = scr.nextLine();
        // countingA(userString);

        // 2. Write a method to remove all white spaces from a char array?

        // System.out.print("Enter a String: ");
        // String string = scr.nextLine();
        // removeWhiteSpaces(string);

        // 3. Write a method to find duplicate characters in a char array?

        System.out.print("Enter a string: ");
        String usrString = scr.nextLine();
        findDupes(usrString);


        // 4. Write a method to display the words in reverse order.  “How are you” should be displayed “you are How”
        
        System.out.print("Enter a sentence: ");
        String uString = scr.nextLine();
        reverseWords(uString);




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

    public static void removeWhiteSpaces(String string) {

        // create a char array
        char[] arrChar = string.toCharArray();

        // count the white spaces
        int cnt = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == ' ') {
                cnt++; 
            }
        }
        // make new array with the index of the char array without the spaces
        char[] arrWithoutSpaces = new char[arrChar.length-1];

        int newCnt = 0;

        for (int i = 0; i < arrChar.length; i++) {
            if(arrChar[i] != ' ') {
                arrWithoutSpaces[newCnt] = arrChar[i];
                newCnt++;
            }
        }

        System.out.println(arrWithoutSpaces);

    }

    public static void findDupes(String uString) {

        int cnt = 0;
        char[] charArr = uString.toCharArray();

        for(int i = 0; i < charArr.length; i++) {

            for(int j = i + 1; j < charArr.length; j++) {

                if(charArr[i] == charArr[j]) {

                    cnt++;
                }
            }
            
        }
        System.out.println(cnt);
    }

    public static void reverseWords(String uString) {
        
        String[] arr = uString.split(" ", 0);
        String rev = "";

        for (int i = 0; i < arr.length; i++) {
            rev = arr[i] + " " + rev;
            
        }

        System.out.println(rev);
        

    }

}
