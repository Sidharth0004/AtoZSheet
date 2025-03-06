
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

    //! Tabulation

    static boolean subsetSumToK(int n, int k, int[] arr) {
        // Create a boolean DP table with dimensions [n][k+1]
        boolean dp[][] = new boolean[n][k + 1];
        
        // Initialize the first row of the DP table
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Initialize the first column of the DP table
        if (arr[0] <= k) {
            dp[0][arr[0]] = true;
        }

        // Fill in the DP table using bottom-up approach
        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                // Calculate if the current target can be achieved without taking the current element
                boolean notTaken = dp[ind - 1][target];
                
                // Calculate if the current target can be achieved by taking the current element
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = dp[ind - 1][target - arr[ind]];
                }
                
                // Store the result in the DP table
                dp[ind][target] = notTaken || taken;
            }
        }

        // The final result is stored in the bottom-right cell of the DP table
        return dp[n - 1][k];
    }
}
