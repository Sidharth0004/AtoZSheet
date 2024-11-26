package DpString;

import java.util.Arrays;

// 1143. Longest Common Subsequence
public class String1 {
   public static int helper(String text1 , String text2 , int ind1 , int ind2 , int [][] dp){
  
  if(ind1<0 || ind2<0){
    return 0;
  }





        if(dp[ind1][ind2] != -1){
          return dp[ind1][ind2];
        }

        if(text1.charAt(ind1)==text2.charAt(ind2)){
            return dp[ind1][ind2] = 1+ helper(text1 , text2 , ind1-1 , ind2-1 , dp);
        }
        else{
            return dp[ind1][ind2] = Math.max( helper(text1, text2 ,ind1, ind2-1 , dp),helper(text1, text2 ,ind1-1, ind2 , dp));
        }


     }


    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int dp [][] = new int[n][m];
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }

        return helper(text1, text2 ,n-1, m-1, dp );
    }  
}


// ! Tabulation 
// public int longestCommonSubsequence(String text1, String text2) {
//     int n = text1.length();  
//     int m = text2.length();

//     int dp [][] = new int [n+1][m+1];
//     for (int rows[] : dp)
//           Arrays.fill(rows, -1);


//           for(int i = 0 ; i<= n ; i++){
//               dp[i][0] = 0;
//           }  

//            for (int i = 0; i <= m; i++) {
//           dp[0][i] = 0;
//       }

//  for(int i = 1 ; i<= n ; i++){
//   for(int j = 1; j<= m ; j++ ){
//       if(text1.charAt(i-1) == text2.charAt(j-1)){
//      dp[i][j] = 1 + dp[i - 1][j  - 1];
//       }
//        else
//                   dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//   }
//  }

// return dp[n][m];
//   }