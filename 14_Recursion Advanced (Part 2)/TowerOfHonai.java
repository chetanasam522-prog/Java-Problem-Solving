/** # Problem Statement :- Tower Of Honai
 
    # Logic (Step by Step) :-

    1. Method Purpose
     . The method towerofhonai() is used to move n disks
     . From source rod
     . To destination rod
     . Using helper rod
    2. Method Parameters
     . n → number of disks
     . source → rod where disks are initially placed
     . Helper → temporary rod
     . Destination → final rod
    3. Base Condition
      if(n == 1)
     . If there is only one disk
     . Move it directly from source → destination
     . Print the move
     . Stop further recursion using return
    4. Recursive Step 1
      towerofhonai(n-1, source, Destination, Helper);
     . Move top (n-1) disks
     . From source → helper
     . Using destination as temporary rod
    5. Print Current Move
      System.out.println("Transfer disk " + n + " Form " + source + " to " + Destination);
     . Move the largest disk (nth disk)
     . From source → destination
    6. Recursive Step 2
      towerofhonai(n-1, Helper, source, Destination);
     . Move n-1 disks
     . From helper → destination
     . Using source as temporary rod
    7. Recursive Flow
     . The same steps repeat
     . Until the base condition n == 1 is reached
     . This ensures all disks move safely
    8. Main Method Execution
      int n = 2;
      towerofhonai(n, "source", "Helper", "Destination");
     . Starts the process with 2 disks
     . Calls the recursive method
    9. Final Outcome
     . All disks are moved
     . Following the rules of Tower of Honai
     . Output shows step-by-step disk transfers

    # Time & Space Complexity:-

    1. Time Complexity :- O(2ⁿ)
     . Number of moves grows exponentially
     . Each extra disk doubles the work

    2. Space Complexity :- O(n)
     . Due to recursive function calls
     . Each recursive call stays in call stack until it finishes

    # Solution :-
 */

public class TowerOfHonai{
    public static void towerofhonai(int n, String source, String Helper,String Destination){
        // Base Condition
        if(n==1){
        System.out.println("Transfer disk " +n+ "Form" +source+ "to" +Destination);
        return;
        }
    towerofhonai(n-1, source,Destination,Helper );
        System.out.println("Transfer disk " + n + "Form" + source + "to" + Destination);
    towerofhonai(n-1, Helper , source , Destination );

    }
        
    public static void main(String args[]){
        int n= 2;
        towerofhonai(n,  "source",  "Helper", "Destination");

    }

}