package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 8: Check Even or Odd and When Zero is neither even nor odd

 * Write a Java program that takes a number from the user and
 * prints whether it is even or odd.
 * If it’s 0, print "Zero is neither even nor odd"
 * If it’s even → "Even"
 * If odd → "Odd"
 */
public class ProblemSolving_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero is neither even nor odd!");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
