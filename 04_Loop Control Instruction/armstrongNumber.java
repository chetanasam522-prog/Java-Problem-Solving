/*  # Problem Statement : Write a program that takes an integer as input and checks whether the number is an Armstrong number or not.
-----------------------------------------------------------------------------------------------------------------------------------------

    # Step by Step Code logic :

    1. Take input
       Read the number from the user (let’s call it num).

    2. Store original number
      Save it in another variable (e.g., myNum = num) for comparison later.

    3. Count number of digits
     Initialize digits = 0

    4. Use a loop:
      Keep dividing the number by 10 (temp = temp / 10)
      Increase digits++ each time
      This gives total number of digits

    5. Reset temporary variable
     Set temp = num again (since it became 0 in previous step)

    6. Calculate sum of powers
       Initialize sum = 0
       Loop while temp > 0:
       Extract last digit → digit = temp % 10
       Calculate power = digit^digits
       Add to sum → sum = sum + power
       Remove last digit → temp = temp / 10

    7. Compare result
      If sum == original
      It is an Armstrong number
      Else
      It is not an Armstrong number

    8. Print result
      Display appropriate message
-------------------------------------------------------------------------------------------------------------------------------------
    
    # Time & Space Complexity 

    1. Time Complexity = O(logn)
      Let d = number of digits in the number
      We use:
      One loop to count digits = O(d)
      One loop to calculate sum of powers = O(d)

    2. Space Complexity = O(1) (constant space)
       No extra memory like arrays or recursion
       
---------------------------------------------------------------------------------------------------------------

   # Code logic */

import java.util.*;
public class armstrongNumber {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int num = Sc.nextInt();

        int myNum = num;
        int digit = 0;
        int result =0;

        // calculate digit 
        int temp = num;
        while(temp >0){
            temp/=10;
            digit++;    
        }

        // calculate result

        temp = num;
        while(temp>0){
            int rem = temp%10;
            result += Math.pow(rem,digit);

            temp/=10;
        }
        // print Result
        if(myNum == result){
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not armstrong number");
        }
    }
    
}
