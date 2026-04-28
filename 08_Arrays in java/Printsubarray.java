/** # Problrm Statement :- Write a Java program to print all possible subarrays of a given integer array.
---------------------------------------------------------------------------------------------------------------------------------
    # Condition :- A subarray is defined as a contiguous (continuous) sequence of elements taken from the original array.
                   The program should generate every possible subarray by selecting a starting index and an ending index 
                   and then print the elements between them.
---------------------------------------------------------------------------------------------------------------------------------
    # Approach(Code Logic) to Print All Subarrays :-

    1. Fix the starting index
       Use the outer loop to select the starting position (start) of the subarray.
       The starting index goes from 0 to n-1.

    2. Fix the ending index
       Use the second loop to select the ending position (end) of the subarray.
       The ending index starts from the starting index and goes till the last element.

    3. Print elements between start and end
       Use the third loop to print all elements from index start to end.
       These elements together form one subarray.

    4. Repeat for all index combinations
       Continue this process for all possible start and end index pairs to generate every contiguous subarray of the array.
----------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-
     
    1. Time Complexity = O(n³)
     . Outer loop → n times
     . Middle loop → n times
     . Inner loop → n times (in worst case)

    2. Space Complexity = O(1)
     . No extra arrays or data structures are used
     . Only a few integer variables (i, j, k, start, end)
------------------------------------------------------------------------------------------------------------------------------------
   # Solution :-
 */
public class Printsubarray{
    public static void Printsubarray(int number[]){
        for(int i=0; i<number.length;i++){
            int start = i;
        for(int j=i+1;j<number.length;j++){
            int end=j;
        for(int k=start;k<=end;k++){
            // Print Subarray
            System.out.println(number[k]+" ");
        }
        System.out.println();
        }
        System.out.println();
        }

    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10};
         Printsubarray(number);
    }
}