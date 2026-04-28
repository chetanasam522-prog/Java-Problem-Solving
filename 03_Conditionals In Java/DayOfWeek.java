/**  # Problem Statement:-Write va Java program to find out the day of the week given the number
                          [ 1 for Mondays 2 for Tuesday ... and So on]

 # Logic: Day Of Week

. The program takes an integer input from the user.
. A switch statement is used to match the number with the corresponding day of the week.
. Each case prints the respective day:
  1 → Monday
  2 → Tuesday
  3 → Wednesday
  4 → Thursday
  5 → Friday
  6 → Saturday
  7 → Sunday
. If the user enters a number other than 1–7, the program prints an invalid input message.

 # Time & Space Complexity
 . Time Complexity = O(n)
 . Space Complexity = O(n)

 # Solution:- **/

 import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input Please enter a number between 1 and 7 ");
        }

    }

}

        