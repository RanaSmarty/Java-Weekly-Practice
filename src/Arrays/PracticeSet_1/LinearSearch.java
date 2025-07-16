package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem 6: Search for a Specific Element
 *
 * Problem Statement:
 * Write a Java program that:
 * - Asks the user to enter N integers.
 * - Stores them in an array.
 * - Asks the user to enter a number to search.
 * - Searches for the number in the array.
 * - If found, prints the index where it was found.
 * - If not found, prints a message saying "Not found".
 */

public class LinearSearch {
    /*
    START
        Display a welcome message to the user
        Ask the user to input total elements number
        Read inputted numbers and store it in a variable

        Create an array of size elementSize to store all number

        Set an initial index and initialize it to 0
        WHILE index < length of array
            DO:
                Ask the user to enter a number for the current element
                Read the entered number and store it at array[index]
                Increment index by 1
        END WHILE

        Set a boolean variable and init it to false
        Display message: Enter a number to search:

            DO:
                Ask the user to input a number that searches in the array
                Read the number and store in a variable.

                Set a boolean flag and init it to false

                Set a counter for occurrences and initialization to 0
                Set index to 0
                WHILE index < length of the array size
                    Do:
                        IF array[index] equals to finding number THEN
                            Set the flag to true
                        END IF
                        Increment the index by 1
                END WHILE

                IF the flag indicate to true THEN
                    Print: Total occurrences
                    Print: Number found at index
                Else
                   Print: Not found!
                END IF

    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Searching Station!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter total elements number: ");
        int elementSize = userInput.nextInt();

        int[] originalArray = new int[elementSize];

        int elementInputIndex = 0;
        while (elementInputIndex < originalArray.length) {
            System.out.print("Now, enter element " + (elementInputIndex + 1) + ": ");
            originalArray[elementInputIndex] = userInput.nextInt();
            elementInputIndex++;
        }
        System.out.print("Enter the number you're finding: ");
        int findingNumber = userInput.nextInt();

        int occurrence = 0;
        boolean isFound = false;

        int findingCurrentIndex = 0;
        while (findingCurrentIndex < originalArray.length) {
            if (originalArray[findingCurrentIndex] == findingNumber) {
                System.out.println();
                System.out.println("Your number found at " + findingCurrentIndex + " index!");
                isFound = true;
                occurrence++;
            }
            findingCurrentIndex++;
        }
        if (isFound) {
            System.out.println("Total occurrences " + occurrence);
        }
        if (!isFound) {
            System.out.println("Unfortunately, your number not found! \nTry again!");
        }

        System.out.println();
        userInput.close();
    }
}
