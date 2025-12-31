/** # Problem Statement :- Print Character Pattern  A
                                                    B C
                                                    D E F
                                                    G H I J
    # Logic (Step by Step):-

    . The program starts execution from the main() method.
    . An integer variable n is initialized to 4, representing the number of rows.
    . A character variable ch is initialized with the value 'A'.
    . An outer for loop runs from i = 1 to i = n.
    . The outer loop controls the current row number.
    . An inner for loop runs from chars = 1 to chars = i.
    . The inner loop decides how many characters are printed in each row.
    . Inside the inner loop:
    . The current character stored in ch is printed using System.out.print(ch).
    . The character ch is then incremented to the next alphabet using ch++.
    . After the inner loop completes, System.out.println() moves the cursor to the next line.
    . The process repeats until all rows are printed, and the program ends.

    # Time & space complexity :-
    
    . Time Complexity O(𝑛 Square) Because the number of operations grows proportionally to nsquare.
    . Constant space is used regardless of input size O(n).

    # Solution :- **/

    public class CharacterPattern{
        public static void main(String args[]){
            int n=4;
            char ch = 'A';
        // Outter loop
        for(int i =1;i<=4; i++){
        
        // inner loop
        for(int chars = 1; chars<=i;chars++){
        
        //  Print Pattern
        System.out.print(ch);
        ch++;
        }
        System.out.println();
        }
        }
    }