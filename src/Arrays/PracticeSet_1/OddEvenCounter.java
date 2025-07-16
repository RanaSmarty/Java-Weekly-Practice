package Arrays.PracticeSet_1;

import java.util.Scanner;
/**
 * Practice Problem: Count Even and Odd Numbers
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Counts and prints:
 * - The number of even elements.
 * - The number of odd elements.
 */

public class OddEvenCounter {
    /*
    START
        Display a welcome message to the user
        Ask the user to input total elements number
        Read the inputted number and store it in a variable

        Create an array to store all numbers

        Set an initial index and initialize  it to 0
        WHILE index < length of array
            DO:
                Ask the user to input number for each element
                Read entered number and store it at array[index]
                Increment index by 1
        END WHILE

        Initialize evenCount to 0
        Initialize oddCount to 0

        Set a new index and initialize it to 0
        WHILE index < length of array
            DO:
                IF array[index] % 2 == 0 THEN
                    Increment evenCount by 1
                ELSE
                    Increment oddCount by 1
                END IF
                Increment index by 1
        END WHILE

        Print The number of even elements.
        Print The number of odd elements.
    Close the scanner object to avoid resource leaks!
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Even and Odd Center!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter total element number: ");
        int elementSize = userInput.nextInt();

        int[] originalArray = new int[elementSize];

        int currentInputIndex = 0;
        while (currentInputIndex < originalArray.length) {
            System.out.print("Enter element " + (currentInputIndex + 1) + ": ");
            originalArray[currentInputIndex] = userInput.nextInt();
            currentInputIndex++;
        }

        int letEven = 0;
        int letOdd = 0;

        int checkIndex = 0;
        while (checkIndex < originalArray.length) {
            if (originalArray[checkIndex] % 2 == 0) {
                letEven++;
            } else {
                letOdd++;
            }
            checkIndex++;
        }
        System.out.println("\nNumber of even elements: " + letEven);
        System.out.println("Number of odd elements: " + letOdd);
        System.out.println();
        userInput.close();
    }
}