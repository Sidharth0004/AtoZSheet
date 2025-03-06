package BSonAnswer;

public class Nthroot {

        
    // public int func(int mid, int n) {
    //     int ans = 1;
    //   for(int i= 0 ; i<n ; i++){
    //       ans = ans*mid;
    //   }
    //     return ans;
    // }
    public int func(int mid, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * mid;
            }
            mid = mid * mid;
            n = n / 2;
        }
        return ans;
    }
    
    public int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int midPow = func(mid, n);
            if (midPow == m) {
                return mid;
            } else if (midPow < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}