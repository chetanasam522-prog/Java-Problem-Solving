/** # Problem Statement :- Print Inverted & Roteted Half-Pyramid    *
                                                                 *  *
                                                              *  *  *
                                                          *   *  *  *
                                                        
    # Logic (Step by Step) 
    
   1. Start the program
    . Program execution begins from the main() method.
   2. Call the pattern method
    . The method InvertedRotetedHalfPyramid(n) is called.
    . n represents the number of rows in the pyramid.
   3. Use an outer loop for rows
    . for (int i = 1; i <= n; i++)
    . This loop controls the number of rows in the pattern.
   4. Print spaces before stars
    . for (int j = 1; j <= n - i; j++)
    . This loop prints spaces before stars.
    . As the row number increases, the number of spaces decreases.
   5. Print stars
    . for (int j = 1; j <= i; j++)
    . This loop prints stars in each row.
    . The number of stars printed is equal to the current row number.
   6. Move to the next line
    . System.out.println();
    . After printing spaces and stars, the cursor moves to the next line.
   7. Repeat until all rows are printed
    . Steps 4 to 6 repeat until n rows are printed.

    # Time & Space Complexity :-
    1. Time Complexity 
     . Let n be the number of rows.
     . Loop Analysis
     . Outer loop runs n times.
     . First inner loop (spaces) runs (n − i) times for each row.
     . Second inner loop (stars) runs i times for each row.
     . Total operations per row
     . (n-i)+i = n
     . Time Complexity = O(n square)

     2. Space Complexity
      . No extra data structures (arrays, lists, etc.) are used.
      . Only loop variables (i, j, n) are used.
      . Memory usage does not depend on input size.
      . Space Complexity = O(n)

     # Solution :-
 */

public class InvertedRotetedHalfpyramid{
    public static void InvertedRotetedHalfpyramid(int n){
          
        // Outer loop
        for(int i=1; i<=n;i++){

        // Inner loop (Space)
        for(int j=1; j<=n-i;j++){
        System.out.print(" ");
        
        }
        // Inner loop (Star)
        for(int j=1; j<=i; j++){
        
        // Print Pattern
        System.out.print("*");
    
        }
         System.out.println();
        }
    }
    public static void main(String args[]){
        InvertedRotetedHalfpyramid(4);

    }
}