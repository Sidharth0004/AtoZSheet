

import java.util.Arrays;

public class CountSubset {
    

    static int findWaysUtil(int ind, int target, int[] arr, int[][] dp) {
        if (target == 0)
            return 1;

        if (ind == 0)
            return arr[0] == target ? 1 : 0;

        if (dp[ind][target] != -1)
            return dp[ind][target];

        int notTaken = findWaysUtil(ind - 1, target, arr, dp);

        int taken = 0;
        if (arr[ind] <= target)
            taken = findWaysUtil(ind - 1, target - arr[ind], arr, dp);

      
        return dp[ind][target] = notTaken + taken;
    }

    public static int perfectSum(int num[],int n, int k) 
    { 
       
        int dp[][] = new int[n][k + 1];

        for (int row[] : dp)
            Arrays.fill(row, -1);

        return findWaysUtil(n - 1, k, num, dp);

    } 
}
