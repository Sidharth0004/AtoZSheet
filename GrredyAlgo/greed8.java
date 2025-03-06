package GrredyAlgo;
 // jump2
public class greed8 {
    public int jump(int[] nums) {
        int jump = 0 ;
        int l =0;
        int r = 0 ;
        while(r < nums.length - 1){
         int farthest = 0 ;
         for(int i = l ; i<= r ; i++){
              farthest = Math.max(farthest , nums[i] + i);
         }
         l = r + 1;
         r = farthest;
         jump++;
              
        }

  return jump;

    }
}
