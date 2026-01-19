/** # Problem Statement :- Given an array price[] where price[i] denotes the stock price on the iᵗʰ day, 
                         find the maximum profit that can be obtained by buying and selling the stock once.
--------------------------------------------------------------------------------------------------------------------
    # Approach :-

    1. Buy the stock at the minimum price encountered so far
    2. Sell the stock at a higher price after buying
    3. At each day:
     . Update the minimum buying price
     . Calculate profit if sold on that day
     . Update maximum profit
    4. If prices always decrease, return 0 profit
    5. This approach ensures:
     . Buy happens before sell
     . Maximum profit is obtained
     . Only one traversal of the array
-------------------------------------------------------------------------------------------------------------------
    # Code Logic (Step-by-Step)

    1. Initialize variables
     . buyprice stores the lowest stock price so far
     . maxprofit stores the maximum profit

    2. Traverse the array
     . If the current price is lower than buyprice, update buyprice
     . Otherwise, calculate profit by selling on the current day

    3. Update maximum profit
     . Compare current profit with maxprofit
     . Store the larger value

    4. Return result
     . Final maxprofit is the answer
-------------------------------------------------------------------------------------------------------------------
    # Time & Space Complexity :-

    1. Time Complexity = O(n)
     . Array is traversed only once

    2. Space Complexity =o(1)
     . Only constant extra variables are used
--------------------------------------------------------------------------------------------------------------------
    # Solution :-
   */
  
public class BuyAndCellStocks {
    public static int buyAndcellstocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
         int maxprofit = 0; 
         for(int i =0;i<price.length;i++){
            if(buyprice>price[i]){
                buyprice = price[i];  
            }else{
                int profit = price[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
         }
         return maxprofit;

    }
    public static void main(String args[]){
        int price[]={7,2,4,6,9};
        // print maxprofit
        System.out.println(buyAndcellstocks(price));
    }
    
}
