package DpStocks;

import java.util.Arrays;
// 714. Best Time to Buy and Sell Stock with Transaction Fee

public class Stocks6 {
      public static int helper(int ind , int buy , int fee, int [] prices , int [][]dp){
int n = prices.length;
if(ind == n) return 0;





    if(dp[ind][buy] != -1){
        return dp[ind][buy] ;
    }

   int profit;
   if(buy ==1){
   profit = Math.max(-prices[ind] + helper(ind+1 ,0, fee , prices , dp), 0+helper(ind+1 , 1, fee , prices , dp));
   }
   else{
    profit = Math.max(prices[ind] - fee +helper(ind+1 , 1 , fee ,prices , dp) , helper(ind+1 , 0 , fee , prices , dp));

   }

 return dp[ind][buy] = profit;

  }





    public int maxProfit(int[] prices, int fee) {
     int n = prices.length;
     int dp [][] = new int [n][2];
     for(int row [] : dp){
        Arrays.fill(row , -1);

     } 
     return helper(0 , 1 , fee , prices , dp);  



    }
}
