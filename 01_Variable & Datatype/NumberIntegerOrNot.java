//  # Problem-Statement:- checks whether the input entered by the user is an integer or not..

//  # Logic (Step-by-Step):-
// . The program starts execution from the main method.
// . A Scanner object is created to accept input from the user.
// . The user is prompted to enter a value.
// . The hasNextInt() method of the Scanner class is used to check whether the entered value is an integer.
// . If hasNextInt() returns true, the input is identified as an integer and displayed.
// . If hasNextInt() returns false, the program concludes that the input is not an integer.
// . The Scanner object is closed after input processing.
// . The program terminates successfully.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

import java.util.Scanner;

public class NumberIntegerOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("The entered value is an INTEGER: " + number);
        } else {
            System.out.println("The entered value is NOT an integer.");
        }

    }
}