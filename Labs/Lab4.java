package homeWork.Labs;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // 1. A and B
        // System.out.print("Enter a positive number: ");
        // int numberA = scr.nextInt();
        // System.out.print("Enter another posistive number: ");
        // int numberB = scr.nextInt();
        // sumOfInts(numberA, numberB);

        // 2. Squirrel play
        // System.out.print("Is it in the summer?(true or false) ");
        // boolean isSummer = scr.nextBoolean();
        // System.out.print("What is the temperate(F) outside? ");
        // int temperature = scr.nextInt();
        // squirrelPlay(isSummer, temperature);

        // 3. Lottery ticket

        // System.out.print("What is your first number? ");
        // int firstNumber = scr.nextInt();

        // System.out.print("What is your second number? ");
        // int secondNumber = scr.nextInt();

        // System.out.print("What is your third number? ");
        // int thirdNumber = scr.nextInt();
        // lotteryTicket(firstNumber, secondNumber, thirdNumber);

        // 4. count XX
        // Count the number of "xx" in the given string. We'll say that overlapping is
        // allowed, so "xxx" contains 2 "xx".

        System.out.println("Type a string and add some 'xx's' so that it can count them ");
        String userString = scr.nextLine();
        countXX(userString);

        // 5. Repeated String
        // Given a string and a non-negative int n, return a larger string that is n
        // copies of the original string

        System.out.println("Enter a string you want repeated: ");
        String repeatingString = scr.nextLine();

        System.out.println("Enter the amount you want it repeated: ");
        int amoutOfRep = scr.nextInt();
        repeatedString(repeatingString, amoutOfRep);

        scr.close();
    }

    public static void sumOfInts(int numberA, int numberB) {
        // Given 2 non-negative ints, a and b, return their sum, so long as the sum has
        // the same number of digits as a. If the sum has more digits than a, just
        // return a without b

        // add the two ints together
        // compare the new int to int a to see if it has more digits than int a or not

        int sumOfAAndB = numberA + numberB;
        int length = String.valueOf(sumOfAAndB).length();
        int lengthOfA = String.valueOf(numberA).length();
        // System.out.println(length);
        // System.out.println(lengthOfA);

        if (length > lengthOfA) {
            System.out.println(numberA);
        } else {
            System.out.println(sumOfAAndB);
        }

    }

    public static void squirrelPlay(boolean isSummer, int temperature) {
        // The squirrels in Palo Alto spend most of the day playing. In particular, they
        // play if
        // the temperature is between 60 and 90 (inclusive). Unless it is summer, then
        // the upper
        // limit is 100 instead of 90. Given an int temperature and a boolean isSummer,
        // return
        // true if the squirrels play and false otherwise

        if (isSummer == true) {
            if (temperature >= 60 && temperature <= 100) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            if (temperature >= 60 && temperature <= 90) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    }

    public static void lotteryTicket(int a, int b, int c) {
        // You have a green lottery ticket, with ints a, b, and c on it. If the numbers
        // are all different
        // from each other, the result is 0. If all of the numbers are the same, the
        // result is 20. If two
        // of the numbers are the same, the result is 10

        if (a == b && a == c) {
            System.out.println(20);
        } else if (a == b || a == c || b == c) {
            System.out.println(10);
        } else {
            System.out.println(0);
        }

    }

    public static void countXX(String userString) {
        // Count the number of "xx" in the given string. We'll say that overlapping is
        // allowed, so "xxx" contains 2 "xx".
        char xs = 'x';
        char[] charArrayOfUsrStrg = userString.toCharArray();
        int cnt = 0;
        for (int i = 0; i < userString.length()-1; i++) {
                if (charArrayOfUsrStrg[i] == xs) {
                    cnt++;
                }
        }
        System.out.println(cnt);
    }

    public static void repeatedString(String repeatingString, int n) {
        // Given a string and a non-negative int n, return a larger string that is n
        // copies of the original string

        String res = "";
        for (int i = 0; i < n; i++) {
            res = res + repeatingString;
        }
        System.out.println(res);

    }

}
