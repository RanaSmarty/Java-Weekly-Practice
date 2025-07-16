package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 9: Absolute number
 * Write a Java program that takes an integer number from the user and
 * prints absolute number
 */
public class ProblemSolving_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Absolute number is "+ (-number));
        } else {
            System.out.println("Absolute number is " + number);
        }
        sc.close();
    }
}
