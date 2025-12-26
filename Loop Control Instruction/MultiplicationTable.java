/**  # Problem Statement:-Write a program to print multiplication table a given number n.

# logic (Step By Step):-
 . Take number n as input from the user.
 . Initialize i = 1.
 . Use while loop to iterate from 1 to 10.
 . Multiply n with i and print the result.

# Time & Space Complexity:-
 . Time Complexity:- O(n)
 . Space Complexity:- O(n)

# Solution:- **/

import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);

         // Take input form User
         System.out.println("Enter your number");
         int n = Sc.nextInt();
         int i = 1;
         while(i<=10){
            System.out.println(n + "x" + i + "=" +(n*i));
            i++;
         }
    }
}
