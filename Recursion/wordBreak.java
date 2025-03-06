import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {
      public boolean wordBreak(String s, List<String> wordDict) {
        int dp [][] = new int[s.length()][s.length()];
      for(int row [] : dp){
        Arrays.fill(row,-1);
      }
       return helper(0,0,s,new HashSet<>(wordDict) , dp); 
    }

    public static boolean  helper(int start , int end , String s ,Set<String> wd ,int dp [][]){
        if(dp[start][end] != -1) return dp[start][end] ==1 ? true:false;
        if(end == s.length()-1){
       if(wd.contains(s.substring(start, end+1))) return true;
       return false;
        }

   if(wd.contains(s.substring(start, end+1))){
    if(helper(end+1 , end+1 , s, wd ,dp)){
        dp[start][end] =1;
        return true;
    }
   }

   dp[start][end] = helper(start , end+1 , s, wd , dp) ?1 :0 ;
  return dp[start][end] == 1?true :false;
    } 
}
