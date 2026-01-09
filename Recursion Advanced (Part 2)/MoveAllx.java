/** # Problem Statement :- Move all X to the end of the string
 
    # Logic (Step by Step) :-
     
    1. We begin checking the string from the first character
     . idx tells which character we are checking

    2️. Base Condition (Stopping Condition)
       if (idx == str.length())
     . This means we have checked all characters
     . Now recursion must stop

    3. Append all 'x' at the end
       for (int i = 0; i < count; i++) {
       newstring += 'x';
    }
     . count stores how many 'x' were found
     . We add all 'x' after non-x characters
     . Finally print the result

    4. Get current character
       char currchar = str.charAt(idx);
     . Fetch the character at current index

    5. Check if character is 'x'
       if (currchar == 'x')
       If yes:
     . Do not add it to newstring
     . Just increase count

    6. If character is NOT 'x'
       else {
      newstring += currchar;
   }
    . Add the character to newstring
    . This keeps the original order

    7. Recursive Call
       moveallX(idx + 1, str, newstring, count);
     . Move to next index
     . Pass updated newstring and count

    8. Repeat Until End of String
     . Steps 4 → 7 repeat
     . Each recursive call processes one character

    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . Recursive calls → n times
     . Base case loop appending 'x' → count times (≤ n)

    2. Space Complexity = O(n)
     . Recursive call stack
       One stack frame per character
       Maximum depth = n
     . New string (newstring)
       Stores all characters → size n

    # Solution :-
 */

public class MoveAllx {
 public static void moveallX(int idx, String str,String newstring, int count){
    // Base Condition
    if(idx == str.length()){
        for(int i=0; i<=count; i++){
            newstring += 'x'; 
        }
         System.out.println(newstring);
        return;
    }

    char currchar = str.charAt(idx);
    if(currchar=='x'){
        count++;
    }else{
        newstring += currchar;
    }
    moveallX( idx+1,  str, newstring, count);
    
 }
 public static void main(String args[]){
    String str = "abxxdxex";
    moveallX(0,  str, " ",0 );

 }
    
}
