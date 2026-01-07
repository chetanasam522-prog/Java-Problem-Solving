/** # Problem Statement :- Print Sum of frist n natural number.
 
    # Logic (Step by step) :-

    1. The program starts execution from the main() method.
    2️. The method calculateSum(1, 5, 0) is called.
     . i = 1 → starting number
     . n = 5 → ending number
     . sum = 0 → initial sum
    3️. Inside calculateSum(), the base condition is checked:
     . If i > n, recursion stops.
    4️. If the base condition is false:
     . The current value of i is added to sum.
    5️. The function calls itself recursively with:
     . i + 1 (next number)
     . Same n
     . Updated sum
    6️. Steps 3 to 5 repeat for every value of i from 1 to n.
    7️. When i becomes greater than n:
     . The final value of sum is printed.
     . The function returns.
    8️. Program execution ends.

    # Time & Space Complexity :-

    1. Time Complexity :- O(n)
     . The function is called once for each value of i from 1 to n.
     . Total recursive calls = n
     . Each call does constant work (addition + comparison).

    2. Space Complexity :- O(n)
     . The program uses recursion, which stores function calls in the call stack.
     . Maximum stack depth = number of recursive calls = n.

    # Solution :-

 */
    public class PrintSum{
        public static void calculateSum(int i, int n, int sum){
            // Base Case
            if(i>n){
            sum +=i;
            // Print sum
            System.out.println(sum);
            return;
            }
            // Recursion Function
            sum += i;
            calculateSum (i+1,n,sum);
        }
        public static void main(String args[]){
            calculateSum (1,5,0);
        }
    }