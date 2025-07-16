package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem: Search for an Element in an Array
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to input N integers and stores them in an array.
 * Asks the user to enter a target number to search for.
 * Searches for that number in the array.
 * If found, print the index (first occurrence).
 * If not found, print "Not found"
 */
public class Occurrences {
    /*
    START
        Display a welcome message
        Ask the user to enter the number of element
        Read and store input in arraySize variable
        Create an array of size arraySize

        Set index and init it by 0
        WHILE index < arraySize
            DO:
                Ask the user to enter a number
                Store the number at array[index]
                Increment index by 1
        END WHILE

        Ask the user to enter the number to search
        Read and store input in target variable

        Set local variable name found and init it by false
        Set searching index and init it  by 0
        WHILE searchIndex < arraySize
            DO:
                IF array[searchIndex] equal to target number
                    THEN
                        Print "Number found at " + searchIndex position
                END IF
                Increment searchIndex by 1
        END WHILE

        IF found == false
            THEN
                Print "Not found!"
        END IF
    Close the scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Occurrences Station!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your total element size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        int currentIndex = 0;
        while (currentIndex < arraySize) {
            System.out.print("Now, enter element number " + (currentIndex + 1) + ": ");
            array[currentIndex] = scanner.nextInt();
            currentIndex++;
        }
        System.out.print("\nPlease, enter the number you want to find: ");
        int number = scanner.nextInt();
        System.out.println();

        int occ = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                occ++;
            }
            i++;
        }
        System.out.println("Number is found " + occ + " time!\n");

        boolean found = false;
        int searchIndex = 0;
        while (searchIndex < arraySize) {
            if (array[searchIndex] == number) {
                System.out.println("At index " + searchIndex);
                found = true;
            }
            searchIndex++;
        }
        if (!found) {
            System.out.println("Not found!");
        }
        scanner.close();
    }
}
