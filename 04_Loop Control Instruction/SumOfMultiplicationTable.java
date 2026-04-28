/**  # Problem Statement:- Write a program to calculate the sum of the numbers occuring in the multiplication table of 8.

# logic (Step By Step):-
. Fix the number n = 8
. Initialize sum = 0
. Use a for loop from 1 to 10
. Multiply 8 with each number and add it to sum
. After the loop, sum contains the total of the table values

# Time & Space Complexity:-
 . Time Complexity:- O(n)
 . Space Complexity:- O(n)

# Solution:- **/

public class SumOfMultiplicationTable {
    public static void main(String[] args) {

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + (n * i);
        }

        System.out.println("Sum of numbers in multiplication table of 8 is: "+ sum);

    }

}