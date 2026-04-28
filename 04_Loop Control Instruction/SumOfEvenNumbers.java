/**  # Problem Statement:-Write a program to sum first n even numbers using while loop.

# logic (Step By Step):-
. Take input n from the user.
. Initialize:
  sum = 0 → to store the final sum
  even = 2 → first even number
  count = 1 → to count how many even numbers are added
. Use a while loop that runs until count <= n.
. In each iteration:
  Add even to sum
  Increase even by 2 to get the next even number
  Increment count
. Print the final sum.

# Time & Space Complexity:-
 . Time Complexity:- O(n)
 . Space Complexity:- O(n)

# Solution:- **/

import java.util.*;
public class SumOfEvenNumbers{
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);

        // Take the input form user
        System.out.println("Enter your number");
        int n = Sc.nextInt();
        int count = 0;
        int even = 2;
        int sum = 0;
        while(count<=n){
            sum = sum+even;
            even = even+2;
            count++;
        }
        System.out.println("Sumof first"+n+"even numbers is:"+sum);
    }
}


