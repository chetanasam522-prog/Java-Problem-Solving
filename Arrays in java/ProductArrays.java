/** # Problem Statement :- Given an integer array nums, return an array result such that:
                           result[i] is equal to the product of all elements of nums except nums[i]. 
    
    # Condition :- . Do not use division.
                   . Solve it in O(n) time.
                   . Try to use constant extra space (excluding the output array).
-------------------------------------------------------------------------------------------------------------------------------------------------
    # Approach for This Code (Optimal Prefix–Suffix Method) :-

    . This code solves the Product of Array Except Self problem in an efficient way without using division.
    . Main Idea:
      Instead of multiplying all elements again and again, we break the problem into two parts:
      1.Prefix Product = Multiply elements on the LEFT
      2.  Suffix Product = Multiply elements on the RIGHT
--------------------------------------------------------------------------------------------------------------------------------------------------
    # Algorithm (Step-by-Step):-

    1. Create a result array
     . Make an array result[] of the same size as nums to store the final output.

    2. Store Prefix Products (Left Side)
     . Set result[0] = 1 because the first element has no left elements.
     . Traverse the array from left to right.
     . For every index i, calculate:
      result[i] = result[i-1] * nums[i-1];

    3. Calculate Suffix Products (Right Side)
     . Take a variable suffix = 1 to store the right-side product.
     . Traverse the array from right to left.

    4. Multiply Prefix and Suffix
     . For each index:
      result[i] = result[i] * suffix;

     . Update suffix:
       suffix *= nums[i];

    5. Return the Result Array
     . Now each index contains the product of all elements except itself.
------------------------------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity = O(n)
     . The array is traversed two times:
     . First loop → calculates prefix products.
     . Second loop → calculates suffix products.
     Even though there are two loops, we ignore constants in complexity

    2. Space Complexity = O(1)
     . We are NOT using any extra array.
     . Only one variable is used
       int suffix = 1;
     . Therefore, extra memory remains constant.
------------------------------------------------------------------------------------------------------------------------------------------------------
   # Code 
    */
public class ProductArrays {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix product
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // Step 2: Suffix product
        int suffix = 1;
        for(int i = n-1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] answer = productExceptSelf(nums);

        System.out.print("Output: ");
        for(int num : answer) {
            System.out.print(num + " ");
        }
    }
}

