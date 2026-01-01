/** # Problem Statement :- Print Character Pattern    A
                                                      B C
                                                      D E F
                                                      G H I J
                                          
    # Logic (Step by Step) :-

    1. Start the program from the main() method.
    2. Declare an integer variable n = 4, which decides the number of rows.
    3. Declare a character variable ch = 'A', which stores the starting alphabet.
    4. Use an outer for loop that runs from i = 1 to i = n.
     . Each iteration represents one row of the pattern.
    5. Inside the outer loop, use an inner for loop that runs from chars = 1 to chars = i.
     . This ensures the number of characters printed in each row equals the row number.
    6. Inside the inner loop:
     . Print the current character using System.out.print(ch).
     . Increment the character using ch++ to move to the next alphabet.
    7. After the inner loop completes, move to the next line using System.out.println().
    8. Repeat the process until all rows are printed.
    9. The program ends after printing the character pattern.

    #  Time & Space Complexity :-

     1. Time Complexity = O(n²)
      . (Nested loops: outer loop × inner loop)

     2. Space Complexity = O(n)
      . (No extra memory used)


    # Solution :-
                                     
 */

    public class CharacterPattern{
        public static void main(String args[]){
            int n=4;
            char ch ='A';

            // outer loop
        for(int i=1; i<=n; i++){

            // Inner loop
        for(int chars= 1; chars<=i; chars++){

            // Print Pattern
            System.out.print(ch);
            ch++;
        }
           // Next Line
           System.out.println();
        }
        }
    }