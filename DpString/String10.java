package DpString;
// Wildcard Matching | (DP-34)
import java.util.Arrays;

public class String10 {
    public static boolean helper(int ind1 , int ind2 , String s , String p , int [][] dp) {

   if(ind1<0 && ind2<0) return true;
   if(ind2<0 && ind1>=0) return false;

   if(ind2>=0 && ind1<0){
    for(int i = 0 ; i<= ind2 ;i++){
        if(p.charAt(i)!= '*') return false;
        
    }

        return true;

   }


if(dp[ind1][ind2]!= -1){
    return dp[ind1][ind2] == 1;
}


    if(s.charAt(ind1) == p.charAt(ind2) || p.charAt(ind2) == '?') {
        dp[ind1][ind2] = helper(ind1 - 1, ind2 - 1, s, p, dp) ? 1 : 0;
        return dp[ind1][ind2] == 1;
    }
    if(p.charAt(ind2) == '*') {
        dp[ind1][ind2] = (helper(ind1, ind2 - 1, s, p, dp) || helper(ind1 - 1, ind2, s, p, dp)) ? 1 : 0;
        return dp[ind1][ind2] == 1;
    }
   return false;
}

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

int dp [][] = new int[n][m];

        for(int [] row : dp){
            Arrays.fill(row , -1);
        }

     return    helper(n-1 , m-1 , s,p , dp);


    }
}
