public class MinTimeRepairCars {
    
    public static boolean checks(int [] ranks , int cars , long mid){
        int n = ranks.length;
        long t = 0;
        for(int i = 0 ; i<n ; i++){
           long m = mid/ranks[i];
           t += Math.sqrt(m);
           if (t>= cars){
            return true;
           }
        }
        return t >= cars;
    }
    
    public long repairCars(int[] ranks, int cars) {
        long ans = -1;
        long lo = 0; 
        long hi = 0;
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < ranks.length; i++){
            max = Math.max(max, ranks[i]);
        }
        hi = max * cars * cars;
    
        while(lo <= hi){
            long mid = lo + (hi - lo) / 2;
            if(checks(ranks, cars, mid)){
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    
        return ans;
    }
}
