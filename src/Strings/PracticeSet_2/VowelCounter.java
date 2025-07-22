package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 6: Count Vowels in a Sentence
 *
 * Problem Statement:
 * Write a Java program that:
 * Prompts the user to enter a sentence.
 * Counts the total number of vowels in the sentence (both uppercase and lowercase).
 * Prints the count.
 */

public class VowelCounter {
    /*
    START
    Import Scanner package

    Display a greeting message to the user
    Create a Scanner object to prompt users
    Prompt the user to input a statement
    And read the user statement and store it in a variable

    Initialize a counter to zero
    Convert the statement to lowerCase

    Set an initial index to zero
    WHILE index is less than statement length
    DO:
        IF the character is equal to vowels THEN
            Increment the counter by 1
        Increment index by 1
    END WHILE
    Print the counts
    Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to VC Booth!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, enter your statement...");
        String userStatement = userInput.nextLine();

        int vowelCounter = 0;
        String convertStatementToLowerCase = userStatement.toLowerCase();

        int index = 0;
        while (index < userStatement.length()) {
            char currentChar = convertStatementToLowerCase.charAt(index);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCounter++;
            }
            index++;
        }
        System.out.println();
        System.out.println("Vowel count: " + vowelCounter);
        userInput.close();
    }
}