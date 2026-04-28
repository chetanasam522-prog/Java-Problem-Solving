/** # Problem Statement :- Given an array of integers, sort the array in ascending order using the Insertion Sort algorithm.
-------------------------------------------------------------------------------------------------------------------------------------
    # Brute Force Approach for Insertion Sort :-

    1. For each element, compare it with all previous elements.
    2. Shift larger elements one by one to the right.
    3. Insert the element at its correct position.
    4. No optimization is used; every element may require multiple comparisons and shifts.
-------------------------------------------------------------------------------------------------------------------------------------
    # Brute Force Algorithm (Steps) :-

    1. Start from the second element of the array.
    2. Pick the current element.
    3. Compare it with all elements before it.
    4. Shift elements that are greater than the current element.
    5. Insert the current element at the correct position.
    6. Repeat until the array is fully sorted.
-------------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n²)
     . Every element is compared with all previous elements
     . Maximum shifts/swaps occur

    2. Space Complexity = O(1)
     . Uses only a constant number of variables (curr, prev, temp)
     . Sorting is done in-place
     . No extra array is used
-------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class InsertionSort {

    // Function to perform insertion sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];      // element to be inserted
            int prev = i - 1;

            // Shift elements of sorted part to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert the current element at correct position
            arr[prev + 1] = curr;
        }
    }

    // Function to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        insertionSort(arr);
        printArray(arr);
    }
}