package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem: Array Sum and Average (User-Solved Version)
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Prints the sum and average of the elements.
 */
public class SumAndAverage {
    public static void main(String[] args) {
        /*
        START
            Display a welcome message to the user
            Ask the user to input elements number
            Read the user inputted arraySize as element number and store it in an array
            Create an array to store all numbers

            Set an initial index as currentIndex and init it 0
            WHILE initial index < arraySize
                DO:
                    Ask the user to enter numbers for every element
                    Read the user inputted number and store these in array[currentIndex]
                    Increment current index by 1
            END WHILE

                Set a local variable as sum to store sum of all elements
                Set initial index and init it from 0
                WHILE initial index <= length of arrays
                    DO:
                        sum = sum + arrays (index)
                        Increment index by 1
                END WHILE

                    Set another local variable named average;
                    Sum / length of array
                    THEN
                            Print sum
                            Print average
                END WHILE
        Close the scanner object to avoid resource leaks
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sum and Average Station!\n");
        System.out.print("Please, enter your element size: ");
        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        int currentIndex = 0;
        while (currentIndex < arraySize) {
            System.out.print("Now, enter element number " + (currentIndex + 1) + ": ");
            numbers[currentIndex] = scanner.nextInt();
            currentIndex++;
        }
        int sum = 0;
        int index = 0;
        while (index < numbers.length) {
            sum = sum + numbers[index];
            index++;
        }
        double average = (double) sum / numbers.length;

        System.out.println("\nSum of these element is " + sum);
        System.out.println("Average is "+ average);
        scanner.close();
    }
}
