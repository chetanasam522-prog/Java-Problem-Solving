 /** # Problem Statement :- Print Number Form 5 t0 1
 
    # Logic (Step by step) :-

    1. Start the program
    2️. Call the method printNum(n) from main() with n = 5
    3️. Check base condition
     . If n == 0
     . Stop the function using return
    4️. Print the current value of n
     . System.out.println(n);
    5️. Call the same function again
     . Call printNum(n - 1)
     . This reduces the value of n by 1 each time
    6️. Repeat steps 3 to 5
     . Until n becomes 0
    7️. When n == 0
     . Function stops
     . Control returns back step-by-step.
    8. End of program

    # Time & Space Complexity :-

    1. Time Complexity :- O(n)
     . Because the function is called once for each value from n to 1.

    2. Space Complexity :- O(n)
     . Because recursion uses the call stack (one stack frame per call).

    # Solution :-

 */
public class PrintNumbers {
    public static void printNum(int n){
        // Base Condition
        if(n==0){
        return;
        }
        // Print Number
        System.out.println(n);
        printNum (n-1);
    }
    public static void main(String args[]){
        int n = 5;
        printNum(n);
    }
    
}
