package homeWork.PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<People> phoneBook = new ArrayList<People>();
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        People fakePerson = new People("Micheal", "Edwards",
         1231231234L);
        phoneBook.add(fakePerson);
        People fakePerson2 = new People("Mike", "Alex", 
         3224115467L);
        phoneBook.add(fakePerson2);

        int choice;
        do {
            System.out.println("Welcome to the Phone Book!");
            System.out.println("What would you like to do?");
            System.out.println("1) Add a new entry");
            System.out.println("2) Search the phonebook");
            System.out.println("3) Delete a record by phone number");
            System.out.println("4) Update a given record");
            System.out.println("5) Sort by asc order");
            System.out.println("6) Exit");
            choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1:
                addANewEntry();
                break;
                case 2:
                searchThePhoneBook();
                break;
                case 3:
                deleteRecordByNumber();
                break;
                case 4:
                updateAGivenRecord();
                break;
                case 5:
                sortByAscOrder();
                break;
                case 6:
                exit();
                System.out.println("Thank you for your time!");
                break;
                case 6663:

                break;
            }

        
            } while (choice != 6663);

    }

    public static void addANewEntry() {
        People person = new People();

        System.out.println("What is your first name? ");
        String firstName = scr.nextLine();

        System.out.println("(Optional) What is your middle name? ");
        String middleName = scr.nextLine();

        System.out.println("What is your Last name? ");
        String lastName = scr.nextLine();

        Address address = createNewAddress(person);        

        System.out.println("What is your phone number (no special characaters)? ");
        Long phoneNumber = scr.nextLong();

        person.setFirstName(firstName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setPhoneNumber(phoneNumber);

        phoneBook.add(person);
    }

    public static Address createNewAddress(People person) {

        System.out.print("What is your APT/House number? ");
        int aptHouseNumber = scr.nextInt();

        System.out.print("What is your street name? ");
        String streetName = scr.nextLine();

        System.out.print("Which city do you live in? ");
        String city = scr.nextLine();

        System.out.print("Which state do you live in? ");
        String state = scr.nextLine();

        System.out.print("What is your zip code? ");
        String zipCode = scr.nextLine();


        Address address = new Address(aptHouseNumber, streetName, city, state, zipCode);
        return address;
    }

    public static void searchThePhoneBook() {

        boolean loopAgain = false;
        do {
            System.out.println("How would you like to search? ");
            System.out.println("1) Search by first name:");
            System.out.println("2) Search by last name:");
            System.out.println("3) Search by full name:");
            System.out.println("4) Search by phone number:");
            System.out.println("5) Search by city:");
            System.out.println("6) Search by state:");
            int choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1: // search by first name
                searchByFirstName();

                break;
                case 2: // search by last name
                searchByLastName();

                break;
                case 3: // search by full name
                searchByFullName();

                break;
                case 4: // search by phone number 
                searchByPhoneNumber();

                break;
                case 5: // search by city
                searchByCity();

                break;
                case 6: // search by state
                searchByState();

                break;

            }
        } while (loopAgain == true);


    }
    //
    public static void searchByFirstName() {

        System.out.println("Enter the first name: ");
        String firstName = scr.nextLine();
        for (People person : phoneBook) {
            if (firstName.equals(person.getFirstName())) {
                System.out.println(person);
            }

        }

    }
    public static void searchByLastName() {

        System.out.println("Enter the last name: ");
        String lastName = scr.nextLine();

    }
    public static void searchByFullName() {

        System.out.println("Enter the full name: ");
        String fullName = scr.nextLine();

    }
    public static void searchByPhoneNumber() {

        System.out.println("Enter the phone number: ");
        Long phoneNumber = scr.nextLong();

    }
    public static void searchByCity() {

        System.out.println("Enter the city: ");
        String city = scr.nextLine();

    }
    public static void searchByState() {

        System.out.println("Enter the state: ");
        String state = scr.nextLine();

    }
    //



    public static void deleteRecordByNumber() {

    }

    public static void updateAGivenRecord() {

    }

    public static void sortByAscOrder() {

    }

    public static void exit() {

    }


}
