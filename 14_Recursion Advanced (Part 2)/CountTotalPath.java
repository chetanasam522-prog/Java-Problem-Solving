/** # Problem Statement :- Count total path in the maze to move form (0,0) to (n,m)
 * 
    # Problem Condition :- Count total number of ways to go from
                           top-left cell (0,0) to bottom-right cell (n-1, m-1)
                           Allowed moves:
                          . Right
                          . Down
           
    # Logic (Step by Step):-

    1. Program starts from main()
     . int n = 3;
     . int m = 3;
     . CountPath(0, 0, n, m);
     . Grid size = 3 × 3
     . Start position = (0,0)

    2. CountPath(i, j, n, m) method
     . i = current row
     . j = current column
     . n = total rows
     . m = total columns

    3. First Base Case (Reached Destination)
       if (i == n-1 || j == m-1) {
       return 1;
    }
     . If you reach last row OR last column
     . Only one straight path is possible
     .  So return 1

    4. Second Base Case (Out of Grid)
       if (i == n || j == m) {
       return 0;
    }
     . If you cross grid boundaries
     . Invalid path
     . Return 0

    5. Recursive Call – Move Down
     . int downpath = CountPath(i+1, j, n, m);
     . Moves downward
     . Increases row index

    6. Recursive Call – Move Right
     . int rightpath = CountPath(i, j+1, n, m);
     . Moves rightward
     . Increases column index

    7. Total Paths from Current Cell
       return downpath + rightpath;
     . Total ways =
     . paths from down + paths from right

    8. Recursion Explores All Paths
     . Every possible route is tried
     . All valid paths are counted
     . Final answer is returned to main()

    # Time & Space Complexity :-
    
    1. Time Complexity = O(2(n+m))
     . At every cell, 2 recursive calls are made
     . Recursion continues until destination is reached
     . Each step branches into right and down

    2. Space Complexity = o(n+m)
     . Maximum depth = (n + m)

    # Solution :-
 */
public class CountTotalPath {
    public static int CountPath(int i,int j, int n, int m){
        // base case
        if(i==n-1||j==m-1){
         return 1;
        }
        if(i==n||j==m){
        return 0;
        }
        // Move Downword
        int downpath = CountPath( i+1, j, n,  m);
        // move Rightword
        int rightpath =  CountPath( i, j+1, n,  m);
        return downpath+rightpath;

    }
    public static void main(String args[]){
        int n= 4;
        int m= 4;
        int totalpath = CountPath(0,0, n,  m);
        System.out.println(totalpath);
        
    }
    
}
