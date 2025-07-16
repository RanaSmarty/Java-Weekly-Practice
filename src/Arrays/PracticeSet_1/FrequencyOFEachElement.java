package Arrays.PracticeSet_1;
/*

                INCOMPLETE

 */
import java.util.Scanner;

/**
 * Practice Problem 7: Find the Frequency of Each Element
 *
 * Problem Statement:
 * Write a Java program that:
 * Asks the user to enter N integers.
 * Stores them in an array.
 * Prints the frequency (how many times) each unique element appears in the array.
 */
public class FrequencyOFEachElement {
    /*
    START
    Import Scanner package

        Display a greeting message to the user
        Ask the user to input total elements number
        Read the user inputted numbers and store it in a variable (elementSize)

        Create an array of size elementSize to store the number

        Set an initial index and initialization it to 0
        WHILE index < length of array size
            DO:
                Ask the user to enter a number for the current element
                Read the entered number and store it at array[index]
                Increment index by 1
        END WHILE

        Create a new boolean array of the same size of the original array


    Close the Scanner object to avoid resource leaks
    END
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Frequency Counter!\n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter total number of elements: ");
        int totalNumberofElements = userInput.nextByte();

        int[] originalArray = new int[totalNumberofElements];

        int elementInputIndex = 0;
        while (elementInputIndex < originalArray.length) {
            System.out.print("Now, enter element " + (elementInputIndex + 1) + ": ");
            originalArray[elementInputIndex] = userInput.nextInt();
            elementInputIndex++;
        }

        boolean[] visitedElement = new boolean[totalNumberofElements];

        int travarseCounter = 0;
        while (travarseCounter < originalArray.length) {
            
            travarseCounter++;
        }
        System.out.println();
        userInput.close();
    }
}
