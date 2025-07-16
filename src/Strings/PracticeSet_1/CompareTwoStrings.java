package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 4: Compare Two Strings
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter two different strings.
 * Compares them using equals() for exact match (case-sensitive).
 * Compares them using equalsIgnoreCase() for case-insensitive match.
 * Displays both results clearly to the user.
 *
 * Sample Input:
 * Enter first string: Java
 * Enter second string: java
 *
 * Sample Output:
 * Case-sensitive match: false
 * Case-insensitive match: true
 */

public class CompareTwoStrings {
    /*
    START
    Import scanner package

        Display a greeting message to the user
        Create a Scanner object to prompt the user
        Ask the user to input their first string
        Read the user inputted string and store it in a variable
        Again, ask the user to input their second string
        Read it too and store it in another variable

        Compare first string and second string using equals method
        Store result in a variable name isCaseSensitive
        Again compare first string and second string using equalsIgnoreCase method
        Store result in isCaseInSensitive

        Print both results with proper labels
        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Comparison World!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter your strings one by one...");
        System.out.print("First string: ");
        String firstString = userInput.nextLine();
        System.out.print("Second string: ");
        String secondString = userInput.nextLine();

        boolean isCaseSensitive = firstString.equals(secondString);
        boolean isCaseInsensitive = firstString.equalsIgnoreCase(secondString);

        System.out.println("\nCase-sensitive match: " + isCaseSensitive);
        System.out.println("Case-insensitive match: " + isCaseInsensitive);

        System.out.println();
        userInput.close();
    }

}
