package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 6: Reverse Name Order
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter their full name (first and last name separated by a space).
 * Extracts the first and last names.
 * Reverses their order.
 */
public class ReverseName {
    /*
    START
    Import Scanner package

        Display a welcome to the user
        Create a Scanner object to prompt user
        Prompt the user to input their full name
        Read the user inputted full name and store it in a variable

        Find the index of first space
        IF the index is more than -1 THEN
             Extract the last name using substring
             Extract the first name using substring

             Print the results
         ELSE
            Print an invalid message!
        END IF
        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse World!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, enter your full name...");
        String fullName = userInput.nextLine();

        int firstSpace = fullName.indexOf(' ');

        if (firstSpace > -1) {
            String firstName = fullName.substring(0, firstSpace);
            String secondName = fullName.substring(firstSpace + 1);
            System.out.println();
            System.out.println("Reversed name: " + secondName.concat(firstName));
            System.out.println();
        } else {
            System.out.println("Invalid! Try again...");
        }
        System.out.println();
        userInput.close();
    }
}
