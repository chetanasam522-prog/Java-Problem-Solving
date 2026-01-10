/** # Problem Statement :- Check if an array is sorted or not
    
    # Logic (Step by Step) :-

    1. Import statement
     . import java.util.*;
     . Used to access the Scanner class for taking user input.
     
    2. Class declaration
     . public class ArraySorted
     . Defines a class named ArraySorted.

    3. isSorted() method (Recursive Function)
       public static boolean isSorted(int idx, int[] arr)
     . idx → current index of array
     . arr → array to be checked
     . Returns true if array is sorted, otherwise false.

    4. Base Case
      if(idx == arr.length - 1){
      return true;
    }
     . If the index reaches the last element, it means all previous elements were in order.
     . So, the array is sorted → return true.

    5. Comparison Step
       if(arr[idx] < arr[idx + 1])
     . Compares current element with the next element.
     . Checks whether the order is increasing.

    6. Comparison Step
       if(arr[idx] < arr[idx + 1])
     . Compares current element with the next element.
     . Checks whether the order is increasing.

    7. Unsorted Condition
       else{
       return false;
    }
     . If any element is greater than or equal to the next element, the array is not sorted.
     . Function stops immediately and returns false.

    8. main() Method
     . Program execution starts from here.

    9. User Input
       Scanner Sc = new Scanner(System.in);
     . int n = Sc.nextInt();
     . Takes array size from the user.

    10. Array Creation & Input
       int arr[] = new int[n];
       for(int i = 0; i < n; i++){
       arr[i] = Sc.nextInt();
    }
    . Creates an array of size n.
    . Stores user-entered values.

    11. Function Call & Output
      System.out.println(isSorted(0, arr));
     . Calls isSorted() starting from index 0.
     . Prints true if sorted, otherwise false.

    # Time & Space Complexity :-

    1. Time Complexity = 0(n)
     . Reason:
     . The function isSorted() checks each element once.
     . For an array of size n, the recursion runs from index 0 to n-1.
     . Total Comparisons:
        (n − 1) comparisons

    2. Space Complexity = O(n)
     . Reason:
     . No extra data structures are used.
     . But recursion creates function calls in the call stack.
     . Maximum recursion depth = n.

    # Solution :-

 */
import java.util.*;
public class ArraySorted {
    public static boolean isSorted(int idx, int[]arr){
        // Base case
        if(idx==arr.length-1){
        return true;
        }
    

        if(arr[idx] < arr[idx+1]){
            return isSorted (idx+1,arr);

        }else{
            return false;
        }

    }
    public static void main(String args[]){
        // int arr[] = {1,3,3,2,0,6,7};
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your array size");
        int n = Sc.nextInt();
        // Create arr
        int arr [] = new int [n];
        for(int i=0; i<n;i++){
         arr[i] = Sc.nextInt();
        }
        // isSorted or not
        System.out.println(isSorted(0, arr));
    }
    
}
