public class Dp16 {
    public int minimumDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0 ; i<n ; i++){
            totalSum += nums[i];
        }

    boolean dp [][] = new boolean[n][totalSum+1];


    for(int i = 0 ; i<n ; i++){
        dp[i][0] = true;
    }

   if (nums[0] <= totalSum) {
            dp[0][nums[0]] = true;
        }


  for(int ind = 1 ; ind< n ; ind++){
    for(int target = 1 ; target <= totalSum ; target ++){
        boolean notTaken =dp[ind-1][target];
        boolean taken = false;

   if (nums[ind] <= target) {
                    taken = dp[ind - 1][target - nums[ind]];
                }

                   dp[ind][target] = notTaken || taken;

    }
  }

  int mini = (int)Math.pow(10,9);

  for(int i = 0 ; i<=totalSum/2 ; i++){
    if (dp[n - 1][i] == true) {
                int diff = Math.abs((totalSum - i)-i);
                mini = Math.min(mini, diff);
            }
  }

  return mini;
    }
}
