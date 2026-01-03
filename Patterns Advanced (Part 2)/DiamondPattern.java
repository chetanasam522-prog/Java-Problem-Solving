/** # Problem Statement :- Print Diamond Pattern       *
                                                      * * 
                                                    *  *  *
                                                  *  *  *   *
                                                    *  *  *
                                                     *  *
                                                      * 
    
    # Logic (Step by Step) :-

   * Upper Half of Diamond
   2. Outer loop (i = 1 to n)
    . Controls the number of rows in the upper half.
   3. Space loop
    . Prints (n − i) spaces before stars.
    . Aligns the stars to the center.
   4. Star loop
    . Prints (2 × i − 1) stars.
    . Creates an increasing odd-number star pattern (1, 3, 5, …).
   5. New line
    . Moves to the next row after each line.

    * Lower Half of Diamond
   6. Outer loop (i = n to 1)
    . Controls the number of rows in the lower half.
   7. Space loop
    . Prints (n − i) spaces.
    . Keeps the pattern centered.
   8. Star loop
    . Prints (2 × i − 1) stars.
    . Creates a decreasing odd-number star pattern.
   9. New line
    . Moves to the next row.

    # Time & Space Complexity :-
    1. Time Complexity:- O(n square)
     . Upper half → n iterations with inner loops up to n
     . Lower half → n iterations with inner loops up to n

    2. Space Complexity :- O(n)
     . No extra memory or data structures used.
     . Only loop variables are required.

     # Solution :-
*/   

public class DiamondPattern{
    public static void DiamondPattern(int n){

        // Outer loop
    for( int i=1; i<=n; i++){

        // Inner loop (Space)
    for(int Space =1; Space<=(n-i); Space++){

        // Print Space
    System.out.print(" ");
    }
     // Inner loop
    for(int j=1; j<=(2*i-1); j++ ){
        //print Pattern
        System.out.print("*");
    }
     // next Line
     System.out.println();
    }
    for(int i=n; i>=1;i++){
        // Inner loop (Space)
    for(int Space =1; Space<=(n-i); Space++){

        // Print Space
    System.out.print(" ");
    }
     // Inner loop
    for(int j=1; j<=(2*i-1); j++ ){
        //print Pattern
        System.out.print("*");
    }
     // next Line
     System.out.println();
    }

    }
    public static void main(String args[]){
    DiamondPattern(4);

     }
}














