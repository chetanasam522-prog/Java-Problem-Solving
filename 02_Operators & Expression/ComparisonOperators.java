//   # Problem-Statement:- What will be the Result of the Following expression (float ans 7/4*9/2).

//  # Logic (Step-by-Step):-
// . A fixed number (givenNumber) is predefined in the program.
// . The program takes a number from the user using Scanner.
// . The comparison operator > is used to compare both numbers.
// . If the given number is greater, the program prints a message.
// . Otherwise, it prints that the given number is not greater.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

import java.util.*;
public class ComparisonOperators{
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    // Take input form user
    System.out.println("enter the number");
    int num = Sc.nextInt();
    int a= 70;

    // check num is gretter or not
    if(a>num){
        System.out.println("given no.is  gretter than user num");
    }else{
         System.out.println("given no.is NOT gretter than user num");

    }

    }
}
