/** # Problem Statement :- Print Inverted Star Pattern    * * * *
                                                          * * *
                                                          * *
                                                          * 
                                          
    # Logic (Step by Step) :-

    1. Start the program from the main() method.
    2. Declare an integer variable n = 4, which represents the total number of rows.
    3. Use an outer for loop that runs from i = 1 to i = n.
     . Each iteration of this loop prints one row of the pattern.
    4. Inside the outer loop, use an inner for loop that runs from j = 1 to j = (n - i + 1).
     . This formula reduces the number of stars in each next row.
     . When i increases, the value of (n - i + 1) decreases.
    5. Inside the inner loop, print a star (*) using System.out.print("*").
     . Stars are printed on the same line.
    6. After the inner loop finishes, move to the next line using System.out.println().
    7. Repeat the process until the outer loop completes all rows.
    8. The program ends after printing the inverted star pattern.

    

    #  Time & Space Complexity :-

     1. Time Complexity = O(n²)
      . (Nested loops: outer loop × inner loop)

     2. Space Complexity = O(n)
      . (No extra memory used)


    # Solution :-
                                     
 */

    public class InvertedStarPattern{
        public static void main(String args[]){
         int n = 4;
            // outer loop
        for(int i=1; i<=n; i++){

            // Inner loop
        for(int j=1; j<=n-i+1; j++){

            // Print Pattern
            System.out.print("*");
        }
           // Next Line
           System.out.println();
        }
        }
    }

