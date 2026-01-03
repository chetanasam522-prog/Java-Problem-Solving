/** # Problem Statement :- Print Rhombus Pattern     * * * * *  
                                                   * * * * *
                                                 * * * * *
                                               * * * * *
                                             * * * * *
   
    # Logic (Step by Step) :-

    1. Take input n
     . n represents the number of rows and the number of stars in each row.
    2. Outer loop (i = 1 to n)
     . Controls the number of rows to be printed.
    3. Space loop
     . For each row, print (n − i) spaces.
     . This shifts the stars to the right and forms the rhombus shape.
    4. Star loop
     . Print n stars (*) in each row.
     . This makes the rhombus solid.
    5. Move to next line
     . After printing spaces and stars for one row, print a newline.
    6. Repeat
     . Continue the process until all n rows are printed.

    # Time & Space Complexity :- 
    1. Time Complexity = O(n Square)
     . Outer loop runs n times.
     . Space loop runs up to n times.
     . Star loop runs n times.

    2. Space Complexity = O(n)
     . No extra data structures are used.
     . Only loop variables are required.

    # Solution :-
*/

public class SolidRhombus{
    public static void SolidRhombus(int n){

        // outer loop
    for(int i=1; i<=n; i++){
        
        // Print Space
    for(int Space = 1; Space<=(n-i); Space++){
        System.out.print(" ");
    }
        // Inner loop
    for(int j =1; j<=n; j++){
        System.out.print("*");
    }
      // Print Next Line
      System.out.println();
    }
    
    }
    public static void main(String args[]){
        SolidRhombus(5);
    }
}
