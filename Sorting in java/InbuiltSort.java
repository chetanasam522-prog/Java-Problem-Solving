/** # Problem Statement :- Given an array of integers, sort the array in ascending order using Java’s inbuilt sorting method.
-----------------------------------------------------------------------------------------------------------------------------------------
    # Brute Force Approach (Concept) :-

    1. The brute force approach to sorting is:
     . Compare each element with every other element
     . Swap elements if they are in the wrong order
     . Repeat until the array is sorted
-----------------------------------------------------------------------------------------------------------------------------------------
    # Optimized Approach (Inbuilt Sort) :-

    1. Java provides an inbuilt sort function that uses highly optimized algorithms:
     . Arrays.sort() → for arrays
     . Uses Dual-Pivot QuickSort (for primitive types)
    This is much faster than brute force sorting.
-----------------------------------------------------------------------------------------------------------------------------------------
    # Code Logic (Point-wise) :-

    1. Import java.util.Arrays
    2. Declare and initialize the array
    3. Call Arrays.sort(arr)
    4. The function automatically sorts the array in ascending order
    5. Print the sorted array using a loop 
-----------------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-
    
    1. Time Complexity = O(n logn)
     
    2. Space Complexity = O(logn)
     . Due to recursive calls in QuickSort
     . No extra array is created
-----------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 
 */
import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 3, 2};

        // Inbuilt sort function
        Arrays.sort(arr);

        // Printing sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
