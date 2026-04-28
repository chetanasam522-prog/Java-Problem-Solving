/**  # Problem Statement:-Write a program to find out whether a Student is pass or fail; 
                          if it requires total 40% and at least 33% 33% in in each subject to Pass.
                          Assume 3 Subjects and take marks as an from the user.

 # Logic: Student Pass or Fail Program (Java)

 . The program starts by creating a Scanner object to take input from the user.
 . It accepts marks for three subjects from the user. Each subject is assumed to be out of 100 marks.
 . The marks of all three subjects are added to calculate the total marks.
 . The percentage is calculated using the formula:
 . The overall percentage must be 40% or more.
 . The marks in each subject must be at least 33.
 . If all conditions are satisfied, the student is declared PASS.
 . If any one condition fails, the student is declared FAIL.
 . Finally, the program displays the total marks, percentage, and the final result.

 # Time & Space Complexity
 . Time Complexity = O(n)
 . Space Complexity = O(n)

 # Solution:- **/

import java.util.*;
public class PassORFail{
    public static void main(String args[]){
    Scanner Sc = new Scanner(System.in);

    // Take the input form user
    System.out.println("Enter the marks of sub1");
    float sub1 = Sc.nextFloat();
    System.out.println("Enter the marks of sub2");
    float sub2 = Sc.nextFloat();
    System.out.println("Enter the marks of sub3");
    float sub3 = Sc.nextFloat();

    // Calculate the total marks
    float total = sub1+sub2+sub3;
    System.out.println("Total marks ="+total);

    // Calcutale percentage
    float per = (total/300)*100;
    System.out.println("Total percentage ="+per);

    // Checking pass or fail condition
    if(per>=40 && sub1>=33 && sub2>=33 && sub3>=33){
       System.out.println("Result : Pass");
    }else{
        System.out.println("Result : Fail");
    }

}

}
