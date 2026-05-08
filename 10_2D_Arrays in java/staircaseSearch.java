/*  # Problem Statement : Find a given key in a row-wise and column-wise sorted 2D matrix efficiently and return its position if it exists.

---------------------------------------------------------------------------------------------------------------------------------------------

    # Step by Step Code logic :

    1. Start from the top-right corner of the matrix.

    2. Compare the current element with the given key.

    3. If the element is equal to the key = return true (found).

    4. If the key is smaller than the current element = move left (col--).

    5. If the key is greater than the current element = move down (row++).

    6. Repeat steps 2–5 until you go out of matrix bounds.

    7. If the loop ends = key is not found, return false.

--------------------------------------------------------------------------------------------------------------
    
    # Time & Space Complexity 

    1. Time Complexity = O(n+m)
      O(n + m)
      n = number of rows
      m = number of columns

    2. Space Complexity
      O(1) (Constant space)
      No extra memory used
      Only variables (row, col)
---------------------------------------------------------------------------------------------------------------

   # Code logic */

public class staircaseSearch {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]== key){
                System.out.print("found key is at idx ("+row+ " ," +col+")");
                return true;
            }else if(key< matrix[row][col]){
             col--;

           }else{
            row++;
         }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String args[]){
    int matrix[][] = {{10, 20, 30 ,40},
                      {15, 25 ,35 , 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
    int key = 33;
    staircaseSearch(matrix,key);
    }
    
}
