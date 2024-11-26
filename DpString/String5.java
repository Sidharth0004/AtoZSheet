package DpString;

import java.util.Arrays;
// Minimum insertions to make string palindrome | DP-29
public class String5 {
   public static int helper(String s , String rev , int ind1 , int ind2 , int [][] dp  ){

  if(ind1<0 || ind2<0){
    return 0;
  }



    if(dp[ind1][ind2]!= -1){
        return dp[ind1][ind2];
    }

if(s.charAt(ind1)== rev.charAt(ind2)){
        return 1+ helper(s , rev , ind1-1 , ind2-1 , dp);
    }

    else{
   return dp[ind1][ind2] = Math.max( helper(s, rev ,ind1, ind2-1 , dp),helper(s, rev ,ind1-1, ind2 , dp));
}

}


    public int minInsertions(String s) {
       String rev = new StringBuilder(s).reverse().toString(); 
       int n = s.length();

          int dp [][] = new int [n][n];
          for(int [] row : dp){
            Arrays.fill(row , -1);
        }

       int ans = helper(s, rev , n-1 , n-1 , dp);
       return n-ans;
    } 
}
