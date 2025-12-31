/** # Problem Statement :- Print ZeroOneTriangle  1
                                                  0 1
                                                  1 0 1
                                                  0 1 0 1
                                                  1 0 1 0 1
                                                        
    # Logic (Step by Step) 
    
    1. Start the program
     . Program execution starts from the main() method.
    2. Call the ZeroOneTriangle method
     . ZeroOneTriangle(n) method is called.
     . n represents the number of rows in the triangle.
    3. Use an outer loop for rows
     . for (int i = 1; i <= n; i++)
     . This loop controls how many rows are printed.
    4. Use an inner loop for columns
     . for (int j = 1; j <= i; j++)
     . This loop prints elements in each row.
     . The number of elements in a row equals the row number.
    5. Check condition (even or odd sum)
     . (i + j) % 2 == 0
     . If the sum of row index and column index is even, print 1.
    6. Print 0 for odd sum
     . If (i + j) is odd, print 0.
    7. Move to the next line
     . System.out.println();
     . After completing one row, the cursor moves to the next line.
    8. Repeat until all rows are printed
     . Steps 4 to 7 repeat until n rows are completed.
    9. End of the program
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

     public class ZeroOneTriangle {
        public static void ZeroOneTriangle(int n){

        // outer loop
        for(int i=1; i<=n; i++){

        // Inner loop
        for(int j=1; j<=i; j++){
        if((i+j)%2==0){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
        }
        System.out.println();
        }
        }
        public static void main(String args[]){
        ZeroOneTriangle(5);
        }
     }