package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem : Traverse and Print Array
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Prints all the elements of the array in the same order.
 */

public class TraverseArrays {
    /*
    START
        Display a welcome message to the user
        Ask the user to input number of elements
        Read the user inputted numbers and store it in an array
        Create an array to store all numbers

        Set input index and init it by 0;
        WHILE index < array length
            DO:
                Ask the user to input element number one by one
                Read and store these number in array
                Increment index by 1
        END WHILE

            Set initial index and init it by 0
            WHILE index < length of array
                DO:
                    Print all the elements of the array in the same order
                    Increment index by 1
            END WHILE
    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Traversal Booth!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter total elements number: ");
        int arraySize = scanner.nextInt();

        int[] originalArray = new int[arraySize];

        int inputIndex = 0;
        while (inputIndex < originalArray.length) {
            System.out.print("Now, enter element number " + (inputIndex + 1) + ": ");
            originalArray[inputIndex] = scanner.nextInt();
            inputIndex++;
        }
        System.out.print("\nElements of the array are: ");
        int currentIndex = 0;
        while (currentIndex < originalArray.length) {
            System.out.print(originalArray[currentIndex] + " ");
            currentIndex++;
        }
        System.out.println();
        scanner.close();
    }
}
