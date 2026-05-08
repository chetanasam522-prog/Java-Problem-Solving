/*  # Problem Statement : given a square matrix of size n × n (2D array). 
                           Your task is to calculate the sum of both diagonals of the matrix.

-------------------------------------------------------------------------------------------------------------------

    # Rules:
      1. Primary Diagonal = Elements where row index = column index
         Example: (0,0), (1,1), (2,2)...

      2. Secondary Diagonal = Elements where row + column = n - 1
         Example: (0,n-1), (1,n-2)...

      3. If the matrix has an odd size, the center element lies on both diagonals.
         It should be counted only once.

--------------------------------------------------------------------------------------------------------------------

    # Step by Step Code logic :

    1. Initialize variable
     Create a variable sum = 0 to store the final answer.

    2. Run loop
     Loop from i = 0 to n-1 (n = matrix.length).

    3. Primary diagonal
     Add element where row = column
     matrix[i][i]

    4. Secondary diagonal
     Add element where column = n - i - 1
     matrix[i][n - i - 1]

    5. Avoid double counting
     Check condition:
     if(i != n - i - 1)
     This avoids adding the middle element twice (for odd size matrix).

    6. Keep adding values
     Add both diagonal elements inside loop.
     Return result
     Return sum after loop ends.

--------------------------------------------------------------------------------------------------------------
    
    # Time & Space Complexity 

    1. Time Complexity = O(n)
      You are using only one loop from 0 → n-1
      Inside loop → constant operations (addition, condition check)

    2. Space Complexity = O(1) (constant space)
      You are using only one variable (sum)
      No extra array or data structure

---------------------------------------------------------------------------------------------------------------

   # Code logic */
   
public class DiagonalSum{
public static int calculateSum(int matrix[][]){
    int sum =0;
    for(int i =0; i<matrix.length; i++){
        // Primary sum
        sum += matrix[i][i];
        // secondary sum 
        if(i!= matrix.length-i-1){
        sum += matrix[i][matrix.length-i-1];

        }
    }
    return sum;
}
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3 ,4},
                          {5, 6 ,7 , 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        int result = calculateSum(matrix);
        System.out.println("Diagonal sum is =" +result);
    }
}