package Basics.PracticeSet_2;

import java.util.Scanner;
/*
 * Practice Problem: Pascal’s Triangle
 *
 * Problem statement:
 * Ask the user to input a number N (number of rows).
 * Print Pascal’s Triangle where each number is a binomial coefficient.
 */
public class ProblemSolving_15 {
    public static void main(String[] args) {
            /*
    START
        Ask the use to input total number of rows
        Raed the user inputted numbers

        Set initial index as row and init it from 0
        WHILE initial index row <= total number of rows
            Set initial index as spaces and init it from 1
            WHILE initial index spaces <= subtract current rows from total number of rows
                DO:
                    print double space for better decoration
                    Increment spaces by 1
            END WHILE
                Set initial index as column and init it from 0
                WHILE initial index column <= current rows
                    DO: // Calculate factorial(row)
                        Set initial index row for factorial of rows and init it from 1
                        Set index for loop from 1
                        WHILE index <= factorial row
                            DO:
                                factorial_row = factorial_row * index;
                                increment index by 1
                        END WHILE
                         // Calculate factorial(col)
                         Set initial index column for factorial of column and init it from 1
                         Set index for loop from 1
                         WHILE index <= factorial columns
                            DO:
                                factorial_column = factorial_column * index
                                Increment index by 1
                         END WHILE

                         // calculate factorial (row - col)
                         Set a local variable for calculate factorial differences and init it from 1
                         Set initial index counter from 1
                         WHILE initial counter <= (row - column)
                            DO:
                                factorial = factorial * counter
                                Increment counter by 1
                         END WHILE

                         Calculate value = row! / column! * (row - column)!
                 Print calculated value
                Increment column by 1
                END WHILE
            DO:
                Print a next line after every row
                Increment initial row by 1
        END WHILE
    Close the scanner object to avoid resources leaks.
    END
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int totalNumberOfRows = scanner.nextInt();

        // Formula: C (row, column) = row! / (column! * (row - column)!)
        int currentRow = 0;
        while (currentRow <= totalNumberOfRows) {
            int space = 1;
            while (space <= (totalNumberOfRows - currentRow)) {
                System.out.print(" ");
                space++;
            }
            int currentColumn = 0;
            while (currentColumn <= currentRow) {
                int initial_RowFactorial = 1;
                int factorial_row = 1;
                while (factorial_row <= currentRow) {
                    initial_RowFactorial = (initial_RowFactorial * factorial_row);
                    factorial_row++;
                }

                // Finding factorial for column
                int initial_ColumnFactorial = 1;
                int factorialColumn = 1;
                while (factorialColumn <= currentColumn) {
                    initial_ColumnFactorial = (initial_ColumnFactorial * factorialColumn);
                    factorialColumn++;
                }

                // calculate factorial for (row - column)
                int initial_FactorialDifferencesValues = 1;
                int counter = 1;
                while (counter <= (currentRow - currentColumn)) {
                    initial_FactorialDifferencesValues = (initial_FactorialDifferencesValues * counter);
                    counter++;
                }

                // calculate the value of C(row, column) = row! / (column! * (row - column)!)

                int value = (initial_RowFactorial / (initial_ColumnFactorial * initial_FactorialDifferencesValues));
                System.out.print(value + " ");
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }
        scanner.close();
    }
}