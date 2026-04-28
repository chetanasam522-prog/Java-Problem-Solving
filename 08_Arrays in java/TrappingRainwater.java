/** # Problem Statement:- Given an array of non-negative integers where each element represents the height of a bar, 
                        find the total amount of rain water that can be trapped between the bars after rainfall.

    # Problem Conditions :- Width of each bar = 1 unit
                         Water can be trapped only if there are higher bars on both left and right sides
------------------------------------------------------------------------------------------------------------------------------
    #  Step-by-Step Approach :-

    Step 1: Find maximum height to the left of each bar
          . Create leftMax[]
          . Traverse from left to right
          . Store maximum height encountered so far

    Step 2: Find maximum height to the right of each bar
          . Create rightMax[]
          . Traverse from right to left
          . Store maximum height encountered so far

    Step 3: Calculate trapped water
          . For each index:
          . trappedWater += min(leftMax[i], rightMax[i]) − height[i]
-------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . Because the array is traversed a constant number of times, each in linear time.

    2. Space Complexity = O(n)
     . Extra Space Used:
     . leftMax[] array → size n
     . rightMax[] array → size n
--------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
    */

public class TrappingRainwater {
    public static int trap(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        // Left max
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap( height));
    }
}
