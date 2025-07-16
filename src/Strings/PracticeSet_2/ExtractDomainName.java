package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 2: Extract Domain from Email
 *
 * Problem Statement:
 * Write a Java program that:
 * Prompts the user to enter their email address.
 * Extracts and prints the domain part (everything after the '@' symbol).
 * If the email does not contain '@', print "Invalid email address!"
 *
 * Sample Input:
 * Enter your email: ranasmarty00@gmail.com
 *
 * Sample Output:
 * Domain: gmail.com
 */

public class ExtractDomainName {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a Scanner object to prompt the user
        Request the user to input their email address
        Read the user inputted email address and store it in a variable

        Initialize a boolean flag to false
        Initialize a variable to store the position of special character '@' and set it to -1 as default false

        Initialize an index to 0
        WHILE index is less than length of email address
            DO:
                Get the special character at the current index
                IF the character is '@' THEN
                    Set the position variable to current index
                    Set the flag to true
                    Break the loop
                END IF
                Increment index by 1
        END WHILE
        IF flag is true THEN
            Create an empty string variable to store domain name
            Initialize an index to the position of special character
            WHILE index is less than length of email address
                DO:
                    Add the character at the current index to domain name variable
                    Increment index by 1
            END WHILE
            Print the domain name!
        ELSE
            Print an Invalid message!
        END IF
        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\tWelcome to Domain Extractor..!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly, enter your email address: ");
        String emailAddress = userInput.nextLine();

        int lengthOfEmailAddress = emailAddress.length();
        int specialCharacterPosition = -1;
        boolean isPositionFound = false;

        int specialCharacterIndex = 0;
        while (specialCharacterIndex < lengthOfEmailAddress) {
            char specialCharacter = emailAddress.charAt(specialCharacterIndex);
            if (specialCharacter == '@') {
                specialCharacterPosition = specialCharacterIndex;
                isPositionFound = true;
                break;
            }
            specialCharacterIndex++;
        }
        if (isPositionFound) {
            String domainName = new String("");
            int domainStartIndex = specialCharacterPosition + 1;
            while (domainStartIndex < lengthOfEmailAddress) {
                domainName += emailAddress.charAt(domainStartIndex);
                domainStartIndex++;
            }
            System.out.println();
            System.out.println("Domain: " + domainName);
        } else {
            System.out.println("\nInvalid email address!");
        }
        System.out.println();
        userInput.close();
    }
}
