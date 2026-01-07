/** # Problem Statement :- Print the Fibonacci Sequence
 
    # Logic (Step by step) :-

    1. Program execution starts from the main() method.
    2️. Two variables are initialized:
     . a = 0 (first Fibonacci number)
     . b = 1 (second Fibonacci number)
    3️. Both a and b are printed.
    4️. Variable n stores how many Fibonacci numbers are needed.
    5️. Method printFibonaci(a, b, n-2) is called because:
     . First two numbers are already printed.
    6️. Inside printFibonaci() the base case is checked
      if (n == 0) {
      return;
     . Stops recursion when required numbers are printed.
    7️. The next Fibonacci number is calculated:
      c = a + b;
    8. The new number c is printed.
    9️. Recursive call is made
      printFibonaci(b, c, n - 1);
      Shift values forward
      Reduce n by 1
    10️. Steps 6 to 9 repeat until n becomes 0.
    11. Program ends.

    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . One recursive call per Fibonacci number.

    2. Space Complexity = O(n)
     . Due to recursion call stack.

 */
public class Fibonacci {
    public static void printFibonaci(int a, int b, int n){
        // base case
        if(n==0){
        return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonaci(b, c, n-1);
    }
    public static void main(String args[]){
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int n=7;
        printFibonaci(a,b,n-2);
    }
    
}
