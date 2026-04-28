/** # Problem Statement :- Print the Hallow Rectangle Pattern
    
    # Logic (Step by Step):-

    Step 1: Understand the Goal
          We want to print a hollow rectangle where:
        . The boundary is made of *
        . The inside part is empty (spaces)

    Step 2: Use Two Loops
       . Outer loop → controls the rows
       . Inner loop → controls the columns
       for(int i = 1; i <= totRows; i++)   // rows
       for(int j = 1; j <= totColms; j++)  // columns

    Step 3: Identify the Border
      . A position belongs to the border if any one of these is true:
      . First row → i == 1
      . Last row → i == totRows
      . First column → j == 1
      . Last column → j == totColms

    Step 4: Apply Condition
        if(i == 1 || i == totRows || j == 1 || j == totColms)
      . If condition is true = print *
      . Else = print " " (space)

    Step 5: Move to Next Line
      . After completing one row:
      . System.out.println();

    # Time & Space Complexity :-

    1. Time Complexity = o(Rows x columns)
     . Outer loop runs totRows times
     . Inner loop runs totColms times for each row
     . for (i = 1 to totRows)
     . for (j = 1 to totColms)
👉  . Total operations = totRows × totColms

    2. Space Complexity = O(n)
     . No extra arrays, lists, or recursion used
     . Only loop variables (i, j) are used

    # Solution :-
 */
public class HallowRectangle {
    public static void hallowrectangle(int totRows, int totColms){
        // outer loop
        for(int i=1; i<=totRows; i++){
        // Inner loop
        for(int j=1; j<=totColms; j++){
        if (i==1 ||i==totRows||j==1||j==totColms ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
        System.out.println();
        }

    }
    public static void main(String args[]){
    hallowrectangle(4, 5);

    }
    
}
