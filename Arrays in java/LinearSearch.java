/** # Problem Statement :- Given an array of integers and a key element, write a program to search for the key using Linear Search.
                           If the key is found, return its index position; otherwise, return -1.
----------------------------------------------------------------------------------------------------------------------------------------   
#  Approach:- 
  . Start from the first element of the array              
  . Compare each element with the given key.
  . If a match is found, return the index immediately.
  . If the entire array is traversed and the key is not found, return -1.
----------------------------------------------------------------------------------------------------------------------------------------
# Algorithm (Step-by-Step):-

  . Take an array number[] and a value key.
  . Loop from index 0 to number.length - 1.
  . If number[i] == key, return i.. If loop ends, return -1.
----------------------------------------------------------------------------------------------------------------------------------------
# Logic (Step by Step):-

  1. Method: linearSearch
   . public static int linearSearch(int number[], int key)
   . number[] → array in which we search
   . key → element to be searched
     Returns:
   . index of key if found
   . -1 if not found

  2. Loop through the array
   . for(int i=0; i<number.length; i++)
   . Starts from index 0
   . Goes till last element of the array

  3. Comparison
   . if(number[i] == key)
   . Checks whether current element is equal to the key
   . If yes → return index i

  4. Key not found
   . return -1;
   . Executes only if the loop finishes and key is not present

  5. main() Method Explanation
   . int number[]={2,4,6,8,10,12,14,16,18};
   . int key = 16;
   . Array given
   . Key to be searched is 16
   . int idx = linearSearch(number, key);
   . Calls the linear search method
------------------------------------------------------------------------------------------------------------------------------------------
# Time & Space Complexity :-

1. Time Complexity = O(n)
 . Best Case: O(1) → key found at first index
 . Worst Case: O(n) → key found at last index or not found
 . Average Case: O(n)

2. Space Complexity = O(n)
 . no extra space used
-------------------------------------------------------------------------------------------------------------------------------------------
# Solution :-
*/
public class LinearSearch {
public static int linearSearch(int number[],int key){
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
        return i;
        }
    }
    return -1;

}
public static void main(String args[]){
    int number[]={2,4,6,8,10,12,14,16,18};
    int key = 16;
    int idx = linearSearch( number,key);
    if(idx==-1){
        System.out.println("key is not found");
    }else{
        System.out.println("key found at idx" + idx);
    }
}
}
