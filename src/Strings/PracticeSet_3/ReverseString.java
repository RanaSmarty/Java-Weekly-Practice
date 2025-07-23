package Strings.PracticeSet_3;

import java.util.Scanner;

/**
 * Practice Problem 1: Reverse a String using StringBuilder
 *
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter a string.
 * Reverses the string using StringBuilder's reverse() method.
 * Prints the reversed string.
 */

public class ReverseString {
    /*
    START
    Import Scanner package
    Display a welcome message to the user
    Create Scanner object to ask users
    Prompt the user to input a statement
    Read the user inputted statement and store it in a variable

    Create a StringBuilder with the original string
    Use reverse method
    Convert back to String
    Print the reversed string
    Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Reversal World!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write a statement...");
        String originalStatement = userInput.nextLine();

        StringBuilder sbStatement = new StringBuilder(originalStatement);
        sbStatement.reverse();
        String reverseStatement = sbStatement.toString();
        System.out.println();
        System.out.println("Reversed statement: " + reverseStatement);
        userInput.close();
    }
}
