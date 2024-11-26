
// Subset sum equal to target (DP- 14)

import java.util.Arrays;

public class SubsetSum {
    public static boolean helper(int ind , int target , int [] arr , int [][]dp){
        if(target == 0)
        return true;
        
        if(ind == 0){
            return arr[0] == target;
        }
        
            if (dp[ind][target] != -1)
            return dp[ind][target] == 0 ? false : true;
            
            
          boolean notTaken = helper(ind - 1, target, arr, dp);
            boolean taken = false;
        if (arr[ind] <= target)
            taken = helper(ind - 1, target - arr[ind], arr, dp);

        
        dp[ind][target] = notTaken || taken ? 1 : 0;
        return notTaken || taken;
        
        
    }
    

    static Boolean isSubsetSum(int arr[], int target) {
        // code here
        int n = arr.length;
        int dp [][] = new int [n][target+1];
        
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }
        
           return helper(n - 1, target, arr, dp);
    }
}
