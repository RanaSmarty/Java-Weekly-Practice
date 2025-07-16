package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 2: Count Total Characters
 *
 * Problem Statement:
 * Write a Java program that reads a line of text from the user
 * and counts how many characters are in it (excluding spaces).
 *
 * Sample Input:
 * Enter a sentence: I love Java programming!
 *
 * Sample Output:
 * Total characters (excluding spaces): 23
 */

public class CharacterCounter {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a scanner object to prompt something to the user
        Request that the user input a statement for which they wish to count the characters
        Read the statement that was entered by the user and save it in a variable.

        Remove all spaces from the user's sentence and store it in a variable
        Count the length of the new statement (without spaces)

        Print the length of this statement!

    Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Characters Counter Station!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Kindly type your statement here: ");
        String statement = userInput.nextLine();

        String nonSpaceStatement = statement.replace(" ", "");
        System.out.println();
        System.out.println("Total characters (excluding spaces): " + nonSpaceStatement.length());
        System.out.println("Total characters (including spaces): " + statement.length());

        userInput.close();
    }
}
