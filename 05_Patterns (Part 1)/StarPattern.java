/** # Problem Statement :- Print Star Pattern    *
                                               *    *
                                             *    *    *
                                          *    *     *    *
                                          
    # Logic (Step by Step) :-

    1. Start the program from the main() method.
    2. Use an outer for loop to control the number of rows.
     . The loop runs from i = 1 to i = 4.
     . Each iteration of this loop prints one row.
    3. Inside the outer loop, use an inner for loop to control the number of stars in each row.
     . The inner loop runs from j = 1 to j = i.
     . This ensures that the number of stars printed is equal to the current row number.
    4. Inside the inner loop, print a star (*) using System.out.print("*").
     . print() is used so that stars appear on the same line.
    5. After the inner loop finishes, move the cursor to the next line using System.out.println().
    6. Repeat steps 3 to 5 for each row until the outer loop completes.
    7. The program ends after all rows are printed.


    #  Time & Space Complexity :-

     1. Time Complexity = O(n²)
      . (Nested loops: outer loop × inner loop)

     2. Space Complexity = O(n)
      . (No extra memory used)


    # Solution :-
                                     
 */
   public class  StarPattern{
    public static void main(String args[]){

        // outer loop
    for(int i=1; i<=4;i++){

        // Inner loop
    for(int j=1; j<=i; j++){

        // Print Pattern
    System.out.print("*");
    }
        // Next line 
        System.out.println();
    }
    }
   }
