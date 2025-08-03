public class MinTimeToMakeRope {
 public int minCost(String colors, int[] neededTime) {
     int n = colors.length();
     int ans = 0;
     int maxTime = 0;

     for (int i = 0; i < n; i++) {
         if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
             maxTime = 0;
         }
         ans += Math.min(maxTime, neededTime[i]);
         maxTime = Math.max(maxTime, neededTime[i]);
     }
     return ans;
 }
}
