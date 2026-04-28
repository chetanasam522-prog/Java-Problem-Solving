/** # Problem Statement :- Print all Permutation of a String "ABC"
    
    # Logic (Step by Step) :-

    1. Program starts from main() method
     . A string "ABC" is created.
     . PrintPermutation("ABC", "") is called.
     . The second parameter is empty because no characters are chosen yet.

    2. PrintPermutation() method is called
     . str contains remaining characters.
     . permutation stores the characters chosen so far.

    3. Base case is checked
     . If str.length() == 0:
     . It means no characters are left.
     . A complete permutation is formed.
     . Print permutation.
     . Return from the function.

    4. Loop starts to select characters
     . Loop runs from i = 0 to i < str.length().
     . Each iteration selects one character from the string.

    5. Current character is selected
     . currchar = str.charAt(i)
     . This character will be added to the permutation

    6. New string is created
     . newstring = str.substring(0, i) + str.substring(i + 1)
     . This removes the selected character from the string.
     . Remaining characters are stored in newstring.

    7. Recursive call is made
     . PrintPermutation(newstring, permutation + currchar)
     . Selected character is added to the permutation.
     . Function calls itself with updated values.

    8. Recursive calls continue
     . Steps 3 to 7 repeat until the string becomes empty.
     . Each recursive path creates a unique permutation.

    9. Recursive calls continue
     . Steps 3 to 7 repeat until the string becomes empty.
     . Each recursive path creates a unique permutation.

    10. Final result
      . All possible permutations of the string are printed.
      . For "ABC", total permutations = 3! = 6.

    # Time & Space Complexity :-

    1. Time Complexity = O(n!)
     . It generates all permutations of a string of length n.
      Because:
     . n! permutations
     . Each permutation takes O(n) work

    2. Space Complexity = O(n)
     . Recursion Stack Space
     Maximum depth of recursion = n
     Each recursive call uses stack memory
     . Temporary Strings
     New strings are created using substring()
     Each string length ≤ n
     Temporary (not permanent) memory

    # Solution :-
 */
public class Permutation {
    public static void PrintPermutation(String str,String permutation){
        // Base case
        if(str.length()==0){
         // Print Permutation
        System.out.println(permutation);
        return;
        }
        for(int i=0; i<str.length(); i++){
        char currchar = str.charAt(i);
         // Create newstring
         String newstring = str.substring(0,i) + str.substring(i+1);
         PrintPermutation( newstring, permutation + currchar);
        }
        
    }
    public static void main(String args[]){
     String str = "ABC";
     PrintPermutation(str, "");

    }
}
