package Basics.PracticeSet_2;

import java.util.Scanner;

/*
* Practical Problem: Hourglass (Sand Clock) Star Pattern

* Problem Statement:
* Write a program that prints an Hourglass (Star Sand Clock) pattern based on user input.
*/
public class ProblemSolving_17 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input total number of rows
            Read the user inputted number

            Check the number and give permission to entry as Odd

            // Top half of sand clock
            Set an initial index as top_row and init it from total number of rows
            WHILE initial index top_row >= 1
                Set another initial index as top_space and init it by 1
                WHILE initial index top_space <= subtract current rows from total number of row
                    DO:
                        Print a space " "
                        Increment initial index top_space by 1
                END WHILE
                    Set initial index top_star as column and init it by 1
                    WHILE initial index top_star <= top_row
                        DO:
                            Print a star "*"
                            Increment initial index top_star by 1
                    END WHILE
                DO:
                    Print a new line after every row
                    Decrement initial index by 2
            END WHILE
        Close scanner object to avoid resource leaks.
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sand Watch Demo!\n");
        System.out.print("Kindly, enter an odd number: ");
        int totalNumberOfRows = scanner.nextInt();

        if (totalNumberOfRows % 2 == 0) {
            System.out.println("Please try again with an odd number to get symmetrical pattern!");
            return;
        } else {
            // Top half
            int top_row = totalNumberOfRows;
            while (top_row >= 1) {
                int top_space = 1;
                while (top_space <= (totalNumberOfRows - top_row)) {
                    System.out.print(" ");
                    top_space++;
                }
                int top_star = 1;
                while (top_star <= top_row) {
                    System.out.print("* ");
                    top_star++;
                }
                System.out.println();
                top_row--;
            }
            // Bottom half
            int bottom_row = 2;
            while (bottom_row <= totalNumberOfRows) {
                int bottom_space = 1;
                while (bottom_space <= (totalNumberOfRows - bottom_row)) {
                    System.out.print(" ");
                    bottom_space++;
                }
                int bottom_star = 1;
                while (bottom_star <= bottom_row) {
                    System.out.print("* ");
                    bottom_star++;
                }
                System.out.println();
                bottom_row++;
            }
        }
        scanner.close();
    }
}
