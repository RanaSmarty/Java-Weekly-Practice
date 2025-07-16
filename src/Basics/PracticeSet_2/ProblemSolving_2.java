package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem 2: Calculates sum of N numbers
 * Write a program that ask the user for a number N, then calculate and print the sum of numbers from 1 to N.
 */
public class ProblemSolving_2 {
    public static void main(String[] args) {
        /*
        START
            Ask the user to input N numbers
            Read the user input

                Set initial variable for store sum of N numbers
                Set sum and init by 0
                Set initial index as i from 0;
                WhILE initial index i <= total N numbers
                DO:
                    Store (sum + initial index i) in sum variable
                    Increment index i by 1
                    Print sum
                Close the Scanner
                END WHILE
        END
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        int sum = 0;
        int i = 0;
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of these number is " + sum);
        sc.close();
    }
}
