package Arrays.PracticeSet_1;

import java.util.Scanner;

/** *Practice Problem 3: Find Maximum and Minimum in an Array
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Finds and prints:
 * The maximum number in the array.
 * The minimum number in the array.
 */
public class MaxMin {
    /*
    START
        Display a welcome message to the user
        Ask the user to enter number of element
        Read and store it in arraySize variable

        Create an integer array of size arraySize

        Set index = 0
        WHILE index < arraySize
            DO:
                Ask the user to enter element
                Store element in array[index]
                Increment index by 1
        END WHILE
            Set Maximum = 0
            Set Minimum = 0

            Set index = 1
            WHILE index < arraySize
                DO:
                    IF array[index] > Maximum
                    THEN set Maximum = array[index]
                    END IF

                    IF array[index] < Minimum
                    THEN set Minimum = array[index]
                    END IF
                    Increment index by 1
            END WHILE
                Print "Maximum number is " + Maximum
                Print "Minimum number is " + Minimum
    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Max and Min Station!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your element size: ");
        int arraySize = userInput.nextInt();

        int[] originalArray = new int[arraySize];

        int currentIndex = 0;
        while (currentIndex < arraySize) {
            System.out.print("Enter your element number " + (currentIndex + 1) + ": ");
            originalArray[currentIndex] = userInput.nextInt();
            currentIndex++;
        }

        int maximum = originalArray[0];
        int minimum = originalArray[0];

        int index = 1;
        while (index < originalArray.length) {
            if (originalArray[index] > maximum) {
                maximum = originalArray[index];
            }
            if (originalArray[index] < minimum) {
                minimum = originalArray[index];
            }
            index++;
        }
        System.out.println("\nMaximum number is " + maximum);
        System.out.println("Minimum number is " + minimum);
        userInput.close();
    }
}
