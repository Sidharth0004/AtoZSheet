import java.util.Arrays;

public class MinimumCoin {
     public static int helper(int ind , int coins[] , int  target , int [][]dp){

if(ind == 0){
    if(target %coins[ind] == 0){
        return target/coins[ind];
    }
    else return (int)(Math.pow(10,9)+7);
}

    if(dp[ind][target] != -1){
        return dp[ind][target];
    }



    int notTaken = helper(ind-1 , coins , target , dp);

   int taken = Integer.MAX_VALUE;

if(coins[ind] <= target){
    taken = 1 + helper(ind , coins , target-coins[ind] ,dp );
}

return dp[ind][target] = Math.min(taken, notTaken);

   }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new  int[n][amount+1];
        for(int row []: dp){
            Arrays.fill(row , -1);
        }
        int ans =  helper(n-1 , coins , amount , dp);
        if(ans == 1000000007){
            return -1;
        }
        else return ans;
    }
}
