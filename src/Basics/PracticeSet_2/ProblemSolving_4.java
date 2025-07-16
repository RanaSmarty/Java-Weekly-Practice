package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 4: Square Pattern
 * Ask the user for a number N and print an N×N square of *.
 */
public class ProblemSolving_4 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input row and column number
            Read these numbers

            Set initial index named r and init it by 1
            WHILE initial index r <= total number of rows
                Set another initial index for column as c and init it by 1
                WHILE initial index c <= total number of column
                DO:
                    Print a star "* " with a space
                    Increment initial column c by 1
                END WHILE
            DO:
                Print a new line
                Increment initial index r by 1
            END WHILE
            Close the Scanner object to avoid recourse  leaks
        END
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Column: ");
        int column = sc.nextInt();
        System.out.println();

        int r = 1;
        while (r <= row) {
            int c = 1;
            while (c <= column) {
                System.out.print("* ");
                c++;
            }
            System.out.println();
            r++;
        }
        sc.close();
    }
}
