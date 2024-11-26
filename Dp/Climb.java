
public class Climb {
    
 public  int  helper(int n , int dp[]){
    if(n<0){
      return 0;
    }
    if(n==0){
      return 1;
    }
    if(dp[n] != 0){
      return dp[n];
    }
  
     dp[n]= helper(n-1 , dp)+helper(n-2 , dp);
  
    return dp[n];
  
     }
  
  
      public int climbStairs(int n) {
          int dp [] = new int[n+1];
        int ans =    helper(n,dp);
        return ans;
  
  
      }
}
