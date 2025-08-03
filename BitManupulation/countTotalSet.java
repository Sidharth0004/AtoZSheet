package BitManupulation;

public class countTotalSet {
    public static int countSetBits(int n){
    
        // Your code here
        int cnt = 0 ;
     
        for(int i = 1 ; i <= n ; i++){
            int num = i; // Use a separate variable for bit counting
            while(num > 0){
                cnt += num & 1;
                num = num>>1;
            }
        }
        return cnt;
    }
}
