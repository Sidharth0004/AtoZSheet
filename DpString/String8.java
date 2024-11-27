package DpString;

import java.util.Arrays;

public class String8 {
    static int prime = (int) (Math.pow(10, 9) + 7);
      public static int  helper(int ind1 , int ind2 , String s , String t , int [][] dp){

if(ind2<0) return 1;
if(ind1<0) return 0 ;



    if(dp[ind1][ind2]!=-1){
   return dp[ind1][ind2];
    }

if(s.charAt(ind1)==t.charAt(ind2)){
    int one =  helper(ind1-1 , ind2-1 , s, t , dp) ;
    int leave =  helper(ind1-1 , ind2 , s,t ,dp);

    return dp[ind1][ind2] = (one + leave) % prime;
}else {
           
            return dp[ind1][ind2] = helper(ind1-1 , ind2 , s ,t,dp);
        }



  }


    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        int dp[][] = new int [n][m];
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }
  
    return helper(n-1 , m-1 , s , t , dp);

    }
}
