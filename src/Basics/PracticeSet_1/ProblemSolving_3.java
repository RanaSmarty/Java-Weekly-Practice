package Basics.PracticeSet_1;

import java.util.Scanner;

/**
 * Problem 3: Simple calculator
 * Write a Java program that take two numbers and an operator (+, -, *, /) from the user and print the result.
 */
public class ProblemSolving_3 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.print("Choose your operator (+, -, *, /): ");
        char operator = userIn.next().charAt(0);
        System.out.print("First number: ");
        double firstNumber = userIn.nextDouble();
        System.out.print("Second number: ");
        double secondNumber = userIn.nextDouble();

        double result = 0;
        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result is " + result);
        userIn.close();
    }
}
