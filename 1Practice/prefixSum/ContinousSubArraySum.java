public class ContinousSubArraySum {
    
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
 
 
        int preSum =0 ;
        for(int i =0 ; i<n ; i++){
         preSum += nums[i];
         int remainder = preSum%k;
          if(map.containsKey(remainder)){
             if(i-map.get(remainder)>=2){
             return true;
             }
          }else{
             map.put(remainder , i);
          }
 
 
        }
        return false;
 
     }
}
