package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 6: Count Uppercase and Lowercase Letters
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter a sentence.
 * Counts how many uppercase letters (A–Z) are in the sentence.
 * Counts how many lowercase letters (a–z) are in the sentence.
 * Displays both counts separately.
 *
 * Sample Input:
 * Enter a sentence: Hello Java 101!
 *
 * Sample Output:
 * Uppercase letters: 2
 * Lowercase letters: 6
 */

public class UpLowCounter {
    /*
    START
    Import scanner package

        Display a welcome message to the user
        Create a Scanner object to request the user to input
        Ask the user to input a statement that they wish
        Read the inputted statement and store it in a variable

        Initialize two counter:
            One is upperCaseCounter and
            Another is lowerCaseCounter
        And set it to 0

         Set an index and initialize it to 0
         WHILE index < length of the statement
            DO:
                Get the character at position 'index'
                IF character is upper case THEN
                    Increment upper case counter
                ELSE IF character is lower case THEN
                    Increment lower case counter
                END IF
         Increment index by 1
         END WHILE

         Print the values of upperCaseCounter and lowerCaseCounter
        Close the scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Up Low Character Counter!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Kindly, type your statement: ");
        String userStatement = userInput.nextLine();

        int upperCaseCounter = 0;
        int lowerCaseCounter = 0;
        int statementLength = userStatement.length();

        int currentCharIndex = 0;
        while (currentCharIndex < statementLength) {
            char currentChar = userStatement.charAt(currentCharIndex);
            if (Character.isUpperCase(currentChar)) {
                upperCaseCounter++;
            } else if (Character.isLowerCase(currentChar)) {
                lowerCaseCounter++;
            }
            currentCharIndex++;
        }
        System.out.println("\nUppercase letters: " + upperCaseCounter);
        System.out.println("Lowercase letters: " + lowerCaseCounter);
        System.out.println();

        userInput.close();
    }
}
