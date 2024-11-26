

import java.util.ArrayList;
import java.util.Arrays;

public class KnapSak01 {
	
	public static int helper(int n , int w, ArrayList<Integer> values ,ArrayList<Integer> weights , int[][] dp ){
		if(n==0){
		 if(weights.get(0) <= w){
			 return values.get(0);
		 }
		 else
		 return 0;
		}
		if (dp[n][w] != -1)
				 return dp[n][w];
	 
				 int notTaken =0+ helper(n-1, w, values, weights, dp);
	 
				 int taken = Integer.MIN_VALUE;
	 
				 if (weights.get(n) <= w) {
					 taken = values.get(n) + helper(n-1, w-weights.get(n), values, weights, dp);
				 }
	   return dp[n][w]= Math.max(taken, notTaken);
	 
		 }
	 public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		 int[][] dp = new int [n][w+1];
		  for (int i = 0; i < dp.length; i++) {
				 for (int j = 0; j < dp[0].length; j++) {
					 
					 dp[i][j] =-1;
				 }
			 }
			 return helper(n-1 , w, values , weights, dp);
		 } 
}
