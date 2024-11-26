import java.util.Arrays;

public class RodLen {
    
    public static int helper(int ind , int w , int [] price , int [][] dp){
        
         if(ind==0){
        
             return w * price[0];


        }
        
        
        
        if(dp[ind][w] != -1){
            return dp[ind][w]; 
        }
        
        int notTake = 0 + helper(ind-1,w,price , dp);
         int take = Integer.MIN_VALUE;
         int rodLen = ind+1;
         
         if(rodLen <= w){
             take = price[ind] + helper(ind , w-rodLen , price , dp);
         }
        
        return dp[ind][w]= Math.max(take, notTake);
        
    }
    
    
    public int cutRod(int price[], int n) {
        int dp[][] = new int[n][n+1];
        
           for(int [] row : dp){
            Arrays.fill(row , -1);
        }
        
        return helper(n-1 ,n, price , dp );
        
        
    }
}
