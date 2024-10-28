/**
 * MaximumPoints
 */
// ! 1423. Maximum Points You Can Obtain from Cards
public class MaximumPoints {

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0 ;
        int rsum = 0;
      

        for(int i = 0 ; i<k ;i++){
            lsum += cardPoints[i];
        }
      int maxsum = lsum;
    int m =  n-1;
   for(int j = k-1 ; j>=0 ; j--){
         lsum = lsum - cardPoints[j];
         rsum =  rsum + cardPoints[m];
         m--;
         maxsum = Math.max(maxsum , lsum+rsum);
   }

 return maxsum;

    }
}