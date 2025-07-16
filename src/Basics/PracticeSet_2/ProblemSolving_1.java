package Basics.PracticeSet_2;

import java.util.Scanner;

/**
 * Problem: 1 to N
 * Write a program that ask the user for a number N, and print numbers from 1 to N using a loop.
 */
public class ProblemSolving_1 {
    public static void main(String[] args) {
        /**
         START
            Ask the user to input N number as rows
                Set initial index as i from 1
         WHILE  initial index i <= N number of rows
         DO:
                Print the initial number i
                increment i by 1
         END WHILE
         Close scanner object

         END
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the N number: ");
        int number = scanner.nextInt();

//        int i = 1;
//        while (i <= number) {
//            System.out.println(i);
//            i++;
//        }

        System.out.print("Counting from 1 to N: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Counting from N to 1: ");
        for (int j = number; j >= 1; j--) {
            System.out.print(j + " ");
        }
        scanner.close();
    }
}
