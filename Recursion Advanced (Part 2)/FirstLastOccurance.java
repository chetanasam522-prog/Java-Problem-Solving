/** # Problem Statement :- Find the first & last occurance of an element in string
    
    # Logic (Step by Step):-
    
    1. Class Variables
     . public static int first = -1;
     . public static int Last = -1;
    first → stores first occurrence index of the character
    Last → stores last occurrence index of the character
    Initialized with -1 meaning not found yet
    
    2. Method Purpose
    firstlastOccurance(int idx, String str, char element)
     . idx → current index of string
     . str → input string
     . element → character to be searched
     
    3. Base Condition
    if (idx == str.length())
     . Stops recursion when end of string is reached
     . Prints first and Last
     . Uses return to end function calls

    4. Get Current Character
     . char currchar = str.charAt(idx);
     . Extracts character at current index

    5. Character Matching Logic
     . if (currchar == element)

    6. First Occurrence
    if (first == -1)
    first = idx;
     . Stores index when character appears first time

    7. Last Occurrence
    else
    Last = idx;
    . Updates Last every time character appears again

    8. Recursive Call
     . firstlastOccurance(idx + 1, str, element);
     . Moves to next index
     . Continues searching until base condition

    # Time & Space Complexity :-

    1. Time Conplexity = O(n)
     . One recursive call for each character
     . String length = n

    2. Space Complexity = O(n)
     . Recursion stack depth = n

  **/
public class FirstLastOccurance {
    public static int first = -1;
    public static int Last = -1;
public static void firstlastOccurance(int idx, String str,char element){
    // Base Condition
    if(idx==str.length()){
        System.out.println(first);
         System.out.println(Last);
         return;
    }
    char currchar = str.charAt(idx);
    if(currchar == element){
        if(first==-1){
            first = idx;
        }else{
            Last = idx;
        }
    }
    firstlastOccurance(idx + 1, str, element);

}
public static void main(String args[]){
    String str = "abaacdaefaah";
    char element = 'a';
    firstlastOccurance(0, str, element);
}

    
}
