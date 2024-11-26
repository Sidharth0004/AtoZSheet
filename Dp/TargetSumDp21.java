import java.util.Arrays;

public class TargetSumDp21 {
    
    
public static int helper(int ind , int target , int []nums , int dp [][]){


    if(ind == 0){
            if(target==0 && nums[0]==0)
                return 2;
            if(target==0 ||  nums[0] == target)
                return 1;

            return 0;
        }




if(dp[ind][target] != -1){
    return dp[ind][target];
}

int notTake = helper(ind-1 , target , nums , dp);
int take = 0 ;

if(nums[ind]<=target){
    take = helper(ind-1 , target-nums[ind] , nums , dp);
}

return dp[ind][target] = notTake + take;

 }





    public int findTargetSumWays(int[] nums, int target) {

  int n = nums.length;
    int totalSum = 0;
    for(int i = 0 ; i<n ; i++){
        totalSum += nums[i];
    }

     if(totalSum - target<0) return 0;
     if((totalSum-target)% 2 ==1 ) return 0;

     int s2 = (totalSum-target)/2;

    int dp[][] = new int[n][s2+1];
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }

   return helper(n-1 , s2 , nums, dp);

    }
}
