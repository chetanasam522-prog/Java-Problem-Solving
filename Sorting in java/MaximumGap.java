/** # Problem Statement :- You are given an unsorted integer array nums consisting of n elements.
                           Your task is to determine the maximum difference between two consecutive elements
                           in the array after sorting it in ascending order.
--------------------------------------------------------------------------------------------------------------------------------
    # Requirements :-

    1. If the array contains less than two elements, return 0.
    2. You must not sort the array directly using comparison-based sorting.
    3. The solution must run in:
    4. Linear time = O(n)
    5. Linear extra space = O(n) 
---------------------------------------------------------------------------------------------------------------------------------                    
    # Algorithm: (Maximum Gap ):-
    Step 1: Check array size
      . If the number of elements in the array is less than 2, return 0 because a gap cannot be formed.

    Step 2: Find minimum and maximum
      . Traverse the array once to find:
        min = smallest element
        max = largest element

    Step 3: Handle equal elements
      . If min is equal to max, all elements are the same.
      . In this case, return 0 because no gap exists.

    Step 4: Calculate bucket size
      . Compute bucket size using the formula:
        bucketSize = ceil((max − min) / (n − 1))
      . This ensures that the maximum gap will occur between buckets, not inside one.

    Step 5: Create buckets
      . Calculate the total number of buckets:
        bucketCount = (max − min) / bucketSize + 1
      . Create two arrays:
        bucketMin[] = stores minimum value of each bucket
        bucketMax[] = stores maximum value of each bucket
      . Initialize:
        bucketMin with +∞
        bucketMax with −∞

    Step 6: Distribute elements into buckets
      . For each element in the array:
      . Find its bucket index:
        index = (num − min) / bucketSize
      . Update the bucket’s minimum and maximum values.

    Step 7: Compute maximum gap
     . Initialize:
       maxGap = 0
       prevMax = min
     . Traverse all buckets:
     . Skip empty buckets
     . Calculate gap:
       gap = bucketMin[i] − prevMax
     . Update maxGap if the gap is larger
      Set prevMax = bucketMax[i]

    Step 8: Return result
     . Return maxGap as the maximum difference between two successive elements.
---------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity 
     . ( O(n) ) for bucket creation and iteration.

    2. Space Complexity
     .  ( O(n) ) for storing bucket info.
---------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
*/
import java.util.*;

public class MaximumGap {

    public static int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        int min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) {
            return 0;
        }

        int bucketSize = (int) Math.ceil((double)(max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // Place numbers into buckets
        for (int num : nums) {
            int index = (num - min) / bucketSize;
            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);
        }

        int maxGap = 0;
        int prevMax = min;

        // Compute max gap
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) {
                continue; // empty bucket
            }
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        System.out.println(maximumGap(nums)); // Output: 3
    }
}

