/** # Problem Statement :- Write a Java program to reverse the elements of a given integer array in place without using any extra array.
-----------------------------------------------------------------------------------------------------------------------------------------
    # Approach :-

    . Use the two-pointer technique.
    . Initialize one pointer at the start of the array and another at the end.
    . Swap the elements at these positions.
    . Move the start pointer forward and the end pointer backward.
    . Repeat the process until both pointers meet. 
-----------------------------------------------------------------------------------------------------------------------------------------
    # Code logic (Step by Step):-
    
    1. Create a method reverseArray(int number[]) to reverse the array.
    2. Initialize:
       first = 0 (starting index)
       last = number.length - 1 (ending index)
    3. Run a while loop while first < last.
    4. Inside the loop:
     . Store the value of number[last] in a temporary variable temp.
     . Assign number[first] to number[last].
     . Assign temp to number[first].
    5. Increment first and decrement last after each swap.
    6.This process continues until the array is completely reversed.
    7. In the main() method, call reverseArray() and print the reversed array.
-----------------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity =O(n)
     . The while loop runs until first < last.
     . Each iteration swaps two elements.
     . Total number of swaps ≈ n / 2 for an array of size n.

    2. Space Complexity = O(n)
     . The algorithm uses:
     . Only one temporary variable (temp)
     . No extra array is used.
     . Reversal is done in place.
-------------------------------------------------------------------------------------------------------------------------------------------
   # Solution :-
 */
public class ReverseArray {
    public static void reverseArray(int number[]){
        int first=0;
        int last = number.length-1;
        while(first<last){
            //Swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        reverseArray( number);
        for(int i=0;i<number.length; i++){
        // Print Reverse array
        System.out.println(number[i]+"");
        }
    }
    
}
