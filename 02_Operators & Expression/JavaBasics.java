//   # Problem-Statement:- What will be the Result of the Following expression (float ans 7/4*9/2).

//  # Logic (Step-by-Step):-
// . Creates Scanner object to read user input.
// . Prompts the user to enter the first number.
// . Stores the value in variable a.
// . Prompts the user to enter the Second number.
// . Stores the value in variable b.
// . Multiply the two no.a*b.
// . Stores the result in variable ans.
// . Print the final result. 

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

import java.util.*;
public class JavaBasics{
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    // Take input form user
    System.out.println("enter the value of a");
    float a = Sc.nextFloat();
    System.out.println("enter the value of b");
    float b = Sc.nextFloat();
    float ans = a*b;
    // Display result
    System.out.println("ans is ="+ans);

    }
}