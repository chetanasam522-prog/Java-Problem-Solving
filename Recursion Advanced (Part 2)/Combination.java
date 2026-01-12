/** # Problem Statement :- Print Keypad Combination
 
    # Problem Condition :- This is a Keypad Combination problem (like old mobile phones).
                          . Example:
                          If input is "23"
                          2 = "abc"
                          3 = "def"
                          . Output :- ad,ae,af,bd,be,bf,cd,ce,cf

    # Logic (Step by Step) :-
    
    1. Function Call:-
     . PrintCombination(0, "67", "");
     . idx = 0 → start from first digit
     . Combination = "" → empty initially

    2. Base Case :-
     . if(idx == str.length()){
      System.out.println(Combination);
      return;
    }
    . When all digits are processed
    . Print the formed combination
    . Stop that recursive path

    3. Current Digit Processing :-
      char currchar = str.charAt(idx);
      String mapping = keypad[currchar - '0'];
     . For idx = 0
     . currchar = '6'
       '6' - '0' = 6
     . mapping = "pqrs"

    4. Loop Through Letters :-
      for(int i = 0; i < mapping.length(); i++){
      PrintCombination(idx + 1, str,
        Combination + mapping.charAt(i));
    }
    . Try each letter of "pqrs"
    . Add it to Combination
    . Move to next digit (idx + 1)

    # Why Recursion Works Here :-
     . Each digit creates multiple choices
     . Recursion explores all possible paths
     . Backtracking happens automatically when a call returns.

    # Time & Space Complexity :-

    1. Time Complexity = O(4ⁿ)
     . Each digit → max 4 letters
     . Input length = n

    2. Space Complexity = O(n)
     . Recursive call stack depth = number of digits

    # Solution :-
 */
public class Combination {
    public static String [] keypad = {".", "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
       public static void PrintCombination(int idx, String str, String Combination){ 
        // Base case
        if(idx == str.length()){
            // Print Combination
            System.out.println(Combination);
            return;
        }
       
            char currchar = str.charAt(idx);
        String mapping = keypad[currchar-'0'];
        for(int i=0;i< mapping.length();i++){

       PrintCombination(idx+1, str, Combination+mapping.charAt(i));
        }

    }

    // Main Method
    public static void main(String args[]){
     String str = "67";
     PrintCombination(0, str,"");

    }
    
}
