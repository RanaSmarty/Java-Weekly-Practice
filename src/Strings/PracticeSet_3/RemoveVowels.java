package Strings.PracticeSet_3;

import java.util.Scanner;

/**
 * Practice Problem 3: Remove Vowels from a String using StringBuilder
 *
 * Problem Statement:
 * Write a Java program that:
 * Prompts the user to enter a sentence.
 * Removes all vowels (a, e, i, o, u) — both uppercase and lowercase — from the sentence.
 * Prints the result after removing the vowels.
 */
public class RemoveVowels {
    /*
    START
    Import Scanner package
    Display a welcome message to the user
    Create a Scanner object to prompt users
    Prompt the user to enter a sentence
    Read the user inputted statement and store it in a variable

    Check empty input...
    IF statement is null or empty THEN
    Print invalid message
    Return
    END IF

    Initialize an empty string builder

    Set an initial index to 0
    WHILE index is less than the length of the statement
    DO:
        Get the character at the current index
        Convert the current character to lowercase
        IF the current character is equal to vowels index THEN
            Skip, do nothing
        ELSE
            Append the current character to string builder
        END IF
        Increment the index by 1
    END WHILE

    Convert Builder string to a final string
    Print the result

    Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\tWelcome to Vowel Removal Booth..!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, write your statement you want to remove vowels...");
        String originalStatement = userInput.nextLine();
        System.out.println();

        if (originalStatement == null || originalStatement.isEmpty()) {
            System.out.println("Input cannot be empty!");
            userInput.close();
            return;
        }

        StringBuilder stringStatement = new StringBuilder();

        int currentCharIndex = 0;
        while (currentCharIndex < originalStatement.length()) {
            char currentChar = originalStatement.charAt(currentCharIndex);
            char currentCharToLowerCase = Character.toLowerCase(currentChar);

            if ("aeiou".indexOf(currentCharToLowerCase) != -1) {
                // Skip
            } else {
                stringStatement.append(currentChar);
            }
            currentCharIndex++;
        }
        String convertToString = stringStatement.toString();
        System.out.println();
        System.out.println("Result without vowels: " + convertToString);
        System.out.println();
        userInput.close();
    }
}

