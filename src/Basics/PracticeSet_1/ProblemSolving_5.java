package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem: Grade checking
 * Write a Java program that take a score from the user (0–100) and print a grade:
 * 90+ → A
 * 80–89 → B
 * 70–79 → C
 * 60–69 → D
 * Below 60 → F
 */
public class ProblemSolving_5 {
    public static void main(String[] args) {
        Scanner stdSc = new Scanner(System.in);
        System.out.print("Marks: ");
        double marks = stdSc.nextDouble();

        if (marks >= 90 && marks <= 100) {
            System.out.println("You got A");
        } else if (marks == 80 && marks < 90 ) {
            System.out.println("You got B");
        } else if (marks == 70 && marks < 80) {
            System.out.println("You got C");
        } else if (marks == 60 && marks < 70) {
            System.out.println("You got D");
        } else if (marks < 60) {
            System.out.println("You got F");
        } else {
            System.out.println("Invalid marks!");
        }
        stdSc.close();
    }
}
