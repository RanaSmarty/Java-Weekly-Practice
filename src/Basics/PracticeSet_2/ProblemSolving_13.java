package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem: Inverted Right-Angled Triangle of Numbers
 *
 * Problem statement:
 * Ask the user to input a number N (number of rows).
 * Print an inverted right-angled triangle of numbers,
 * where the first row starts with numbers from 1 to N,
 * and each subsequent row has one less number.
 */

public class ProblemSolving_13 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input total number of rows
            Read the user inputted number.

            Set initial index as row and init it from 1
            WHILE initial index row <= total rows
                Set initial index as column and initial it from total number of rows
                WHILE initial index column >= subtract current row from total rows and add 1
                    DO:
                        Print current column
                        increment initial index column by 1;
                END WHILE
                DO:
                    Printing a new line after every row
                    Increment initial index row by 1
            END WHILE
        Close the scanner object.
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        int currentRow = 1;
        while (currentRow <= totalNumberOfRows) {
            int currentColumn = 1;
            while (currentColumn <= ((totalNumberOfRows - currentRow) + 1)) {
                System.out.print(currentColumn + " ");
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }
        scanner.close();
    }
}
