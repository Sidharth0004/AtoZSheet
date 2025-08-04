public class 1552MagneticForce {
  
    
  public static int check(int mid , int [] position , int m){
    int n = position.length;
    int ball = 1 ;
    int last = position[0];
    
    for(int i = 1; i<n ; i++){
        if((position[i] - last)>= mid  ){
            ball++;
            last = position[i];
        }


    }
    if(ball>=m){
        return 1;
    }
    else return 0;

  }




    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int lo = 1;
        int hi = position[n-1] - position[0];
        int ans = -1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(check(mid ,  position , m) == 1){
             lo = mid+1;
             ans = mid;
            }
            else{
                             hi = mid-1;

            }
        }

  return ans;
        
    }
}
