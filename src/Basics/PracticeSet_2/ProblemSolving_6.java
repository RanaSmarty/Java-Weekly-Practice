package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 6: Right-aligned triangle
 * Problem Statement:
 * Ask the user for a number N, and print a right-aligned triangle made of *.
 */
public class ProblemSolving_6 {
    public static void main(String[] args) {
        /**
         *
         START
            Ask the user to input the number of rows

                Set initial index row from 1
         WHILE  initial index row <= total number of rows
                Set initial index space from 1
                WHILE   subtract current row number from total number of rows
                DO:
                        Print space " "
                        Increment space by 1;
                END WHILE
                Set initial index column from 1
                WHILE   initial column <= initial row
                DO:
                        Print star "*"
                        Increment initial column by 1
                END WHILE

         DO:
                print a next line after every line of row
                increment index row by 1;
         END WHILE

         Close the Scanner Obj.
         END
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int totalRows = sc.nextInt();

        int row = 1;
        while (row <= totalRows) {
            int space = 1;
            while (space <= (totalRows - row)) {
                System.out.print("  ");
                space++;
            }
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
