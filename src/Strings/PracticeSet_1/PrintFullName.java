package Strings.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 1: Print Full Name
 *
 * Problem Statement:
 * Write a Java program that:
 * - Asks the user to enter their full name.
 * - Reads the input as a full line of text (not just a single word).
 * - Prints a greeting message using the name.
 *
 * Sample Input:
 * Enter your full name: Rana Smarty
 *
 * Sample Output:
 * Hello, Rana Smarty! Welcome to the String World.
 */

public class PrintFullName {
    /*
    START
    Import Scanner package

        Create a scanner object to prompt the user
        Ask the user to enter their full name
        Raed the user inputted full name and store it in a variable

        Write a greeting message and store it in another variable

        Display the user full name with greeting message!
    Close the Scanner to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        String fullName = userInput.nextLine();

        String greetWord = "Hey, ";
        String greetingMessage = "Welcome to the Java World!";

        System.out.println();
        System.out.println(greetWord + fullName + "! " + greetingMessage);

        userInput.close();
    }
}
