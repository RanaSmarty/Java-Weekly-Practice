package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem: Number Pyramid
 *
 * Problem statement:
 * Ask the user to input a number N (number of rows).
 * Print a centered number pyramid where each row contains
 * numbers from 1 up to the row number, aligned like a pyramid.
 */

public class ProblemSolving_14 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input a number
            And read the user inputted number

            Set initial index row from 1
            WHILE initial index row <= total number of rows
                Set initial index space start from 1
                WHILE initial index space <= subtract current rows from total number of rows
                    DO:
                        Print double space to get clear output
                        Increment initial index space by 1
                END WHILE
                    Set initial index column and init it from 1
                    WHILE initial index column <= initial index row
                        DO:
                            Print initial index column with an extra space
                            Increment initial index column by 1
                    END WHILE
                DO:
                    Print a next line
                    Increment initial index row by 1
            END WHILE
        Close the scanner object
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        int currentRow = 1;
        while (currentRow <= totalNumberOfRows) {
            int spaces = 1;
            while (spaces <= (totalNumberOfRows - currentRow)) {
                System.out.print("  ");
                spaces++;
            }
            int currentColumn = 1;
            while (currentColumn <= currentRow) {
                System.out.print(currentColumn + " ");
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }
        scanner.close();
    }
}
