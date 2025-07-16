package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 5: Access Character at Index
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter a word.
 * Asks the user to enter an index number.
 * Checks if the index is valid (within the length of the word).
 * If valid, prints the character at that index using charAt().
 * If invalid, shows an error message like "Invalid index!"
 *
 * Sample Input:
 * Enter a word: Hello
 * Enter an index: 1
 *
 * Sample Output:
 * Character at index 1 is: e
 */

public class AccessCharAtIndex {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a Scanner object to prompt
        Request that the user input a statement or words for which wish to find
        Read the statement that was entered by the user and save it in a variable
        Ask the user to input an index number
        Read it adn store it in another variable

        IF the statement length is equal to the inputted index size THEN
            Print the character at that index
       ELSE
            Print an error message like "Invalid index!"

        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to SCharIn Booth!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, enter your statement or word...");
        String userStatement = userInput.nextLine();
        System.out.print("Now, enter your target index: ");
        int targetIndex = userInput.nextInt();

        int statementLength = userStatement.length();
        if (targetIndex >= 0 && targetIndex < statementLength) {
            char targetChar = userStatement.charAt(targetIndex);
            System.out.println("\nFound! The Character is '" + targetChar + "' at the index " + targetIndex);
        } else {
            System.out.println("Unfortunately, not found!");
        }
        System.out.println();
        userInput.close();
    }
}
