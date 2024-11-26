import java.util.Arrays;

public class UnBoundeKnapsack {
        public static int helper(int ind , int [] val , int [] wt , int W , int [][] dp){
        
        if(ind==0){
            if(wt[0]<= W){
             return ((int) (W / wt[0])) * val[0];

            }
            else 
            return 0;
        }
        
        
        
        if(dp[ind][W] != -1){
          return dp[ind][W];  
        }
        
        int notTake  = helper(ind -1 , val , wt , W , dp);
        int take = Integer.MIN_VALUE;
        
        if(wt[ind]<= W){
            take = val[ind] + helper(ind , val ,wt ,  W-wt[ind] , dp);
        }
        
         return dp[ind][W]= Math.max(take, notTake);
    }
    
    
    static int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;
        int dp [][] = new int[n][capacity+1];
        
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }
         return helper(n-1 , val , wt , capacity , dp);
        
        
    }
}
