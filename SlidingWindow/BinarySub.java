public class BinarySub {
    public int helpMe(int[] nums,int goal){
        int l=0;
        int r=0;
        int sum=0;
        int cnt=0;
        if(goal<0){
            return 0;
        }
        while(r<nums.length){
            sum += nums[r];
            while(sum>goal){
                if(nums[l]==1){
                    sum--;
                }
                l++;

            }
            cnt=cnt+r-l+1;
            r++;
        }
        return cnt;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        
        
        return helpMe(nums,goal)-helpMe(nums,goal-1);
        
        
    }
}
