/** # Problem Statement :- You are given an array nums of size n.
                           A majority element is the element that appears more than ⌊n/2⌋ times
                           You are guaranteed that such an element always exists
                           Your task: return that element
------------------------------------------------------------------------------------------------------------------------------
    # Approach: Majority Element 

    1. Initialize two variables:
     . candidate to store the potential majority element.
     . count to store the frequency balance of the candidate.

    2. Traverse the array once from left to right.

    3. When count becomes zero:
     . Assign the current element as the new candidate.
     . This means all previous elements have been canceled out.

    4. Update the count for each element:
     . If the current element is equal to the candidate, increment count.
     . Otherwise, decrement count.

    5. Continue this process for the entire array:
     . Different elements cancel each other’s count.
     . The majority element, appearing more than ⌊n/2⌋ times, cannot be completely canceled.

    6. Return the candidate at the end:
     . Since the problem guarantees that a majority element exists, the final candidate is the majority element.
---------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity = O(n)
     . The array is traversed only once
     . Each element is processed in constant time
     . an array of size n, Total operations = n

    2. Space Complexity = O(1)
     . Only two variables are used:
       candidate
       count
     . No extra data structures (arrays, hash maps, etc.)
---------------------------------------------------------------------------------------------------------------------------------
    # Code :-

    */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums)); // Output: 2
    }
}
