/** # Problem Statement :- Write a Java program to print all possible pairs of elements in a given integer array.
-------------------------------------------------------------------------------------------------------------------
    # Approach :-

    . Use two nested loops.
    . The outer loop selects the current element.
    . The inner loop selects the next elements to form pairs.
    . This avoids duplicate and reverse pairs.
--------------------------------------------------------------------------------------------------------------------
    # Code Logic (Step-by-Step):-

    . Start the outer loop with index i from 0 to length - 1.
    . Store the current element as curr = number[i].
    . Start the inner loop with index j = i + 1.
    . Pair curr with number[j].
    . Print the pair.
    . Continue until all unique pairs are printed.
---------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n²)
     . Two nested loops
     . Total comparisons ≈ n(n−1)/2

    2. Space Complexity = O(n)
     . Only variables i, j, and curr are used
     . No extra data structures
---------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class ArrayPair {
    public static void PrintPair(int number[]){
        for(int i=0;i<number.length;i++){
            int curr = number[i];
          for(int j=i+1;j<number.length;j++){
            System.out.println(curr+","+number[j]);
          }
        }

    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        PrintPair( number);
    }
    
}
