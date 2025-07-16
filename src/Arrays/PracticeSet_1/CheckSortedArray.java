package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem: Check if the Given Array is Sorted (Ascending Order)
 * Problem Statement:
 * Write a Java program to check whether a given 1D array is sorted in ascending order (each element ≤ next element)
 */
public class CheckSortedArray {
    /*
    START
        Display a welcome message to the user
        Ask the user to input total number of elements
        Read the user inputted element size and store it in variable size
        Create an array to store all elements

        Set an initial index named currentIndex and init it by 0
        WHILE currentIndex < arrays size
            DO:
                Ask the user to input element at currentIndex
                Read the user inputted elements and store these in array[currentIndex]
                Increment currentIndex by 1
        END WHILE

            Initialize a flag isSorted = true
            Set initial index 'i' and init ot by 0
            WHILE index < length of arrays
                DO:
                    IF array[index] > array[index + 1] THEN
                        Set isSorted = false
                        BREAK out of the loop
                    END IF
                    Increment index by 1
            END WHILE
                    IF isSorted is true THEN
                        Display "Array is sorted!"
                    ELSE
                        Display "Array is not sorted!"
                    END IF
    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Checkpost!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter your total element numbers: ");
        int arraySize = userInput.nextInt();

        int[] originalArray = new int[arraySize];

        int currentIndex = 0;
        while (currentIndex < originalArray.length) {
            System.out.print("Now, enter element for " + (currentIndex + 1) + " index: ");
            originalArray[currentIndex] = userInput.nextInt();
            currentIndex++;
        }
        boolean isSorted = true;
        int i = 0;
        while (i < originalArray.length - 1) {
            if (originalArray[i] > originalArray[i + 1]) {
                isSorted = false;
                break;
            }
            i++;
        }
        if (isSorted) {
            System.out.println("\nArray is sorted!");
        } else {
            System.out.println("\nArray is not sorted!");
        }
        userInput.close();
    }
}
