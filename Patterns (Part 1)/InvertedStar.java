/** # Problem Statement :- Print Inverted-Star Pattern  ****
                                                        ***
                                                        **
                                                        *

    # Logic (Step by Step):-

    . The program starts execution from the main() method.
    . An integer variable n is initialized to define the number of rows.
    . An outer for loop runs from i = 1 to i = n.
    . The outer loop controls the current row number.
    . An inner for loop runs from j = 1 to j = n - i + 1.
    . The expression n - i + 1 ensures that:
    . First row prints n stars
    . Each next row prints one less star
    . Inside the inner loop, System.out.print("*") prints stars in the same line.
    . After the inner loop finishes, System.out.println() moves the cursor to the next line.
    . The process repeats until all rows are printed.
    . The program ends after generating the inverted star pattern.


    # Time & space complexity :-
    
    . Time Complexity O(𝑛 Square) Because the number of operations grows proportionally to nsquare.
    . Constant space is used regardless of input size O(n).

    # Solution :- **/

    public class InvertedStar{
        public static void main(String args[]){

        // Outter loop
        int n= 4;
        for(int i=1;i<=n;i++){

        // Inner loop
        for(int j=1;j<=n-i+1;j++){

        // Print Pattern
        System.out.print("*");
        }
        System.out.println();
        }
        }
    }