/** # Problem Statement :- Given an integer array, sort the elements in ascending order using the Bubble Sort algorithm. 
------------------------------------------------------------------------------------------------------------------------
    # Approach (Algorithm) :-. Store the array size in n
                             . Run the outer loop from 0 to n - 1
                             . Run the inner loop from 0 to n - 1 - i
                             . Compare adjacent elements
                             . Swap if they are in the wrong order
                             . Continue until all elements are sorted
------------------------------------------------------------------------------------------------------------------------
    # Logic(Step by Step) :-

    1. Find the length of the array (n)
    2️. Use an outer loop to control the number of passes
     . Bubble Sort requires n − 1 passes
     . After each pass, one largest element reaches its correct position
    3️. Use an inner loop to compare adjacent elements
     . Compare arr[j] and arr[j + 1]
     . Skip already sorted elements at the end (n - 1 - i)
    4️. If arr[j] > arr[j + 1]
     . Swap the two elements
    5️. After all passes are completed
     . The array becomes fully sorted
------------------------------------------------------------------------------------------------------------------------
    # The main idea behind Bubble Sort is:
     
    . Repeatedly compare adjacent elements
    . Swap them if they are in the wrong order
    . After each pass, the largest element moves to the end of the array
    . Repeat this process until the array becomes completely sorted
    . It is called Bubble Sort because larger elements bubble up to the end of the array. 
-----------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :

    1. Time Complexity = O(n²)
     . Array is sorted in reverse order
     . Maximum number of swaps occur

    2. Space Complexity = O(n)
     . Bubble Sort sorts the array in-place
     . No extra data structures are used
     . Only a temporary variable is used for swapping
-----------------------------------------------------------------------------------------------------------------------
    # Solution :
**/
public class BubbleSort {

    public static void bubblesort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {           // passes
            for (int j = 0; j < n - 1 - i; j++) {   // comparisons
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubblesort(arr);
        printArr(arr);
    }
}
