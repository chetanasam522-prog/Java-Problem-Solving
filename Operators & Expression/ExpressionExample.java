//   # Problem-Statement:- Write a following expression in java program.

//  # Logic (Step-by-Step):-
// . Declare two variables u and v.
// . Square the values using multiplication (v * v, u * u).
// . Multiply v² by 2.
// . Subtract u² from 2v².
// . Divide the final value by 245.
// . Store the result in a double variable to get accurate output.

//  # Time & Space Complexity:-
//  . Time Complexity = O(n)
//  . Space Complexity = O(n)

//   # Solution:-

public class ExpressionExample {
    public static void main(String[] args) {

        // Declare variables
        double u = 10;
        double v = 20;

        // Expression: (2v^2 - u^2) / 245
        double result = (2 * v * v - u * u) / 245;

        // Display result
        System.out.println("Result = " + result);

    }
}