/** # Problem Statement :- Remove Duplicates in a String "abbccda"
    
    # Logic (Step by Step):-

    1. Boolean Array for Tracking Characters
       public static boolean[] map = new boolean[26];
     . Stores whether a character from 'a' to 'z' has appeared before
       Index mapping:
      'a' - 'a' = 0
      'b' - 'a' = 1
      ...
      'z' - 'a' = 25
      Default value is `false

    2. Recursive Function Definition
       removeduplicates(int idx, String str, String newstring)
     . idx → current position in the string
     . str → original input string
     . newstring → string formed after removing duplicates

    3. Base Case
       if (idx == str.length()) {
       System.out.println(newstring);
       return;
    }
     . When all characters are processed
     . Print the final string without duplicates
     . Stop recursion

    4. Read the Current Character
       char currchar = str.charAt(idx);
     . Extracts the character at the current index

    5. Check if the Character is a Duplicate
       if (map[currchar - 'a']) {
     . If the character has appeared before (true)
     . Skip it and move to the next index
     . removeduplicates(idx + 1, str, newstring);

    6. If the Character Appears for the First Time
       else {
      newstring += currchar;
      map[currchar - 'a'] = true;
      removeduplicates(idx + 1, str, newstring);
    }
    . Add the character to the result string
    . Mark the character as visited in the boolean array
    . Continue recursion

    # Time & Space Complexity :-
    
    1. Time Complexity = O(n)
     . Each character is processed once

    2. Space Complexity = O(n)
     . Recursive call stack takes O(n) space
     . Boolean array takes constant space O(26)

    # Solution :-
 */
public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeduplicates(int idx, String str,String newstring){
          // Base Case
          if(idx == str.length()){
            System.out.println(newstring);
            return;
          }


        char currchar = str.charAt(idx);
        if(map[currchar -'a']){
        removeduplicates( idx+1, str,newstring);
        }else{
        newstring += currchar;
         map[currchar - 'a']=true;
         removeduplicates( idx+1, str,newstring);

        }

    }
    public static void main(String args[]){
        String str = "abbccda";
        removeduplicates(0,  str, "");
    }
}
