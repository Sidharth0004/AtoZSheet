public class NiceSubarray {
    public int helpMe(int[] nums,int goal){
        int l=0;
        int r=0;
        int sum=0;
        int cnt=0;
        if(goal<0){
            return 0;
        }
        while(r<nums.length){
            sum += nums[r]%2;
            while(sum>goal){
                if(nums[l]%2==1){
                    sum--;
                }
                l++;

            }
            cnt=cnt+r-l+1;
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return helpMe(nums,k)-helpMe(nums,k-1);
    }
}
