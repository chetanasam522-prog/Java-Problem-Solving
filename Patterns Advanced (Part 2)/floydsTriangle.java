/** # Problem Statement :- Print FLOYD'S Triangle   1
                                                    2 3
                                                    4 5 6
                                                    7 8 9 10  
                                                    11 12 13 14 15
    # Logic (Step by Step)
    
    1. Start the program
     . Program execution begins from the main() method.
    2. Call the Floyd’s Triangle method
     . FLOYDSTriangle(n) method is called.
     . n represents the number of rows to be printed.
    3. Initialize a counter
     . int counter = 1;
     . This variable stores the number to be printed in the triangle.
    4. Use an outer loop for rows
     . for (int i = 1; i <= n; i++)
     . This loop controls the number of rows.
    5. Use an inner loop for numbers
     . for (int j = 1; j <= i; j++)
     . This loop prints numbers in each row.
     . The number of elements printed in a row equals the row number.
    6. Print the counter value
     . System.out.print(counter + " ");
     . Prints the current value of counter.
    7. Increment the counter
     . counter++;
     . Ensures the next number is printed sequentially.
    8. Move to the next line
     . System.out.println();
     . Moves the cursor to the next row after completing one row.
    9. Repeat until all rows are printed
     . Steps 5 to 8 repeat until n rows are completed.
   10. End of the program
     . After printing all rows, the program terminates.

    # Time & Space Complexity :-

    1. Time Complexity 
     . Outer loop runs n times.
     . Inner loop runs i times for each row
     . Total Operations 1+2+3----n = n(n+1)/2
     . Time Complexity = O(n Square)

     2. Space Complexity
      . No extra data structures are used.
      . Only primitive variables (i, j, counter) are used.
      . Space Complexity = O(n)

     # Solution :-
 */

  public class floydsTriangle{
   public static void FLOYDSTriangle(int n){
    int counter = 1;

    // outer loop
    for(int i=1; i<=n; i++){
    
    // Inner loop
    for(int j=1; j<=i; j++){
    
    // Print Pattern
    System.out.print(counter + " ");
     counter++;
    }
    System.out.println();
    }
   }
   public static void main(String args[]){
    FLOYDSTriangle(5);
   }

  }
