/*  # Problem Statement : Given a 2D matrix of size n × m, write a program to print all the elements of the matrix in spiral order.

--------------------------------------------------------------------------------------------------------------------------------------

    # Rules:
      Spiral order means starting from the top-left corner, traverse:

     Left = Right (top row)
     Top = Bottom (right column)
     Right = Left (bottom row)
     Bottom = Top (left column)
     and repeat this process until all elements are printed.

-------------------------------------------------------------------------------------------------------------------------------------

    # Step by Step Code logic :

    1. Initialize:
      startRow=0, endRow=n-1, startCol=0, endCol=m-1

    2. Loop while:
      startRow <= endRow && startCol <= endCol

    3. Print in order:
      Top row = startCol → endCol
      Right column = startRow+1 → endRow
      Bottom row = endCol-1 → startCol (if startRow < endRow)
      Left column = endRow-1 → startRow+1 (if startCol < endCol)

    4. Shrink boundaries:
     startRow++, startCol++, endRow--, endCol--
     Repeat until done

--------------------------------------------------------------------------------------------------------------
    
    # Time & Space Complexity 

    1. Time Complexity = O(nxm)
      Every element in the matrix is visited exactly once
      Total elements = n × m

    2. Space Complexity = O(1) (constant space)
      Only a few variables are used:
      startRow, endRow, startCol, endCol
      No extra data structures used
      
---------------------------------------------------------------------------------------------------------------

   # Code logic */

public class spiralMatrix {
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol= matrix[0].length-1;

        while(startRow < endRow && startCol < endCol){
            // top

            for(int j = startCol; j<=endCol;j++){
                System.out.print(matrix[startRow][j] +" ");
            }
            // right
            for(int i = startRow; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for(int j = endCol-1; j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i = endRow-1; i>=startCol+1;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow ++;
            startCol++;
             endRow --;
              endCol --;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][] ={{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};


        spiralMatrix(matrix);

    }

    
}
