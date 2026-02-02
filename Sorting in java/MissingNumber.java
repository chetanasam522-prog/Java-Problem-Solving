/** # Problem Statement :- Given an array nums containing n distinct numbers taken from the range [0, n], 
 *                         return the only number missing from the array.
-----------------------------------------------------------------------------------------------------------------------------
    # Algorithm MissingNumber(nums):-

    1. Let n = length of nums.
    2. Compute expected sum using formula
    3. expectedSum = n * (n + 1) / 2
    4. Initialize actualSum = 0.
    5. Traverse the array and add all elements to actualSum.
    6. Return expectedSum - actualSum.
------------------------------------------------------------------------------------------------------------------------------
    # Approach (Step-by-Step)
    Step 1: Understand the Range
    . The array has n elements.
    . Numbers should be from 0 to n.
    . That means exactly one number is missing.
      nums = [3, 0, 1]
      n = 3
      Expected numbers → 0,1,2,3
      Missing = 2

    Step 2: Find Expected Sum
    . Use the mathematical formula:
     Sum = n * (n + 1) / 2

    Step 3: Calculate Actual Sum of Array
    . Loop through the array and add all elements.
      int actualSum = 0;
        for (int num : nums) {
       actualSum += num;
    }

    Step 4: Find the Missing Number
   Subtract:
    . Missing Number = Expected Sum - Actual Sum
--------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity = O(n)
     . we traverse the array only one time to calculate the actual sum.

    2. Space Complexity = O(1)
     . We are not using any extra data structures like arrays, hash maps, or lists.
     . Only a few variables are used:
       n
      expectedSum
      actualSum
---------------------------------------------------------------------------------------------------------------------------------
    # Solution :-

 **/
public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Actual sum of array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing Number is: " + missingNumber(nums));
    }
}

