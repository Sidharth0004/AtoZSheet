package DpString;

import java.util.Arrays;
// Longest Common Substring | (DP - 27)
public class String3 {
    public int longestCommonSubstr(String text1, String text2) {
          int n = text1.length();  
          int m = text2.length();

     int dp [][] = new int [n+1][m+1];
     for (int rows[] : dp)
          Arrays.fill(rows, -1);


          for(int i = 0 ; i<= n ; i++){
              dp[i][0] = 0;
          }  

            for (int i = 0; i <= m; i++) {
          dp[0][i] = 0;
      }
      int ans =0;

     for(int i = 1 ; i<= n ; i++){
         for(int j = 1; j<= m ; j++ ){
      if(text1.charAt(i-1) == text2.charAt(j-1)){
     dp[i][j] = 1 + dp[i - 1][j  - 1];
     ans = Math.max(ans,  dp[i][j]);
      }
        else
                  dp[i][j] = 0;
  }
 }

return ans;
        
    }
}
