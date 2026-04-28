/** # Problem Statement :- Print all the unique Subsequences of a string "aaa"
    
    # Logic (Step by Step) :-

    1. Purpose of the Program
     . To print all unique subsequences of a string
     . Example input: "aaa"
     . Without HashSet, duplicates like "a" and "aa" would repeat.

    2. Function Parameters Meaning
     . uniqueSubsequence(int idx, String str, String newstring, HashSet<String> set)
     . idx = Current index of string
     . str = Original input string
     . newstring = Current subsequence being formed
     . set = Stores already printed subsequences

    3. Base Case
     . if (idx == str.length())
     . When we reach the end of the string:
     . If newstring already exists in HashSet → ignore
     . Else → print it and store it
     . This avoids duplicate subsequences.

    4. Recursive Calls (Two Choices)
     . At every index, we have 2 choices:
    Choice 1: Include current character
     . uniqueSubsequence(idx + 1, str, newstring + currchar, set);
    Choice 2: Exclude current character
     . uniqueSubsequence(idx + 1, str, newstring, set);
    This is why it’s called subsequence (not substring).

    5. Why HashSet is Used
     . String "aaa" creates duplicate subsequences
     . HashSet stores only unique values
     . Ensures no repeated output

    # Time & Space Complexity :-

    1. Time Complexity = O(2ⁿ)
     . Because each character has two choices (include / exclude)

    2. Space Complexity = O(2ⁿ)
     . O(2ⁿ) → HashSet storage
     . O(n) → recursion call stack

    # Solution :-
 */

import java.util.HashSet;
public class UniqueSubsequence {
    public static void uniqueSubsequence(int idx ,String str,String newstring ,HashSet <String> set ){
        // Base case
        if(idx == str.length()){
        if(set.contains(newstring)){
            return;
        }else{
            System.out.println(newstring);
            set.add (newstring);
            return;
        }
        }

        char currchar = str.charAt(idx);
        // Add to be 
        uniqueSubsequence(idx+1 ,str, newstring+currchar,set);
       // Not to be add
       uniqueSubsequence(idx+1 ,str, newstring,set);

    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        uniqueSubsequence(0, str,"",set);

    }
    
}
