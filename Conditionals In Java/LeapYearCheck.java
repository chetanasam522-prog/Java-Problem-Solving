/** # Problem Statement:-Write a Java program to find whether a year entered by the user is a leap year or not.

# Logic: Leap Year Check

. The program takes a year as input from the user.
. A year is a leap year if:
. It is divisible by 4 and not divisible by 100, OR
. It is divisible by 400.
. If the condition is satisfied, the program prints “Leap Year”.
. Otherwise, it prints “Not a Leap Year”.

# Time & Space Complexity
 . Time Complexity = O(n)
 . Space Complexity = O(n)

 # Solution:- **/

 import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

    }
}
