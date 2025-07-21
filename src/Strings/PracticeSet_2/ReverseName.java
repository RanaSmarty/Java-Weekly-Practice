package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 6: Reverse Name Order
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter their full name (first and last name separated by a space).
 * Extracts the first and last names.
 * Reverses their order.
 */
public class ReverseName {
    /*
    START
    Import Scanner package

        Display a welcome to the user
        Create a Scanner object to prompt user
        Prompt the user to input their full name
        Read the user inputted full name and store it in a variable

        IF there is a space in the input (i.e., firstSpace > -1)
        AND
        there is no second space in the input (i.e., only one space exists)

        THEN
            Extract first name from index 0 to first space
            Extract second name from (first space + 1) to end of string
            Display: "Reversed name: [last name] [first name]"
        ELSE
            Display: "Invalid input! Please enter only first and last name."
        END IF
        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse World!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, enter your full name...");
        String fullName = userInput.nextLine();

        int firstSpace = fullName.indexOf(' ');

        if (firstSpace > -1 && fullName.indexOf(' ', firstSpace + 1) == -1) {
            String firstName = fullName.substring(0, firstSpace);
            String secondName = fullName.substring(firstSpace + 1);
            System.out.println();
            System.out.println("Reversed name: " + secondName.concat(" ").concat(secondName));
            System.out.println();
        } else {
            System.out.println("Invalid! Try again...");
        }
        System.out.println();
        userInput.close();
    }
}
