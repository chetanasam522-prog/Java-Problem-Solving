/** # Problem Statement :- Place tiles of size 1xm in a flor of size nxm 
    
    # Problem Condition :- This program calculates how many ways we can place tiles of size 1 × m on a floor of size n × m.
                           You can place tiles in two ways:
                          . Vertically
                          . Horizontally

    # Logic (Step by Step) :-

    1. Method Explanation
     . public static int Placetiles(int n, int m)
     . n → length of the floor
     . m → width of the floor & tile length
     . Function returns total number of ways to place the tiles.

    2. Method Explanation
       public static int Placetiles(int n, int m)
     . n → length of the floor
     . m → width of the floor & tile length
     . Function returns total number of ways to place the tiles.

    3. Base Cases (Most Important in Recursion)
       When n == m
       if(n == m){
       return 1;
    }
    . Only one way to place tiles
    (either all vertical or all horizontal, but counted as one)
    . When n < m
      if(n < m){
    return 0;
   }
    Tile cannot fit, so 0 ways

   4. Recursive Calls (Main Logic)
    . Vertical Placement
    int verticalplacement = Placetiles(n - m, m);
    . Vertical tile occupies m length
    . Remaining floor = n - m

   5. Horizontal Placement
    . int Horizontalplacement = Placetiles(n - 1, m);
    . Horizontal tile occupies 1 length
    . Remaining floor = n - 1 

   6. Total Ways
    . return verticalplacement + Horizontalplacement;
    . Add both possibilities

   
   # Time & Space Complexity :-

   1. Time Complexity = O(2^n)
    . Because each call splits into two recursive calls

   2. Space Complexity = O(n)
    . Due to recursion stack depth

   # Solution :-

*/
public class PlaceTiles {
    public static int Placetiles(int n, int m ){
        // base case
        if(n==m){
            return 1;
        }
        if(n<m){
            return 0;
        }

        // vertical placement
        int verticalplacement = Placetiles( n-m, m );
        // Horizontal placement
        int Horizontalplacement = Placetiles( n-1, m );
        return verticalplacement + Horizontalplacement;

    }
    public static void main(String args[]){
        int n =4;
        int m = 2;
        int totalways = Placetiles(n, m );
        // Print totalways
        System.out.println(totalways);
    }
    
}
