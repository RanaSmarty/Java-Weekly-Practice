package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 2: Check Maximum Of Three Number
 * Write a Java program that take 3 numbers from the user and
 * print the largest of the three.
 */
public class ProblemSolving_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First: ");
        int first = sc.nextInt();
        System.out.print("Second: ");
        int second = sc.nextInt();
        System.out.print("Third: ");
        int third = sc.nextInt();

        if (first == second && second == third) {
            System.out.println("All is equal!");
        } else if (first > second && first > third) {
            System.out.println("\nThe first number is maximum!");
        } else if (second > third) {
            System.out.println("The second number is maximum!");
        } else {
            System.out.println("The third number is maximum!");
        }
        sc.close();
    }
}
