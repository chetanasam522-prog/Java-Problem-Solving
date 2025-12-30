/** # Problem Statement :- Print Half-Pyramid Pattern  1
                                                       1 2
                                                       1 2 3
                                                       1 2 3 4
    # Logic (Step by Step):-

    . The program starts execution from the main() method.
    . An integer variable n is declared and initialized to 4, which represents the total number of rows.
    . An outer for loop runs from i = 1 to i = n.
    . The outer loop controls the current row number.
    . An inner for loop runs from number = 1 to number = i.
    . The inner loop controls the numbers printed in each row.
    . Inside the inner loop, System.out.print(number) prints numbers starting from 1 up to the current row number in the same line.
    . After the inner loop completes, System.out.println() moves the cursor to the next line.
    . With each new row, the count of printed numbers increases by one.
    . The program ends after printing the complete half pyramid number pattern.

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