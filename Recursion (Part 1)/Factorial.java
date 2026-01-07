/** # Problem Statement :- Print Factorial of number n
   
    # Logic (Step by Step) :-

    1. Program execution starts from the main() method.
    2️. In main(), the method calculateFact(5) is called.
    3️. Inside calculateFact(n):
     . First, the base case is checked.
    4️ Base Case
      if (n == 1) {
      return 1;
     . When n becomes 1, recursion stops.
     . Factorial of 1 is 1.
    5️. If base case is false:
     . The function calls itself with n - 1.
    6️. The returned value fact_nm1 stores factorial of (n - 1).
    7️. Current factorial is calculated:
      fact_n = n * fact_nm1;
    8. The calculated factorial value is returned to the previous call.
    9️. All recursive calls return one by one until the final result reaches main().
    10️. The final factorial value is printed.

    # Time & Space Complexity :-

    1. Time Complexity :- O(n)
     . Function is called once for each value from n to 1.

    2. Space Complexity :- O(n)
     . Due to recursion call stack.

 */
public class Factorial {
    public static int calculateFact(int n){
        // Base case
        if(n==1){
            return 1;
        }

         // Recursive call
        int fact_nm1 = calculateFact(n-1);
        //  Calculate factorial
        int fact_n = n*fact_nm1;
        return fact_n;

    }
    public static void main(String args[]){
       int n =5;
       int ans = calculateFact(n);
       System.out.println(ans);

    }
    
}
