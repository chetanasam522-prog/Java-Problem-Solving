/** # Problem Statement :- Given an integer array nums, find all unique triplets [nums[i], nums[j], nums[k]] such that:
                           . i ≠ j, i ≠ k, and j ≠ k
                           . nums[i] + nums[j] + nums[k] = 0
                           . The solution set must not contain duplicate triplets.
---------------------------------------------------------------------------------------------------------------------------------
    # Algorithm Steps :-

    1. Sort nums

    2. Loop i from 0 to n - 3
       Skip duplicate nums[i]

    3. Use two pointers to find pairs:
       If sum = 0 → store triplet
       If sum < 0 → move left
       If sum > 0 → move right

    4. Skip duplicates for left and right
---------------------------------------------------------------------------------------------------------------------------------
    # Point-Wise Code Logic (3Sum) :-

    1. Sort the array
     . Sorting helps in:
     . Applying the two-pointer technique
     . Easily avoiding duplicate triplets

    2. Fix the first element
     . Traverse the array using index i from 0 to n − 3
     . Treat nums[i] as the first element of the triplet

    3. Skip duplicate first elements
     . If nums[i] is same as nums[i − 1], skip it
     . This prevents duplicate triplets

    4. Initialize two pointers
     . left = i + 1
     . right = n − 1
     . These pointers find the remaining two elements

    5. Calculate the sum
     . sum = nums[i] + nums[left] + nums[right]

    6. If sum equals zero
     . Store the triplet in the result list
     . Move both pointers inward

    7. Skip duplicate second and third elements
     . Increment left while nums[left] == nums[left + 1]
     . Decrement right while nums[right] == nums[right − 1]

    8. If sum is less than zero
     . Increase left to get a larger sum

    9. If sum is greater than zero
     . Decrease right to get a smaller sum

    10. Repeat until pointers meet
      . Continue while left < right

    11. Return the result list
      . Contains all unique triplets with sum zero
----------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n²)
     . Sorting the array:
       Takes O(n log n)

     . Main loop + two-pointer search:
       Outer loop runs n times
       Inner two-pointer traversal runs O(n)
       Total = O(n²)

    2. Space Complexity = O(1)
     . No extra data structures are used (only pointers and variables)
     . Sorting is done in place
-----------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
                           
    */
import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
