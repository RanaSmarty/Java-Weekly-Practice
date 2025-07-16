package Basics.PracticeSet_2;

import java.util.Scanner;

/*
Problem Statement: Butterfly Pattern
Write a program that prints the Butterfly Pattern based on user input.
*/
public class ProblemSolving_16 {
    public static void main(String[] args) {
        /*
        START
            Ask the user for a number
            Read the user number

// Top half of the wing

            Set initial index row and init it by 1
            WHILE row <= total number

                // Left wing
                Set initial index star and init it by 1
                    WHILE column <= row
                        DO:
                            Print a star "*"
                            Increment column by 1
                    END WHILE
                        Set initial index space and init it by 1
                        WHILE space <= subtract current row from total number of rows and multiply by 2
                             DO:
                                    Print a space " "
                                    Increment space by 1
                        END WHILE

                        // Right wing
                            Set initial index star and init it by 1
                            WHILE column <= row
                                DO:
                                    Print a star "*"
                                    Increment column by 1
                            END WHILE
                DO:
                    Print a new line after every row
                    Increment index by 1
            END WHILE
// Bottom half of the
            Set initial index row for bottom half wing and init it by total number of rows
            WHILE row >= 1
                // Left wing
                Set initial index star and init it by 1
                    WHILE column <= row
                        DO:
                            Print a star "*"
                            Increment column by 1
                    END WHILE
                        Set initial index space and init it by 1
                        WHILE space <= subtract current row from total number of rows and multiply by 2
                             DO:
                                    Print a space " "
                                    Increment space by 1
                        END WHILE

                        // Right wing
                            Set initial index star and init it by 1
                            WHILE column <= row
                                DO:
                                    Print a star "*"
                                    Increment column by 1
                            END WHILE
                DO:
                    Print a new line after every row
                    Decrement row by 1
            END WHILE
        Close the scanner object to avoid resource leaks.
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Butterfly's World!\n");
        System.out.print("Please, enter your number: ");
        int totalNumberOfRows = scanner.nextInt();

        // Top half wing
        int top_row = 1;
        while (top_row <= totalNumberOfRows) {
            int top_left_wing = 1;
            while (top_left_wing <= top_row) {
                System.out.print("*");
                top_left_wing++;
            }
            int top_wing_space = 1;
            while (top_wing_space <= (2 * (totalNumberOfRows - top_row))) {
                System.out.print(" ");
                top_wing_space++;
            }
            int top_right_wing = 1;
            while (top_right_wing <= top_row) {
                System.out.print("*");
                top_right_wing++;
            }
            System.out.println();
            top_row++;
        }

        // Bottom half wing
        int bottom_row = totalNumberOfRows;
        while (bottom_row >= 1) {
            int bottom_left_wing = 1;
            while (bottom_left_wing <= bottom_row) {
                System.out.print("*");
                bottom_left_wing++;
            }
            int bottom_wing_space = 1;
            while (bottom_wing_space <= (2 * (totalNumberOfRows - bottom_row))) {
                System.out.print(" ");
                bottom_wing_space++;
            }
            int bottom_right_wing = 1;
            while (bottom_right_wing <= bottom_row) {
                System.out.print("*");
                bottom_right_wing++;
            }
            System.out.println();
            bottom_row--;
        }
        scanner.close();
    }
}
