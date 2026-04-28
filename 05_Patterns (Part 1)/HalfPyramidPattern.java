/** # Problem Statement :- Print Half-Pyramid Pattern    1
                                                         1 2
                                                         1 2 3
                                                         1 2 3 4
                                          
    # Logic (Step by Step) :-

    1. Start the program from the main() method.
    2. Declare an integer variable n = 4, which defines the total number of rows in the pattern.
    3. Use an outer for loop that runs from i = 1 to i = n.
     . Each iteration represents one row of the pattern.
    4. Inside the outer loop, use an inner for loop that runs from number = 1 to number = i.
     . This ensures that each row prints numbers starting from 1 up to the current row number i.
    5. Inside the inner loop, print the value of number using System.out.print(number).
     . print() keeps all numbers on the same line.
    6. After the inner loop completes, move to the next line using System.out.println().
    7. Repeat the process until all rows are printed.
    8. The program ends after printing the half pyramid number pattern.

    #  Time & Space Complexity :-

     1. Time Complexity = O(n²)
      . (Nested loops: outer loop × inner loop)

     2. Space Complexity = O(n)
      . (No extra memory used)


    # Solution :-
                                     
 */

    public class HalfPyramidPattern{
        public static void main(String args[]){
        int n=4;

        // outer loop
       for(int i=1; i<=n; i++){

        // Inner loop
       for(int number=1; number<=i; number++){

        // Print Pattern
        System.out.print(number);
       }
         // Next line
         System.out.println();
       }
        }
    }