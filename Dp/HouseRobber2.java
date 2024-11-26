

import java.util.Arrays;

public class HouseRobber2 {
    public static int helper(int [] nums , int n , int [] dp){
        if(n==0){
            return nums[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
        return dp[n];
      }

       int pick = helper(nums , n-2 , dp) + nums[n];
          int nonPick =helper(nums , n-1 , dp) ;


     return dp[n] = Math.max(pick, nonPick);


    }



    public int rob(int[] nums) {
        int n = nums.length;
        int num1[] = new int[n-1] ;
        int num2[] = new int[n-1];

        for(int i = 0 ; i<n-1; i++){
            num1[i]= nums[i];
        }
   
    
          int k =0;
           for(int i = 1; i<n ; i++){
            num2[k]= nums[i];
            k++;
        }
           int dp1 [] = new int[n];
            int dp2 [] = new int[n];
           Arrays.fill(dp1, -1);
                 Arrays.fill(dp2, -1);
        if(n==1){
            return helper(nums , nums.length-1 , dp2);
        }

           int ans1 = helper(num1 , num1.length-1 , dp1);
            int ans2 = helper(num2 , num2.length-1 , dp2);

            return Math.max(ans1,ans2);
          

        
    }
}
