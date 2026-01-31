/** # Problem Statement :- Given an integer array nums of size n, where:
                           0 represents Red
                           1 represents White
                           2 represents Blue
                           Sort the array in-place so that objects of the same color are adjacent and arranged in the order:
                           Red (0) = White (1) = Blue (2)
---------------------------------------------------------------------------------------------------------------------------------------------
    # Code Approach (Dutch National Flag Algorithm) :-

    1. We use a three-pointer technique to divide the array into sections.
       Pointers Used:
     . low = keeps track of the position for next 0
     . mid = scans the array
     . high = keeps track of the position for next 2
----------------------------------------------------------------------------------------------------------------------------------------------
    # Algorithm: Sort Colors (Dutch National Flag Algorithm)

    Step 1: Start the algorithm.

    Step 2: Initialize three pointers:
     . low = 0 = position to place the next 0
     . mid = 0 = current element index
     . high = n - 1 = position to place the next 2

    Step 3: Repeat the following steps while mid <= high
    Case 1: If nums[mid] == 0
     . Swap nums[low] and nums[mid]
     . Increment low by 1
     . Increment mid by 1

    Case 2: If nums[mid] == 1
     . Increment mid by 1

    Case 3: If nums[mid] == 2
     . Swap nums[mid] and nums[high]
     . Decrement high by 1
     . Do NOT increment mid (because the swapped element needs checking)

    Step 4: Continue until all elements are processed (mid > high).

    Step 5: End — the array is now sorted in the order 0 → 1 → 2.
-----------------------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity = O(n)
     . The algorithm scans the array only once using the mid pointer.
     . Each element is visited at most one time.
     . Swapping takes constant time O(n).

    2. Space Complexity = O(1)
     . No extra array is created.
     . Only three variables are used.
-------------------------------------------------------------------------------------------------------------------------------------------------
    # Code :-
*/
public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0;              // pointer for 0
        int mid = 0;              // current pointer
        int high = nums.length - 1; // pointer for 2

        while (mid <= high) {

            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else { // nums[mid] == 2
                // swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
