package BSOn2DArr;

public class RowMax1 {
    public static int lowerBound(int arr[] , int x){
        int low = 0;
        int n = arr.length;
        int high = n -1;
        int ans = n ;
        while(low<=high){
         int mid = (low+high)/2;
         if(arr[mid] >=x ){
             high = mid-1;
             ans = mid;
         }
         else low = mid+1;
         
         
         
        }
        return ans;
    }
    public int rowWithMax1s(int arr[][]) {
        int cnt_max = 0;
        int index = -1;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
        
            int cnt_ones = m - lowerBound(arr[i], 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
        
    }
}
