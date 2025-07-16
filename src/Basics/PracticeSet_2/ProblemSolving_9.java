package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 9: Pyramid of Stars
 *
 * Problem Statement:
 * Ask the user for an odd number N, and print a pyramid made of * characters with N rows.
 * Make sure the middle row has the most stars, and it is perfectly centered.
 */
public class ProblemSolving_9 {
    public static void main(String[] args) {
        /**
         *
         START
            Ask the user to enter the total number of rows

                Set initial index as row from 1
         WHILE  initial row <= total Number of rows
                Set initial index as space name and init it 1
                WHILE initial space <= (subtract total number of rows - current row)
                DO:
                        Print double space "  "
                        Increment the initial space by 1
                END WHILE
                Set initial column from 1
                WHILE   initial column <= initial row
                DO:
                        Print star with a space "* "
                        Increment initial column by 1
                END WHILE
         DO:
                Print a next line after every row
                increment the initial row by 1
         END WHILE

         Close the Scanner obj();
         END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int totalRows = scanner.nextInt();

        int row = 1;
        while (row <= totalRows) {
            int space = 1;
            while (space <= (totalRows - row)) {
                System.out.print("  ");
                space++;
            }
            int col = 1;
            while (col <= (2 * row - 1)) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        scanner.close();
    }
}
