/** # Problem Statement :- Given an array of integers, sort the array in ascending order using the Quick Sort algorithm.
-----------------------------------------------------------------------------------------------------------------------------------
    # Approach (Quick Sort) :-

    1. Select a pivot element from the array (here, last element).

    2. Rearrange the array such that:
     . Elements smaller than pivot are placed to the left
     . Elements greater than pivot are placed to the right

    3. Pivot reaches its correct sorted position.

    4. Recursively apply the same steps to left and right subarrays.

    5. Continue until the entire array is sorted.
-------------------------------------------------------------------------------------------------------------------------------------
    # Time And Space Complexity :-
    
    1. Time Complexity = O(n²)
     . Pivot is always smallest or largest element (already sorted array)

    2. Space Complexity = O(log n)
     . O(log n) = due to recursive call stack
     . No extra array is used = in-place sorting
-------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */

public class QuickSort {

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];   // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
