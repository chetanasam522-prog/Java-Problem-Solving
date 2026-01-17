/** # Problem Statement :- Given an integer array arr[] of size n, find the maximum sum of any contiguous subarray using the Prefix Sum technique.
------------------------------------------------------------------------------------------------------------------------------------------------------
    # Code Approach (Prefix Sum Method) :-

   Step 1: Create Prefix Sum Array
         . Construct a prefix array where
         . prefix[i] = sum of elements from index 0 to i

   Step 2: Generate All Subarrays
           Use two loops:
         . Outer loop → starting index i
         . Inner loop → ending index j

   Step 3: Calculate Subarray Sum Efficiently
           If i == 0
           subarraySum = prefix[j]
           Else
          subarraySum = prefix[j] - prefix[i-1]

   Step 4: Track Maximum Sum
         . Compare each subarray sum with maxSum
         . Update maxSum if current sum is greater
------------------------------------------------------------------------------------------------------------------------------------------------------
    #  Time & Space Complexity :-

    1. Time Complexity = O(n²)
     * Prefix array creation:
     . One loop over n elements
     . Time = O(n)

     * Finding maximum subarray sum:
     . Two nested loops
     . Time = O(n²)

    2. Space Complexity = O(n)
     * Prefix array:
     . Uses an extra array of size n
     . Space = O(n)

     * Other variables:
     . Constant space = O(1)
------------------------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class PrefixSum {

    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // prefix[0]
        prefix[0] = arr[0];

        // build prefix array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // find max subarray sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {2, -4, 6, 8, -10, 100,120,135};
        maxSubarraySum(arr);
    }
}
    

