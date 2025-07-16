package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 4: Check Positive, Negative or Zero
 * Write a Java program that take an integer from the user and print whether it's:
 * Positive
 * Negative
 * Zero
 */
public class ProblemSolving_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero!");
        }
        sc.close();
    }
}
