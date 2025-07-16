package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 5: Left-angled triangle
 *
 * Ask the user for a number N, and print a right-angled triangle made of *.
 */
public class ProblemSolving_5 {
    public static void main(String[] args) {
        /**
         *
         START
             Ask the user to input number of rows

            Set the initial index row from 1
            WHILE initial row <= total number of rows
                Set the initial index column from 1
                WHILE   initial column <= initial row
                DO:
                    Print "* " with a space
                    Increment the column by 1
                END WHILE
            DO:
                Print a newline after every row
                Increment the initial row by 1.
         END WHILE
         Close the Scanner!
         END
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int totalRows = sc.nextInt();

        int row = 1;
        while (row <= totalRows) {
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

