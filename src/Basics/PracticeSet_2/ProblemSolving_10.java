package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Practice Problem: Diamond Star Pattern
 *
 * Problem statement:
 * Ask the user to input an odd number N (number of rows).
 * Print a diamond shape made of stars (*), centered, with the widest part at the middle row.
 */
public class ProblemSolving_10 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input the total number of rows
            Read the user inputted number

            IF user number is Odd
            DO:

    // Top half of diamond...
                Set a variable for half of the diamond
                Set initial index as row from 1;
                WHILE initial index row <= total number of rows
                    Set initial index space from 1;
                    WHILE initial index space <= subtract current row from total number of rows
                        DO:
                            Print space " "
                            Increment initial index space by 1
                    END WHILE
                    Set initial index star as column from 1;
                    WHILE initial index star <= current number of row
                        DO:
                            Print a star "* " with a space
                            Increment initial column by 1
                    END WHILE
                    DO:
                        Print a next line after every row
                        Increment initial index row by 1
                END WHILE

    // Bottom half of diamond...
                Set initial index row from total number of rows subtract 1
                WHILE initial index row >= 1
                Set initial index space from 1
                WHILE initial index space <= Subtract current row from total number of rows
                    DO:
                        Print double space "  "
                        Increment initial index space by 1
                END WHILE
                Set initial index col from 1
                WHILE initial index col <= Subtract current row from total number of rows
                    DO:
                        Print start with a space "* "
                        Increment initial index col by 1
                END WHILE
                    DO:
                        Print a next line
                        Decrement initial index row by 1
                END WHILE
        Close the Scanner object();
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total number of rows: ");
        int totalNumberOfRows = scanner.nextInt();

        if (totalNumberOfRows % 2 == 0) {
            System.out.println("Please try again with odd number!");
            return;
        } else {
            int topRow = 1;
            while (topRow <= totalNumberOfRows) {
                int topScape = 1;
                while (topScape <=(totalNumberOfRows - topRow)) {
                    System.out.print(" ");
                    topScape++;
                }
                int topStar = 1;
                while (topStar <= topRow) {
                    System.out.print("* ");
                    topStar++;
                }
                System.out.println();
                topRow++;
            }
            int bottomTotalNumberOfRows = totalNumberOfRows - 1;
            int bottomRow = bottomTotalNumberOfRows;
            while (bottomRow >= 1) {
                int bottomSpace = 1;
                while (bottomSpace <= totalNumberOfRows - bottomRow) {
                    System.out.print(" ");
                    bottomSpace++;
                }
                int bottomStar = 1;
                while (bottomStar <= bottomRow) {
                    System.out.print("* ");
                    bottomStar++;
                }
                System.out.println();
                bottomRow --;
            }
        }
        scanner.close();
    }
}
