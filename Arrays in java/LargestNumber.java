
/** # Problem Statement :- Given an array of integers, find the largest number present in the array.
--------------------------------------------------------------------------------------------------------
    # Approach :-

   . Assume the smallest possible integer as the largest initially.
   . Traverse the array element by element.
   . Compare each element with the current largest value.
   . If the current element is greater, update the largest value.
   . After the loop ends, return the largest number.
-------------------------------------------------------------------------------------------------------
   # Code Logic (Step-by-Step) :-

    1. Create a function that takes an integer array as input.
      public static int getLargestNum(int number[])

    2. Initialize a variable largest with the smallest possible integer value.
       int largest = Integer.MIN_VALUE;
     . This ensures any number in the array will be greater than largest.

    3. Start a loop to traverse the array from index 0 to length - 1.
       for(int i = 0; i < number.length; i++)

    4. Compare the current element with largest.
       if(number[i] > largest)

    5. If the current element is greater, update the value of largest.
       largest = number[i];

    6. Repeat Steps 4 and 5 until all elements are checked.

    7. After the loop ends, return the value of largest.
       return largest;

    8. In the main method, call the function and store the result.
       int ans = getLargestNum(number);

    9. Print the largest number.
       System.out.println("Largest number is " + ans);
-------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . The for loop runs once through the array.
     . Each element is compared only one time.
     . If the array has n elements, the loop executes n times.

    2. Space Complexity = O(n)
     . The for loop runs once through the array.
     . Each element is compared only one time.
     . If the array has n elements, the loop executes n times.
-------------------------------------------------------------------------------------------------------
    # Solution :-
 */
public class LargestNumber {
    public static int getLargestNum(int number[]){
    int largest= Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        if(number[i]>largest){
            largest=number[i];
        }
    }
    return largest;

    }
    public static void main(String args[]){
    int number[]={1,2,5,7,9};
    // Print largest
    int ans = getLargestNum( number);
    System.out.println("Largest number is" + ans);
    
    }
}
