package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 8: Inverted Left-Aligned Triangle
 *
 * Problem Statement:
 * Ask the user for a number N, and print a right-aligned inverted triangle made of * characters.
 */
public class ProblemSolving_8 {
    public static void main(String[] args) {
        /*
        START
           Ask the user to enter total number of rows
           Read the user number

           Set initial index as row and init it from total number
           WHILE initial index row <= total number of rows
                Set initial index as col and init from 1
                WHILE initial index col <= subtract row - 1 from total number of rows
                DO:
                    Print star with a space "* "
                    Increment index col by 1
                END WHILE
           DO:
                Print a next line after every row
                Increment initial row by 1
            END WHILE
        Close the Scanner object();
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        int row = 1;
        while (row <= totalNumberOfRows) {
            int col = 1;
            while (col <= (totalNumberOfRows - (row - 1))) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        scanner.close();
    }
}
