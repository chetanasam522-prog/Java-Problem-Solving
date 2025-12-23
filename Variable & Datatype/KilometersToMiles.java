//  # Problem-Statement:- Write a program to Convert Kilometers to Miles.

//  # Logic (Step-by-Step):-
// . Take the distance in kilometers as input from the user.
// . Use the conversion formula:
// . Miles = Kilometers × 0.621371
// . Store the converted value in a variable.
// . Display the result in miles.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

import java.util.*;
 public class KilometersToMiles{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // input distance in kilometers
        System.out.println("Enter distance in kilometers");
        double kilometers = Sc.nextDouble();

         // Cnvert kilometers to miles
         double miles = kilometers*0.621371;

         // Display result

         System.out.println("Distance in miles = "+ miles);
    }
}
