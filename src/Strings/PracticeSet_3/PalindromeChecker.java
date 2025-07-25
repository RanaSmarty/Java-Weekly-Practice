package Strings.PracticeSet_3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Practice Problem 2: Palindrome Checker using StringBuilder
 *
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter a word.
 * Checks if the word is a palindrome using StringBuilder's reverse() method.
 * Prints "Palindrome" if the word is the same forwards and backwards.
 * Otherwise, prints "Not a palindrome".
 *
 */
public class PalindromeChecker {
    /*
    START
    Import Scanner package
    Display a welcome message to the user
    Create Scanner object to ask user
    Ask the user to input a word
    Read the word and store it in a variable

    Check empty input...
    IF statement is null or empty THEN
    Print invalid message
    Return
    END IF

    Convert original word to lowercase and store it in another variable
    Create a StringBuilder
    Reverse the StringBuilder
    Convert reversedSb back to string

    IF lowerCaseWord equals reversedWord THEN
    Display "It's a palindrome!"
    ELSE
    Display "Not a palindrome."

    Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\tWelcome to Palindrome World..!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, type a word you want to check...");
        String originalWord = userInput.nextLine();

        if (originalWord == null || originalWord.isEmpty()) {
            System.out.println("\nNo word provided!");
            return;
        }

        String lowerCaseWord = originalWord.toLowerCase();
        StringBuilder sbWord = new StringBuilder(lowerCaseWord);
        sbWord.reverse();
        String reversedWord = sbWord.toString();

        System.out.println();
        if (lowerCaseWord.equals(reversedWord)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
        System.out.println();
        userInput.close();
    }
}