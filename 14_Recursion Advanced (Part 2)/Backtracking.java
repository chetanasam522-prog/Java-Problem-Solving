/** # Problem Statement :- Find the number of way in which you can invite n people to
                           your party  Single or in pair

    # Problem Condition :- You have n guests.
                           Each guest can:
                         . Come alone (single)
                         . Come as a pair with one other guest
                         . Find total number of possible ways guests can attend.

    # Logic (Step by Step):-

    1. Program starts from main()
     . int n = 6;
     . CallGuest(6);
     . There are 6 guests
     . We need to count all valid arrangements

    2. CallGuest(n) function
     . Returns number of ways guests can attend

    3. Base Case
       if(n <= 1){
       return 1;
    }
    If:
    . n = 0 → no guests → 1 way
    . n = 1 → one guest alone → 1 way
    . This stops recursion.

    4. Case 1: Guest Comes Alone (Single)
       int way1 = CallGuest(n-1);
       Meaning:
     . One guest attends alone
     . Remaining guests = n - 1
     . Ways = CallGuest(n-1)

    5. Guest Comes as a Pair
       int way2 = (n-1) * CallGuest(n-2);
       Meaning:
     . One guest pairs with any of the remaining (n-1) guests
     . After pairing, remaining guests = n - 2
     . Total ways =
     . (n-1) × CallGuest(n-2)

    6. Total Ways
       return way1 + way2;
       Add:
     . Ways when guest is single
     . Ways when guest is paired

    7. RECURSIVE RELATION (IMPORTANT)
       f(n)=f(n−1)+(n−1)×f(n−2)
     . This is the core formula of the problem.

    # Time & Space Complexity :-

    1. Time Complexity = O(2ⁿ)
     . Each function call makes two recursive calls
     . Many calls are repeated (overlapping subproblems)
     . Similar to Fibonacci recursion

    2. Space Complexity = O(n)
     . Maximum recursion depth = n
     . No extra data structures used
     . Only function call stack memory

    # Solution :-
 */
public class Backtracking {
public static int CallGuest(int n){
    // Base Condition
    if(n<=1){
        return 1;
    }
    // Way 1 (Single)
    int way1 = CallGuest(n-1);
    // way 2 (Pair)
    int way2 = (n-1)*CallGuest(n-2);
    return way1+way2;
}
 // Main method
 public static void main(String args[]){
    int n=6;
    int totalways = CallGuest(n);
    // Print total number of ways
    System.out.println(totalways);
 }
    
}
