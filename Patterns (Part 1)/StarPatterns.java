 /** # Problem Statement :- Print Star Pattern  *
                                                **
                                                ***
                                                ****

    # Logic (Step by Step):-

    . The program starts execution from the main() method.
    . An outer for loop is used to control the number of rows.
    . The outer loop runs from 1 to n, where n represents total rows.
    . An inner for loop is used to control the number of stars in each row.
    . The inner loop runs from 1 to the current row number (i).
    . Inside the inner loop, System.out.print("*") prints stars in the same line.
    . After the inner loop completes, System.out.println() moves the cursor to the next line.
    . With each new row, the number of stars increases by one.
    . The process repeats until all rows are printed.
    . The program ends after printing the required star pattern.

    # Time & space complexity :-
    
    . Time Complexity O(𝑛 Square) Because the number of operations grows proportionally to nsquare.
    . Constant space is used regardless of input size O(n).

    # Solution :- **/
                                                                                                        
   public class StarPatterns{
    public static void main(String args[]){

        // Outer loop
        for(int i=1;i<=4;i++){

        // Inner loop
        for(int j=1;j<=i;j++){

        // Print Pattern
        System.out.print("*");
        }
        System.out.println();

        
        }
       
    }

   }                                      
                                         
                   