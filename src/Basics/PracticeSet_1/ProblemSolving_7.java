package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 7: Voter eligibility check.
 * Write a Java program that ask the user to enter their age. Print:
 * "You are eligible to vote" if age is 18 or above
 * "You are not eligible to vote" if below 18
 */
public class ProblemSolving_7 {
    public static void main(String[] args) {
        Scanner voterScanner = new Scanner(System.in);
        System.out.print("Please, enter your age: ");
        int age = voterScanner.nextInt();

        if (age >= 18 && age <= 100) {
            System.out.println("You are eligible to vote!");
        } else if (age >= 0 && age <= 18) {
            System.out.println("You are not eligible to vote.");
        } else {
            System.out.println("Invalid! Try again with valid age!");
        }
        voterScanner.close();
    }
}
