package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 3: Extract File Extension
 *
 * Problem Statement:
 * Write a Java program that:
 * Prompts the user to enter a filename (including the extension).
 * Extracts and prints the file extension (the part after the last dot '.').
 * If the filename does not contain a dot, print "Invalid filename!"
 *
 * Sample Input:
 * Enter a filename: resume.pdf
 *
 * Sample Output:
 * File extension: pdf
 */

public class ExtractFileExtension {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a Scanner object to prompt users
        Ask the user to enter a filename (including the extension)
        Read the user entered filename and store it in a variable

        Initialize a boolean flag to false
        Initialize a variable to store the position of dot (.) character and set it to -1 (false)

        Initialize an index to 0
        WHILE index is less than the length of filename with extension
            DO:
                Get the dot character at the current index
                    IF the character is 'dot (.)' THEN
                    Set the position variable to current index
                    Set the flag to true
                    Break the loop
                END IF
                Increment the index by 1
        END WHILE
        IF the flag is true THEN
            Create a new empty string variable to store the extension name

            Initialize another index to (dot index position + 1) → this means:
            Start from the character **right after** the dot

            WHILE the index is less than the total length of the filename
                DO:
                    Get the character at the current index
                    Append that character to the extension variable
            Increment the index by 1
        END WHILE
            Print the extracted extension name

        ELSE
            Print an "Invalid filename!" message to the user
        END IF
        Close the Scanner object to avoid resources leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("\tWelcome to Extension D-vider!");
        System.out.println();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, input your filename (including file extension): ");
        String filename = userInput.nextLine();

        boolean isPositionFound = false;
        int lastDotIndex  = -1;

        int extensionIndex = 0;
        while (extensionIndex < filename.length()) {
            char dotCharacter = filename.charAt(extensionIndex);
            if (dotCharacter == '.') {
                lastDotIndex = extensionIndex;
                isPositionFound = true;
                break; // Remove it when multiple extensions!
            }
            extensionIndex++;
        }
        if (isPositionFound && lastDotIndex < filename.length() - 1) {
            String extensionName = new String("");
            int extensionStart  = lastDotIndex + 1;
            while (extensionStart < filename.length()) {
                extensionName += filename.charAt(extensionStart);
                extensionStart++;
            }
            System.out.println();
            System.out.println("File extension is " + extensionName);
        } else {
            System.out.println();
            System.out.println("Invalid filename!");
        }
        System.out.println();
        userInput.close();
    }
}
