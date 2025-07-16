package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 1: Extract Username from Email
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter their email address.
 * Extracts and prints the username part (everything before the '@' symbol).
 *
 * Sample Input:
 * Enter your email: ranasmarty00@gmail.com
 *
 * Sample Output:
 * Username: ranasmarty00
 */

public class ExtractUsername {
    /*
    START
    Import Scanner package

        Display a welcome message
        Create a Scanner object to prompt the user
        Ask the user to enter their email address
        Read the user inputted values and store the email in a variable

        Calculate email address length and store it in variable
        Initialize a boolean flag to false
        Initialize a variable to store the position of special character '@' and set it to -1

        Initialize an index to 0
        WHEN index is less than the length of email address
            DO:
                Get the character at the current index
                IF the character is '@' THEN
                    Set the position variable to current index
                    Set the flag to true
                    Break the loop
                END IF
                Increment the index by 1
        END WHEN

        IF flag is true THE
            Create a new empty string variable to store username
            Initialize an index to 0
            WHILE index is less than position of special character '@'
                DO:
                    Add the character at current index to username
                    Increment index by 1
            END WHILE
            Print  the username
        ELSE
            Print the invalid message!
        END IF

        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\tWelcome to EEC!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Kindly, type your email address: ");
        String emailAddress = userInput.nextLine();

        int emailAddressLength = emailAddress.length();
        boolean isPositionFound = false;
        int specialCharPosition = -1;

        int specialCharIndex = 0;
        while (specialCharIndex < emailAddressLength) {
            char specialChar = emailAddress.charAt(specialCharIndex);
            if (specialChar == '@') {
                specialCharPosition = specialCharIndex;
                isPositionFound = true;
                break;
            }
            specialCharIndex++;
        }
        if (isPositionFound) {
            String username = new String("");
            int usernameEndIndex = specialCharIndex;
            int usernameCurrentIndex = 0;
            while (usernameCurrentIndex < usernameEndIndex) {
                username += emailAddress.charAt(usernameCurrentIndex);
                usernameCurrentIndex++;
            }
            System.out.println();
            System.out.println("Username: " + username);
        } else {
            System.out.println("Invalid email!");
        }
        System.out.println();
        userInput.close();
    }
}






