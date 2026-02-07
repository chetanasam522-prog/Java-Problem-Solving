/** # Problem Statement :- Given an integer array nums, sort the array in ascending order using the Heap Sort algorithm.
----------------------------------------------------------------------------------------------------------------------------------
    # Heap Sort Algorithm :-

    Step 1: Calculate the size of the array.
           n = arr.length

    Step 2: Build a Max Heap from the array.
          . Start from the last non-leaf node:
           i = n/2 - 1

    Step 3: Swap the root element with the last element of the heap.
          .  Root contains the largest element.

    Step 4: Reduce the heap size by 1.
          . Ignore the last element because it is now sorted.

    Step 5: Call heapify() on the root to restore heap property.

    Step 6: Repeat Steps 3–5 until the heap size becomes 1.
          . Array is now sorted in ascending order.
-------------------------------------------------------------------------------------------------------------------------------------
    # Time and Space Complexity :-
    1. Time Complexity = O(n Log n )
        . Building the heap takes O(n) time.
        . Each of the n elements is extracted form the heap and heapified, which takes O(log n) time.

    2. Space Complexity = O(1)
        . Heap Sort is an in-place sorting algorithm.
        . It does not require any additional data structures for sorting.
        . Therefore, the space complexity is O(1).
---------------------------------------------------------------------------------------------------------------------------------------
    # Code :-
*/   

import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr) {

        int n = arr.length;

        // Build Max Heap
        for(int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements
        for(int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {

        int largest = i; // root
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if(largest != i) {

            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        sort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
