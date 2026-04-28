/** # Problem Statement:- Clculate BioCofficient 
 
    # Logic (Step by Step):-
    1. Start the program execution from the main() method.
    2. Call the BioCofficient(n, r) method with values n = 5 and r = 2.
    3. Inside BioCofficient() method, call the factorial(n) method to calculate n!.
    4. In the factorial() method:
     . Initialize fact = 1.
     . Multiply numbers from 1 to n using a loop.
     . Return the factorial value.
    5. Store the returned value of n! in fact_n.
    6. Call factorial(r) to calculate r! and store it in fact_r.
    7. Call factorial(n - r) to calculate (n - r)! and store it in fact_nmr.
    8. Apply the binomial coefficient formula:
     . nCr = n! / (r! × (n − r)!)
    9. Store the calculated result in bincoeff.
   10. Return bincoeff to the main() method.
   11. Print the returned result using System.out.println().
   12. End the program.

   # Time & Space Complexity :-
   . Time Complexity:- O(n)
   . Space Complexity:- O(n)

   # Solution:-
*/

public class BioCofficient {

    // factorial method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // nCr method
    public static int BioCofficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static void main(String args[]) {
        System.out.println(BioCofficient(5,2));
    }
}
