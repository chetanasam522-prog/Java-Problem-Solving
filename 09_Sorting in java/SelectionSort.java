
/** # Problem Statement :- Given an unsorted array of integers, sort the array in ascending order using the Selection Sort algorithm.
------------------------------------------------------------------------------------------------------------------------------------------------
    # Brute Force Approach (Selection Sort)
    1. Idea:
     . Divide the array into two parts:
     . Sorted part (initially empty)
     . Unsorted part

    2. Repeatedly:
     . Find the minimum element from the unsorted part
     . Swap it with the first element of the unsorted part
     . Move the boundary of the sorted part one step forward

    3. Why is this a brute force approach?
     . For each position, we compare it with all remaining elements
     . No optimization is done to reduce comparisons
     . Works for all cases but is not efficient for large inputs
-------------------------------------------------------------------------------------------------------------------------------------------------
    # Point-Wise Code Logic (Selection Sort) :-

    1. An integer array number[] is given as input.

    2. The selectionsort() method is called to sort the array in ascending order.

    3. The outer for loop runs from index 0 to number.length - 1.
     . Each iteration represents one pass of the selection sort.

    4. In each pass, the current index i is assumed to contain the minimum element.
     . This position is stored in the variable minpos.

    5. The inner for loop starts from index i + 1 to the end of the array.
     . It searches the unsorted part of the array for the smallest element.

    6. During comparison:
     . If an element smaller than the current minimum is found,
     .  The index of that element is stored in minpos.

    7. After completing the inner loop, minpos holds the index of the smallest element in the unsorted part.

    8. The smallest element is swapped with the element at index i.
     . This places the correct element in its sorted position.

    9. Steps 3 to 8 are repeated until the entire array becomes sorted.

    10. The sorted array is printed using a for loop in the main() method.
--------------------------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n²)
     . Array is in reverse order
     . Same number of comparisons
     . For every element, the algorithm searches the minimum in the remaining array.

    2. Space Complexity = O(1)
     . Sorting is done in-place
     . Uses only a temporary variable (temp) for swapping
--------------------------------------------------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class SelectionSort {
    public static void selectionsort(int number[]){
        for(int i=0; i<number.length;i++){
            int minpos = i;
            for (int j=i+1; j<number.length;j++){
                if(number[minpos]>number[j]){
                    minpos = j;
                }
            }
             // Swap
             int temp = number[minpos];
             number[minpos] = number[i];
             number[i] = temp;
        }

    }
    public static void main(String args[]){
        int number[]={5,4,1,3,2};
        selectionsort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
        
    }
    
}
