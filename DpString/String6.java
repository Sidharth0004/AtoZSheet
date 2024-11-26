package DpString;
// Minimum Insertions/Deletions to Convert String | (DP- 30)
import java.util.Arrays;

public class String6 {
    
     public static int helper(String word1, String word2, int ind1 , int ind2 ,int [][] dp){
    if(ind1<0 || ind2 < 0){
        return 0;
    }

  if(dp[ind1][ind2]!= -1){
    return dp[ind1][ind2];
  }

 if(word1.charAt(ind1) == word2.charAt(ind2)){
    return dp[ind1][ind2] = 1+ helper(word1 , word2 , ind1-1 , ind2-1 , dp);
 }

else{
    return dp[ind1][ind2] = Math.max(helper(word1,word2 , ind1 , ind2-1 , dp) , helper(word1 , word2 , ind1-1 , ind2 , dp));
}


   }


    public int minDistance(String word1, String word2) {
     int n = word1.length();
     int m = word2.length();

     int dp[][] = new int [n][m];
     for(int [] row : dp)
     Arrays.fill(row , -1);

     int sub =  helper(word1,word2,n-1,m-1,dp);

     int dif1 = n- sub;
     int dif2 = m-sub;

     return dif1+dif2;

    }


}
