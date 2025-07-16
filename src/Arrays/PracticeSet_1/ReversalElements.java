package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem: Reverse the Array
 *
 * Problem Statement:index
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Prints the elements in reverse order.
 */

public class ReversalElements {
    /*
    START
        Display a welcome message to the user
        Ask the user to input total elements number
        Read the inputted number and store it in variable (elementSize)

        Create an array of size elementSize to store the number

        Set an initial index and initialize it to 0
        WHILE index < length of array
            DO:
                Ask the user to enter a number for the current element
                Read the entered number and store it at array[index]
                Increment index by 1
        END WHILE

        Display message: Elements in reversed order:

        Set a new index and initialize it to length of array - 1
        WHILE index >= 0 --------> Because of first element
            DO:
                Print array[index]
                Decrement index by 1
        END WHILE
    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Reversal Duniyaa!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, input total elements number: ");
        int elementSize = userInput.nextInt();

        int[] originalArray = new int[elementSize];

        int elementInputIndex = 0;
        while (elementInputIndex < originalArray.length) {
            System.out.print("Now, enter element " + (elementInputIndex + 1) + ": ");
            originalArray[elementInputIndex] = userInput.nextInt();
            elementInputIndex++;
        }

        System.out.print("Elements in reversed order: ");

        int currentArrayIndex = (originalArray.length - 1);
        while (currentArrayIndex >= 0) {
            System.out.print(originalArray[currentArrayIndex] + " ");
            currentArrayIndex--;
        }
        System.out.println();
        userInput.close();
    }
}
