/** # Problem Statement :-  Print all the Subsequence of a String "ABC" 
    
    # Logic (Step by step) :-

    1. Function starts with index 0
       subsequence(0, str, "");
     . idx → current position in string
     . newstring → stores current subsequence

    2. Base Condition
       if (idx == str.length())
     . Means all characters are processed
     . Print the formed subsequence
     . Return back

    3. Get the current character
       char currchar = str.charAt(idx);
     . Picks character at index idx

    4. Two Recursive Choices for Every Character
     .  Choice 1: Include the character
       subsequence(idx + 1, str, newstring + currchar);
     . Adds current character to subsequence
     . Choice 2: Exclude the character
     . subsequence(idx + 1, str, newstring);
     . Skips the current character

    5. Recursion Stops Automatically
     . When idx == str.length()
     . No infinite recursion
     . All combinations printed

    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . Each character has 2 choices
     . For n characters

    2. Space Complexity = O(n)
     . Maximum recursion depth = n
     . No extra data structures

    # Solution :-
     
*/
 public class Subsequences {
    public static void subsequence(int idx, String str, String newstring){
          // Base Condition
          if(idx == str.length()){
            System.out.println(newstring);
             return;
           }


         char currchar = str.charAt(idx);
         // Add to be
        subsequence( idx+1,  str, newstring+currchar);
         // Not to be add
         subsequence( idx+1,  str, newstring);

     }
   public static void main(String args[]){
         String str = "ABC";
         subsequence(0,  str, "");

    }
    
 }
