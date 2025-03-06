package BSonAnswer;

public class KokoBanana {
    public int func(int[] piles, int mid) {
        int tothrs = 0;
        for (int i = 0; i < piles.length; i++) {
          tothrs += Math.ceil((double)(piles[i]) / (double)(mid));
        }
        return tothrs;
      }
      
      public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
          max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;
        int ans = 0;
      
        while (low <= high) {
          int mid = (low + high) / 2;
          int tothrs = func(piles, mid);
          if (tothrs <= h) {
            ans = mid;
            high = mid - 1;
          } else {
            low = mid + 1;
          }
        }
      
        return ans;
      }
}
