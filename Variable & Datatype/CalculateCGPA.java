//  # Problem-Statement:- Write a program to calculate CGPA using marks of three subjects (out of 100).

//  # Logic (Step-by-Step):-
// . Take marks of three subjects as input (each out of 100).
// . Convert each subject’s marks into grade points by dividing by 10.
// . Calculate the average of the three grade points.
// . The average value obtained is the CGPA.
// . Display the CGPA.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

 import java.util.*;
 public class CalculateCGPA{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        // Input marks of Three Suject
        System.out.println("Enter the marks of subject 1");
        float sub1 = Sc.nextFloat();
        System.out.println("Enter the marks of subject 2");
        float sub2 = Sc.nextFloat();
        System.out.println("Enter the marks of subject 3");
        float sub3 = Sc.nextFloat();
        // Calculate CGPA
        float cgpa = (sub1+sub2+sub3)/3;
         // Display the CGPA
        System.out.println("CGPA ="+cgpa);
    }
}