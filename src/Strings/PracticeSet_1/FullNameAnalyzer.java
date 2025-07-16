package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 3: Full Name Analyzer
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter their first name and last name separately.
 * Concatenates both names to form a full name and prints it.
 * Displays the total length of the full name.
 * Prints the first character of the first name.
 * Checks if the first name is equal to "rana" (ignoring case),
 * and prints "Match found!" or "No match."
 */

public class FullNameAnalyzer {
    /*
    START
    Import scanner package

        Display a welcome message to the user
        Create a Scanner object for prompt the user
        Ask the user to input their first name
        Read the user inputted statement and set it in a variables
        Again, ask the last name to the user
        Read the user inputted statement and set it in another variables

        Concatenate the user inputted statement

        Print the full name
        Print the total length of fullName excluding spaces
        Print the first character of firstName using charAt(0)

        Convert firstName to lowercase and check if it equals "rana"
            IF yes THEN
                Print "Match found!"
            ELSE
                Print "No match!"
        Close the scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Name Analyzer Booth!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, Enter you full name!");
        System.out.print("First name: ");
        String firstName = userInput.next();
        System.out.print("Last name: ");
        String lastName = userInput.next();

        String fullName = firstName.concat(" ").concat(lastName);
        String nonSpaceFullName = fullName.replace(" " , "");
        int lengthOfFullName = nonSpaceFullName.length();
        char firstLetterOfFirstName = firstName.charAt(0);

        System.out.println("\nFull name is " + fullName);
        System.out.println("Total length of full name " + lengthOfFullName);
        System.out.println("First letter of first name is " + firstLetterOfFirstName);

        String firstNameToLowerCase = firstName.toLowerCase();
        if (firstNameToLowerCase.equals("rana")) {
            System.out.println("Match found!");
        } else {
            System.out.println("No match found!");
        }
        System.out.println();
        userInput.close();
    }
}













