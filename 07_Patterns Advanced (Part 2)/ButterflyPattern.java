/** # Problem Statement :- Print Butterfly Pattern     *                    *
                                                       *  *              *  *
                                                       *  *  *        *  *  *
                                                       *  *  *  *  *  *  *  *
                                                       *  *  *  *  *  *  *  *
                                                       *  *  *        *  *  *
                                                       *  *              *  *
                                                       *                    * 
     

    # Logic (Step by Step) :-

    1. Define a method ButterflyPattern(int n)
     . This method takes n as input to decide the size of the butterfly pattern.
    2. Use the first outer loop to print the upper half of the butterfly
     . Loop variable i runs from 1 to n.
     . Each iteration represents one row.
    3. Print left-side stars in the upper half
     . Use an inner loop from 1 to i.
     . Print i stars (*) on the left side.
    4. Print spaces between the two wings
     . Use another loop to print 2 × (n − i) spaces.
     . Spaces decrease as the number of stars increases.
    5. Print right-side stars in the upper half
     . Use a loop from 1 to i.
     . Print i stars on the right side.
    6. Move to the next line
     . After printing stars and spaces, print a new line.
    7. Use the second outer loop to print the lower half of the butterfly
     . Loop variable i runs from n down to 1.
     . This creates the mirror image of the upper half.
    8. Print left-side stars in the lower half
     . Print i stars using an inner loop.
    9. Print spaces between the wings in the lower half
     . Print 2 × (n − i) spaces.
    10. Print right-side stars in the lower half
     . Again, print i stars using an inner loop.
    11. Move to the next line after each row
     . Ensures proper butterfly shape.
    12. Call the method from main()
     . ButterflyPattern(4) prints a butterfly pattern of size 4.


     #  Time & Space Complexity :-

    1. Time Complexity :- O(n Square)
     . The program has two outer loops:
     . First loop runs from 1 to n
     . Second loop runs from n to 1
     . Inside each outer loop, there are three inner loops:
     . Printing left stars → runs i times
     . Printing spaces → runs 2 × (n − i) times
     . Printing right stars → runs i times
     . For each row, total operations are proportional to n.

    2. Space Complexity :- O(n)
     . The program uses:
     . A few loop variables (i, j, Space)
     . No arrays, no extra data structures
     . No dynamic memory allocation
     . Memory usage does not depend on n

     # Solution :-
 */

public class ButterflyPattern{
    public static void ButterflyPattern(int n){
        
        // outer loop
    for(int i=1; i<=n; i++){

        // inner loop
    for(int j= 1; j<=i; j++){

        // Print star
        System.out.print("*");
    }
       // Print Space
    for(int Space = 1; Space<=2*(n-i); Space++){

        // Print Space
    System.out.print(" ");
    }
       // Print Star
    for(int j=1; j<=i;j++){
     System.out.print("*");
    }
       // Next Line
       System.out.println();

    }
      // 2nd Half
      for(int i=n; i>=1;i--){

        // inner loop
    for(int j= 1; j<=i; j++){

        // Print star
        System.out.print("*");
    }
       // Print Space
    for(int Space = 1; Space<=2*(n-i); Space++){

        // Print Space
    System.out.print(" ");
    }
       // Print Star
    for(int j=1; j<=i;j++){
     System.out.print("*");
    }
       // Next Line
       System.out.println();
        
      }


    }
    public static void main(String args[]){
        ButterflyPattern(4);


    }
      
}