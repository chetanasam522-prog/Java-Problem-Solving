/**  # Problem Statement:-Write a program to find factorial of a given number using for lops..

# logic (Step By Step):-
 . Take input number n from the user.
 . Initialize fact = 1.
 . Use a for loop from 1 to n.
 . Multiply fact by each number in every iteration.
 .Final value of fact is the factorial of n.

# Time & Space Complexity:-
 . Time Complexity:- O(n)
 . Space Complexity:- O(n)

# Solution:- **/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);

    }

}
