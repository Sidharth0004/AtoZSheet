package BinarySearch;
// 2064. Minimized Maximum of Products Distributed to Any Store

public class 2064MinimizedMaximumofProd {

    
 public static int check(int mid , int n , int [] quantities){
    int count = 0 ;
    int l = quantities.length;

    for(int i = 0 ; i<l ; i++){
        count += Math.ceil((double)quantities[i]/(double)mid);
    }
    if(count>n) return 0;

    return 1;

  
 }


    public int minimizedMaximum(int n, int[] quantities) {
        int l = quantities.length;
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        for(int i = 0 ; i<l ;i++){
            hi = Math.max(hi , quantities[i]);

        }
        int ans = -1;

        while(lo<= hi){
            int mid = lo + (hi-lo)/2;
            if(check(mid,n,quantities)==1){
            ans = mid;
            hi = mid-1;
            }else{
                lo = mid+1;
            }
        }

        return ans;

    }
}