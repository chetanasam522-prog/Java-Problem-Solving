/** # Problem Statement :- Given an array of integers (which may contain positive, negative, or zero values), 
                          find the maximum sum of a contiguous subarray using Kadane’s Algorithm.
------------------------------------------------------------------------------------------------------------------------------
    # Approach (Kadane’s Algorithm) :-

    * The main idea of Kadane’s Algorithm is:
    . Traverse the array only once
    . Maintain a current sum of elements
    . If the current sum becomes negative, discard it and start a new subarray
    . Keep track of the maximum sum obtained so far
    This works because a negative sum will reduce the total of any subarray that follows.
------------------------------------------------------------------------------------------------------------------------------
    # Code Logic (Step by Step):-

    1. Initialize:
     . currsum = 0 → stores sum of current subarray
     . maxsum = Integer.MIN_VALUE → stores maximum sum found

    2. Traverse the array using a loop

    3. Add current element to currsum

    4. If currsum becomes negative:
     . Reset currsum to 0
       (negative sum cannot contribute to maximum subarray)

    5. Update maxsum by comparing it with currsum

    6. After loop ends, maxsum contains the maximum subarray sum
------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity =O(n)
     . The array is traversed only once
     . Hence linear time complexity

    2. Space Complexity = O(1)
     . Only two variables (currsum and maxsum) are used
     . No extra space required
------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 * */

public class KadanesAlgorithm {
    public static void Kadanesalgorithm(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0; i<number.length;i++){
            currsum += number[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum = Math.max(currsum,maxsum);

        }
            // Print maxsum
        System.out.println("Maxsum sum is ="+maxsum);

    }
    public static void main(String args[]){
        int number[]={-2,-3,6,8,9,10};
        Kadanesalgorithm(number);

    }
    
}
