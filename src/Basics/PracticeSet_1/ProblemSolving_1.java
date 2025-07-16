package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 1: Check Even or Odd
 * Write a Java program that takes a number from the user and
 * prints whether it is even or odd.
 */
public class ProblemSolving_1 {
    public static void main(String[] args) {
        Scanner userSc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = userSc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
        userSc.close();
    }
}
