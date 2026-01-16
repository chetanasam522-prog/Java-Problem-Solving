/** # Problem Statement :- Write a Java program to find the maximum sum among all possible subarrays of a given integer array.
----------------------------------------------------------------------------------------------------------------------------------
    # Approach (Brute Force Method) :-  

    1. Initialize a variable maxsum with the minimum possible integer value to store the maximum subarray sum.
    2. Use the outer loop to select the starting index of the subarray.
    3. Use the second loop to select the ending index of the subarray.
    4. For each (start, end) pair, use a third loop to calculate the sum of elements between them.
    5. Compare the current subarray sum with maxsum and update maxsum if the current sum is greater.
    6. Repeat the process for all possible subarrays.
    7. Finally, print the maximum subarray sum.
----------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n³)
     . Outer loop (i) = runs n times
     . Middle loop (j) = runs up to n times
     . Inner loop (k) = runs up to n times to calculate subarray sum

    2. Space Complexity = O(1)
     . No extra arrays or data structures are used.
     . Only a few integer variables (maxsum, currsum, loop counters).
-----------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */

public class MaxSubArraySum{
    public static void maxsubarraysum(int number[]){
        int maxsum = Integer.MIN_VALUE;
        // outer loop
    for(int i=0;i<number.length;i++){
        int start = i;
       // inner loop
    for(int j=i; j<number.length;j++){
        int end = j;
        int currsum=0;
    for(int k=start; k<=end; k++){
         currsum+= number[k];
    }
    // print currsum
    System.out.println(currsum);
     if(currsum>maxsum){
        maxsum=currsum;
     }
    }
    }
     // print max subarray sum
     System.out.println("maxsum=" +maxsum);

    }
    public static void main(String args[]){
        int number[]={2,4,6,8};
        maxsubarraysum(number);
    }
}