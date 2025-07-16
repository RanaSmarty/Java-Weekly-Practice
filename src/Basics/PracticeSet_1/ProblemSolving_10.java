package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 10: Find Minimum number
 * Write a Java program that takes three integer numbers from the user and
 * prints  the minimum number among them.
 */
public class ProblemSolving_10 {
    public static void main(String[] args) {

        Scanner miniScanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first = miniScanner.nextInt();
        System.out.print("Second number: ");
        int second = miniScanner.nextInt();
        System.out.print("Third number: ");
        int third = miniScanner.nextInt();
        System.out.println();

        if (first < second && first < third) {
            System.out.println("Minimum is " + first);
        } else if (second < third && second < first) {
            System.out.println("Minimum is " + second);
        } else {
            System.out.println("Minimum is " + third);
        }
        miniScanner.close();
    }
}
