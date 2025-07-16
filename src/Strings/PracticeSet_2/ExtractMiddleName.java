package Strings.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem 5: Extract Middle Name (Optional Challenge)
 *
 * Problem Statement:
 *
 * Write a Java program that:
 * Prompts the user to enter their full name (first, middle, and last name — all separated by spaces).
 * Extracts and prints the middle name (the part between the first and second space).
 * If the input does not contain at least two spaces, print: "Middle name not found!"
 *
 * Sample Input:
 * Enter your full name: John Michael Doe
 *
 * Sample Output:
 * Middle name: Michael
 *
 * Requirements:
 * - Use only `indexOf()` and `substring()`
 * - No loops, no arrays, no split()
 */

public class ExtractMiddleName {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a Scanner object to ask the user
        Prompt the user to enter their full name (first, middle, last name — separated by spaces)
        Read the full name and store it in a variable

        Find the index of the first space using indexOf(' ')
        IF first space is -1 THEN
            Print "Middle name not found!"
            END

        ELSE IF
            Find the index of the second space using indexOf(' ', firstSpaceIndex + 1)
            IF second space not found (i.e., index is -1) THEN
                Print "Middle name not found!"
                END

            ELSE IF
                Extract middle name using substring from (firstSpaceIndex + 1) to (secondSpaceIndex)
                Print the middle name
        END IF

        Close the Scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Middle Name Extractor!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Kindly, type your full name: ");
        String full_Name = userInput.nextLine();

        int firstSpaceIndex = full_Name.indexOf(' ');
        if (firstSpaceIndex == -1) {
            System.out.println();
            System.out.println("Middle name not found..!");
        } else {
            int secondSpaceIndex = full_Name.indexOf(' ', firstSpaceIndex + 1);
            if (secondSpaceIndex == -1) {
                System.out.println("\nMiddle name not found..!");
            } else {
                String middleName = full_Name.substring(firstSpaceIndex + 1, secondSpaceIndex);
                System.out.println();
                System.out.println("Middle name is " + middleName);
            }
        }
        System.out.println();
        userInput.close();
    }
}
