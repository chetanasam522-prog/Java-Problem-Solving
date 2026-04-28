/** # Problem Statement :- Write a program to convert Binary to Decimal
 
    # Logic (Step by Step) :-
     
    1. Start the program.
    2. Create a method binTodec(int binNum) to convert a binary number into decimal.
    3. Store the original binary number in another variable (myNum) so it can be printed later.
    4. Initialize variables:
     . pow = 0 → represents the power of 2.
     . decNum = 0 → stores the final decimal value.
    5. Repeat the process while binNum is greater than 0:
     . Extract the last digit of the binary number using binNum % 10.
     . Multiply the extracted digit with 2 raised to the power pow.
     . Add this value to decNum.
     . Increase the power value by 1.
     . Remove the last digit from binNum using integer division by 10.
    6. Continue the loop until all binary digits are processed.
    7. Print the decimal equivalent of the original binary number.
    8. End the program.

    # Time & Space Complexity :-
    1. Time Complexity = O(n)
     . The while loop runs once for each digit in the binary number.
     . If the binary number has n digits, the loop executes n times.
     . Each loop iteration does constant time work (mod, division, multiplication).

    2. Space Complexity = O(n)
     . The program uses a fixed number of variables:
      binNum
      myNum
      pow
      decNum
      lastDigit
     . No extra arrays, lists, or recursion are used.
     . Memory usage does not depend on input size.

    # Solution :-

 */
public class BinToDec{
    public static void binTodec(int binNum){
        int MyNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
        int lastdigit = binNum%10;
        decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
         pow++;
         binNum = binNum/10;
        }
        System.out.println("Decimal form of "+ MyNum +"="+ decNum);

    }
    public static void main(String args[]){
        binTodec(101);
    }
}