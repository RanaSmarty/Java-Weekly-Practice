package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 3: Factorial
 * Ask the user for a number N, and calculate its factorial using a loop.
 */
public class ProblemSolving_3 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input N number
            Read the user input

            set factorial variable to storing results
            And for now init by 1;
            Set initial index i and init it by 1;
            WHILE initial index <= input N number
            DO:
                Multiply factorial by initial index i
                And store the result back in the factorial variable
                Increment initial index by 1
            END WHILE
            Print results
            Close the Scanner object();
        END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        long number = scanner.nextLong();

        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial is " + factorial);
        scanner.close();
    }
}
