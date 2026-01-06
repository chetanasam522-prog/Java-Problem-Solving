/** # Problem Statement :- Write a program to convert Decimal to Binary
 
    # Logic (Step by Step) :-
     
    1. Start the program.
    2. Create a method decTobin(int decNum) to convert a decimal number into binary.
    3. Store the original decimal number in another variable (myNum) so it can be printed later.
    4. Initialize required variables:
     . pow = 0 → represents the power/position of 10 in the binary number.
     . binNum = 0 → stores the final binary value.
    5. Repeat the process while the decimal number is greater than 0:
     . Find the remainder by dividing the decimal number by 2.
     . Multiply the remainder with 10 raised to the power pow.
     . Add this value to binNum.
     . Increase the power value by 1.
     . Divide the decimal number by 2 to remove the last processed bit.
    6. Continue the loop until the decimal number becomes 0.
    7. Print the binary equivalent of the original decimal number.
    8. End the program.

    # Time & Space Complexity :-
    1. Time Complexity = O(n)
     . The while loop runs until the decimal number becomes 0.
     . In each iteration, the number is divided by 2.
     . If the decimal number has n binary digits, the loop executes n times.
     . All operations inside the loop take constant time.

    2. Space Complexity = O(n)
     . The program uses a fixed number of variables:
      decnNum
      myNum
      pow
      binNum
      lastDigit
     . No extra arrays, lists, or recursion are used.
     . Memory usage does not depend on input size.

    # Solution :-

 */
    public class DecToBin{
    public static void decTobin(int decNum){
     int MyNum = decNum;
     int pow = 0;
     int binNum = 0;
     while(decNum>0){
        int rem = decNum%2;
    binNum = binNum + (rem * (int)Math.pow(10, pow));
    pow++;
    decNum = decNum/2;
     }
     System.out.println("Binary form of"+MyNum+ "="+binNum);
    }
    public static void main(String args[]){
        decTobin(7);
    }

    }
