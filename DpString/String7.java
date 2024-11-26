package DpString;

// Shortest Common Supersequence | (DP - 31)
public class String7 {
    
    

    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp [][] = new int[n+1][m+1];
        for(int row [] : dp){
         Arrays.fill(row , -1);
        }
       
       for(int i = 0 ; i<=n ; i++){
         dp[i][0] = -1;
       }

      for(int i = 0 ; i<=m ; i++){
         dp[0][i] = -1;
       }

 for(int i =1 ; i<= n ; i++){
     for(int j=1 ; j<=m ; j++){
         if(str1.charAt(i-1) == str2.charAt(j-1))
             dp[i][j] = 1 + dp[i-1][j-1];
  
         else
               dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

         
     }
}
  int i = n;
int j = m;

String ans = "";

while(i>0 && j>0){

     if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
   ans += str1.charAt(i-1);
   i--;
   j--;
 }

else if (dp[i - 1][j] > dp[i][j - 1]) {
     ans += str1.charAt(i-1);
     i--;
 } else {
     ans += str2.charAt(j-1);
     j--;
 }


}
 while(i>0){
   ans += str1.charAt(i-1);
   i--;
}
while(j>0){
   ans += str2.charAt(j-1);
   j--;
}


String ans2=new StringBuilder(ans).reverse().toString();

return ans2;

 }

}
