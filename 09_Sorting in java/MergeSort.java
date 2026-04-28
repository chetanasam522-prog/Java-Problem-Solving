/** # Problem Statement :- Given an integer array arr[], write a program to sort the elements of the array in ascending order
 *                         using the Merge Sort algorithm.
                           The algorithm should divide the array into smaller subarrays, sort them recursively, 
                           and then merge the sorted subarrays to obtain the final sorted array.
------------------------------------------------------------------------------------------------------------------------------------
    # Approach (Merge Sort) :-

     The given code implements Merge Sort, which follows the Divide and Conquer technique.

    Step 1: Divide the Array
     . The function mergeSort(arr, left, right) checks if the array has more than one element.
     . It calculates the middle index and divides the array into two halves.
     . int mid = left + (right - left) / 2;
    
    Step 2: Recursive Sorting 
     . The left half (left to mid) is sorted recursively.
     . The right half (mid + 1 to right) is sorted recursively.
     . mergeSort(arr, left, mid);
     . mergeSort(arr, mid + 1, right);

    Step 3: Merging the Sorted Halves
     . Two temporary arrays L[] and R[] are created to store elements of the left and right subarrays.
     . Elements from both arrays are compared one by one.
     . The smaller element is copied back into the original array.
     . Remaining elements (if any) are copied at the end.
      if (L[i] <= R[j]) {
       arr[k] = L[i];
      } else {
        arr[k] = R[j];
       }

    Step 4: Final Sorted Array
     . The divide and merge process continues until the entire array is merged back in sorted order.
     . The printArray() function displays the sorted result.
---------------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-

    1. Time Complexity = O(n log n)
    Merge Sort always divides the array into two halves and merges them.
    *  Best Case = O(n log n)
     . Even if the array is already sorted, merge sort still divides and merges.

    * Average Case = O(n log n)
     . Each level of division takes O(n) time for merging, and there are log n levels.

    *  Worst Case = O(n log n)
     . Same process regardless of input order

    2. Space Complexity = O(n)
     . Temporary arrays L[] and R[] are created during merging.
     . Extra space is needed to store these arrays.
     . Recursive function calls also use stack space.

    * Auxiliary Space
     . O(n) (temporary arrays)

    * Recursive Stack Space
     . O(log n)
----------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class MergeSort {

    // Main function to sort the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {

            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two subarrays
    public static void merge(int[] arr, int left, int mid, int right) {

        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
