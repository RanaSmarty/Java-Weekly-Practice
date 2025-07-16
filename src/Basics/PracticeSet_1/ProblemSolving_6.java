package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem: Check Leap Year or Not
 * Take a year as input and check if it’s a leap year.
 * A year is a leap year if:
 *
 * Divisible by 4 and not divisible by 100, or
 *
 * Divisible by 400
 */
public class ProblemSolving_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year that you want to check: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 400 != 0 || year % 400 == 0) {
            System.out.println("Leap Year!");
        } else {
            System.out.println("Not a leap year!");
        }
        sc.close();
    }
}
