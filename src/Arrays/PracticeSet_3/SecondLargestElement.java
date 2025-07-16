package Arrays.PracticeSet_3;
/*
✅ Practice Problem 1: Second-Largest Element
🧠 Problem Statement:
Write a Java program that:

Asks the user to enter N integers.

Stores them in an array.

Finds and prints the second-largest number in the array.
 */
public class SecondLargestElement {
    /*
    START
    Import Scanner package

        Display a welcome message to the user
        Create a scanner object to read the user inputted numbers
        Ask the user to enter total elements number
        Read the user inputted number and store it in a variable

        Create an array size of total elements number

        Set an index and initializing to it 0
        WHILE index is less than length of array size
            DO:
                Ask the user to input all elements one by one
                Read the user inputted numbers and store it at array [index]
                Increment index by 1
        END WHILE

        Set two variables:
            firstLargest = Integer.MIN_VALUE
            secondLargest = Integer.MIN_VALUE

        Set index = 0
        WHILE index < array length
            IF array[index] > firstLargest THEN
                secondLargest = firstLargest
                firstLargest = array[index]
            ELSE IF array[index] > secondLargest AND array[index] != firstLargest THEN
                secondLargest = array[index]
            END IF
            Increment index
        END WHILE

        IF secondLargest is still Integer.MIN_VALUE THEN
            Print: "Second largest does not exist."
        ELSE
            Print: "Second largest number is: " + secondLargest
        END IF

        Close Scanner
    END

     */
}
