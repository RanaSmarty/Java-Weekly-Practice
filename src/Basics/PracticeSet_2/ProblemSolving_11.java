package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem: Right-Angled Triangle Number Pattern
 *
 * Problem statement:
 * Ask the user to input a number N (number of rows).
 * Print a right-angled triangle using numbers where each row contains
 * increasing numbers starting from 1 up to the row number.
 */
public class ProblemSolving_11 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input a number of rows
            Read the user input

            Set initial index as row and init it from 1
            WHILE initial index <= total number of rows
                Set initial index colum and init it from 1
                WHILE initial index column <= current row (initial index row)
                    DO:
                        Print current column lengths (initial index column) with a space
                        Increment initial index column by 1
                END WHILE
                DO:
                    Print a next line after every row
                    Increment initial index row by 1
            END WHILE
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        int currentRow = 1;
        while (currentRow <= totalNumberOfRows) {
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
