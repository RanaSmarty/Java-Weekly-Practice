package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 7: Inverted Right-Aligned Triangle
 *
 * Problem Statement:
 * Ask the user for a number N, and print a right-aligned inverted triangle made of * characters.
 */
public class ProblemSolving_7 {
    public static void main(String[] args) {
        /**
         START
            Ask the user for a number

                Set initial index as row from the user input
                WHILE initial index row >= 1
                   Set initial index as space from  1
                    WHILE subtract current row from total number of rows
                    DO:
                        Print double space "  "
                        Increment space by 1;
                    END WHILE
                        Set initial index as column from 1
                        WHILE initial column <= initial row
                        DO:
                            Print "* " with a space
                            Increment initial column by 1
                        END WHILE
                DO:
                        print a next line after every row
                        decrement initial row by 1;
                END WHILE
         Close the Scanner();
         END
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of row: ");
        int totalNumberOfRow = sc.nextInt();

        int row = totalNumberOfRow;
        while (row >= 1) {
            int space = 1;
            while (space <= (totalNumberOfRow - row)) {
                System.out.print("  ");
                space++;
            }
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row--;
        }
        sc.close();
    }
}
