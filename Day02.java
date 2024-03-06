// this code will not run unless you change the classname to file name.
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] > prices[i]){
                maxProfit += (prices[i+1] - prices[i]);
            }
        }

        return maxProfit;
    }
}

/*
 * Problem Name: 122. Best Time to Buy and Sell Stock II
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * 
 * INPUT: prices = [7,1,5,3,6,4]
 * OUTPUT: 7
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * we have to sell the stock in profit
 * in order to do that, we have to see if the next day
 * stock price is greater than the current day
 * if it is true then we have to calculate how much is the difference
 * then we have to sum all the profit in the same way
 * done 
*/