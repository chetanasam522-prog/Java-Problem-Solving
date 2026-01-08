/** # Problem Statement :- Print a string in reverse
 
    # Logic (Step by Step) :-
     
    1. Purpose of the Code
      . This program prints a string in reverse order
      . It uses recursion instead of loops
       Method Used
      . public static void PrintReverse(String str, int idx)
       Parameters
      . str → the original string
      . idx → index of the character to print (starts from last index)
    2. Initial Call (from main)
      . PrintReverse(str, str.length() - 1);
      . Starts from the last character of the string
      . For "A B C D" → last index is 6
    3. Base Condition
      if (idx == 0) {
      System.out.println(str.charAt(idx));
      return;
    }
      . When idx reaches 0
      . Print the first character
      . Stop recursion using return
    4. Print Current Character
      . System.out.println(str.charAt(idx));
      . Prints the character at current index
      . Printing happens before the recursive call
      . That’s why output is in reverse order
    5. Recursive Call
      . PrintReverse(str, idx - 1);
      . Moves one step backward
      . Reduces index by 1
      . Continues until base condition is reached
    
    # Time & Space Complexity:-

    1. Time Complexity :- O(n)
     . One recursive call for each character
     . Total characters = n

    2. Space Complexity :- O(n)
     . Recursion stack stores function calls
     . Maximum depth = number of characters (n)

    # Solution :-
    
 */
public class StringReverse {
    public static void PrintReverse(String str,int idx){
        // Base Condition
        if(idx ==0){
            System.out.println(str.charAt(idx));
            return;

        }
        System.out.println(str.charAt(idx));
        PrintReverse(str, idx-1);
    }
      // Main Method
      public static void main(String args[]){
        String str = "A B C D";
        PrintReverse(str , str.length()-1);


      }
    
}
