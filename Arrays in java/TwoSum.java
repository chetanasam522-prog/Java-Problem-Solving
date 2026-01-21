/** # Problem Statement :- Given an array of integers nums and an integer target, find indices of two distinct elements in the array such that their sum is equal to the target. 
    
    # Problem Condition :- . Exactly one valid solution exists.
                           . The same element cannot be used twice.
                           . The indices can be returned in any order.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Approach (Two Sum using HashMap)

    1. Create a HashMap
       Use a HashMap to store each array element as the key and its index as the value.

    2. Traverse the array once
       Loop through the array from the first element to the last.

    3. Find the required complement
       For each element nums[i], calculate the number needed to reach the target:
       complement = target − nums[i]

    4. Check for complement in HashMap
       If the complement already exists in the HashMap, it means the required pair is found.
       Return the index stored in the HashMap and the current index.

    5. Store the current element
       If the complement is not found, store the current element and its index in the HashMap for future checks.

    6. Stop when solution is found
       Since the problem guarantees exactly one solution, the loop ends as soon as the pair is found.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    #  Time & Space Complexity :-

    1. Time Complexity = O(n)
     . Explanation:
     . The array is traversed only once.
     . Each HashMap operation (put, containsKey, get) takes O(1) average time.
     . Therefore, total time taken is proportional to the number of elements n.

    2. Space Complexity = O(n)
     . Explanation:
     . In the worst case, all elements are stored in the HashMap.
     . The HashMap can store up to n key–value pairs.
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
*/

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        return new int[] {}; // This line will never be reached (given exactly one solution)
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
