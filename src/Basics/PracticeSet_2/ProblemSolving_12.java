package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem: Right-Angled Triangle – Continuous Numbers
 * Problem statement:
 *
 * Ask the user to input a number N (number of rows).
 * Print a right-angled triangle where the numbers increase continuously from 1.
 */
public class ProblemSolving_12 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input a number of rows
            Read user inputted number as total number of rows

            Set a variable to store current value and init it from 1

            Set initial index as row and init it from 1
            WHILE initial index row <= total rows
                Set initial index column and init it from 1
                WHILE initial index column <= initial index row
                    DO:
                        Printing local variable value with an extra space
                        Increment local variable by 1
                END WHILE
                DO:
                    Print next line after every row
                    Increment initial index row by 1
            END WHILE
        Close the scanner object();
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        int printingCurrentNumber = 1;

        int currentRow = 1;
        while (currentRow <= totalNumberOfRows) {
            int currentColumn = 1;
            while (currentColumn <= currentRow) {
                System.out.print(printingCurrentNumber + " ");
                printingCurrentNumber++;
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }
        scanner.close();
    }
}
