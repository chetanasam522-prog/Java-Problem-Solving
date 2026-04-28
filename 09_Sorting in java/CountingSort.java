/** # Problem Statement :- Given an array of non-negative integers, sort the elements of the array in ascending order using the Counting Sort algorithm.
------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Approach (Counting Sort) :-

    Counting Sort does not compare elements.
    Instead, it counts how many times each value occurs and then rebuilds the sorted array.

    # Step-by-Step Approach:
    1. Find the maximum element in the array
     . This determines the size of the count array.

    2. Create a count array
     . Size = (maximum element + 1)
     . Initialize all values to 0.

    3. Count frequency of each element
     . Traverse the input array.
     . Increment count[value] for each occurrence.

    4. Reconstruct the sorted array
     . Traverse the count array from smallest to largest index.
     . Place each number in the original array based on its frequency.
------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Time and Space Complexity :-

    1. Time Complexity = O(n + k)
     . Finding max → O(n)
     . Counting frequency → O(n)
     . Rebuilding array → O(k) (k = range of elements)
     . Overall Time Complexity: O(n + k)

    2. Space Complexity = O(k)
     . Extra count array of size (max + 1)
-------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-

 */
public class CountingSort {

    // Function to perform counting sort
    public static void countingSort(int arr[]) {
        int n = arr.length;

        // Step 1: Find the maximum element
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int count[] = new int[max + 1];

        // Step 3: Store count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Rebuild the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
