/** # Problem Statement :- Given a sorted array of integers and a key element, find the index of the key using Binary Search.
                           If the key is not present in the array, return -1.
------------------------------------------------------------------------------------------------------------------------------
    # Approach (Binary Search)

    . Binary Search works only on a sorted array.
    . Compare the key with the middle element of the array.
    . If the key is equal to the middle element, return its index.
    . If the key is greater than the middle element, search in the right half.
    . If the key is smaller than the middle element, search in the left half.
    . Repeat the process until the element is found or the search space becomes empty.
------------------------------------------------------------------------------------------------------------------------------
    # Code Logic (Step-by-Step)

    1. Initialize two pointers:
       start = 0
       end = n - 1   
       
    2. Run a loop while start <= end.

    3. Calculate the middle index:
       mid = (start + end) / 2

    4. If number[mid] == key, return mid.

    5. If number[mid] < key, update:
       start = mid + 1

    6. If number[mid] > key, update:
       end = mid - 1

    7. If the loop ends and the key is not found, return -1.
------------------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(log n)
     . Because the array is divided into half at each step.
                           
    2. Space Complexity = O(n)
     . Iterative Binary Search: O(1)
     . Only a few variables are used (start, end, mid).
------------------------------------------------------------------------------------------------------------------------------
    # Solution:-
    */
public class BinarySearch {
 public static int Binarysearch(int number[],int key){
    int start = 0;
    int end = number.length-1;
        while(start<=end){
        int mid = (start+end)/2;
        // Compare with middle element
        if(number[mid]==key){
        return mid;
        }
        // Search right half
        if(number[mid]<key){
         start = mid+1;
        }
        // Search left half
        if(number[mid]>key){
            end = mid-1;
        }
        }
    
    return -1; // Key not found
    
 }
 // Main method
 public static void main(String args[]){
  int number[]={2,4,6,8,10,12};
  int key = 10;
  int ans= Binarysearch(number,key);
  // Print key
  System.out.println(ans);
 }

    
}
