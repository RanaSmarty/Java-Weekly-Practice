package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 4: Extract First and Last Name
 *
 * Problem Statement:
 *
 * Write a Java program that:
 * 1. Prompts the user to enter their full name (first name and last name, separated by a space).
 * 2. Extracts and prints the first name (everything before the space).
 * 3. Extracts and prints the last name (everything after the space).
 * 4. If the input doesn't contain a space, display an error message: "Invalid full name!"
 *
 * Sample Input:
 * Enter your full name: Rana Smarty
 *
 * Sample Output:
 * First name: Rana
 * Last name: Smarty
 *
 * Requirements:
 * - Use only `indexOf()` and `substring()` for extraction.
 * - No loops, no split(), no arrays.
 */

public class ExtractFirstAndLastName {
    /*
    START
    Import Scanner package

        Display a greeting message to the user
        Create a Scanner object to prompt users
        Request the user to input their full name
        Read the user inputted full name and store it in a variable

        Find the index of the space character (' ')

        IF the index is more than -1 THEN
            Extract the first name using substring
            Extract the last name using substring

            Print first name
            Print last name
        ELSE
            Print an Invalid message
        END IF

        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\t...Welcome to Name Extraction Booth...\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Kindly, type your full name: ");
        String fullName = userInput.nextLine().trim();

        int spaceIndex = fullName.indexOf(' ');

        if (spaceIndex > -1) {
            String firstName = fullName.substring(0 , spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);
            System.out.println();
            System.out.println("First name is " + firstName);
            System.out.println("Last name is " + lastName);
        } else {
            System.out.println("\nInvalid!");
        }
        System.out.println();
        userInput.close();
    }
}
