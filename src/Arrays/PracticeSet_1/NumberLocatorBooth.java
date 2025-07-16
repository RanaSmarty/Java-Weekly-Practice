package Arrays.PracticeSet_1;

import java.util.Scanner;

/**
 * Practice Problem: Find the Frequency of Each Element
 *
 * Problem Statement:
 * Write a Java program that:
 * - Asks the user to enter N integers.
 * - Stores them in an array.
 * - Prints the frequency (how many times) each unique element appears in the array.
 */
public class NumberLocatorBooth {
    /*
       START
       Import Scanner package

           Display a welcome message to the user
           Create a Scanner object for read the user inputted numbers
           Ask the user to enter total elements number
           Read the user inputted numbers and store it to a variable

           Create an array size of total element numbers

           Set an index and initializing it to 0
           WHILE index is less than length of array
               DO:
                   Ask the user to input elements one by one
                   Read the inputted number and store it at array [index]
                   Increment index by 1
           END WHILE

           Again, ask the user to enter a number to search
           Raed the entered number and store it in another variable (findingNumber)

           Create another variable to count occurrences and initializing it to 0

           Set a flag and init it to false

           Set an index and initializing it to 0
           WHEN index is less than length of array size
               DO:
                   IF findingNumber is equal to current array index THEN
                       Set flag to true
                       Increment occurrences by 1
                   END IF
               Increment index by 1
           END WHEN

           IF the flag indicate to false THEN
               Prints Number not found!
           ELSE
               Print Found!
               Set index to 0
               WHILE index < length of array
                   DO:
                       IF array[index] equals findingNumber THEN
                           Print "Number found at index " + index
                           -
                           -
                           -
                       END IF
                       Increment index by 1
               Print Total occurrences ___
           END IF
       Close the Scanner to avoid resources leaks
       END
    */
    public static void main(String[] args) {
        System.out.println("Welcome to the Linear Search Station! \n");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please, enter the total number of elements: ");
        int totalElementsNumber = userInput.nextInt();

        int[] originalArrayOfTotalElementsSize = new int[totalElementsNumber];

        System.out.println();
        System.out.println("Now, enter one by one elements...");
        int elementAskingIndex = 0;
        while (elementAskingIndex < originalArrayOfTotalElementsSize.length) {
            System.out.print("Element " + (elementAskingIndex + 1) + ": ");
            originalArrayOfTotalElementsSize[elementAskingIndex] = userInput.nextInt();
            elementAskingIndex++;
        }

        int occurrences = 0;
        System.out.println();
        System.out.print("Enter the number you're finding: ");
        int findingNumber = userInput.nextInt();

        boolean isFound = false;

        int occurenceIndex = 0;
        while (occurenceIndex < originalArrayOfTotalElementsSize.length) {
            if (findingNumber == originalArrayOfTotalElementsSize[occurenceIndex]) {
                isFound = true;
                occurrences++;
            }
            occurenceIndex++;
        }

        if(!isFound) {
            System.out.println("Unfortunately! You entered number out of all elements.");
        } else {
            System.out.println("Found!");
            System.out.println("Total occurences " + occurrences);
            System.out.println();
            int currentIndex = 0;
            while (currentIndex < originalArrayOfTotalElementsSize.length) {
                if (findingNumber == originalArrayOfTotalElementsSize[currentIndex]) {
                    System.out.println("Number found at index " + currentIndex);
                }
                currentIndex++;
            }
        }

        System.out.println();
        userInput.close();
    }
}



