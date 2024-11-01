// 992. Subarrays with K Different Integers
import java.util.*;
public class SubArrWithDiifInt {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int subK = helper(nums,k);
        int sub = helper(nums,k-1);
        return subK-sub;
    }
    // private int helper(int nums[], int k){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     int left=0;
    //     int right=0;
    //     int count=0;
    //     while(right<nums.length){
    //         map.put(nums[right], map.getOrDefault(nums[right],0)+1);
    //         while(map.size()>k){
    //             map.put(nums[left],map.get(nums[left])-1);
    //             if(map.get(nums[left])==0){
    //                 map.remove(nums[left]);
    //             }
    //             left++;
    //         }
    //         count = count+ right-left+1;
    //         right++;
    //     }
    //     return count;
    // }

    private int helper(int nums[] , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int r = 0 ;
         int l = 0;
         
        int cnt = 0;

        while(r<nums.length){
         map.put(nums[r] ,map.getOrDefault(nums[r],0)+1);

         while(map.size()>k){
           
             map.put(nums[l],map.get(nums[l])-1);

            if(map.get(nums[l])==0){
                map.remove(nums[l]);
            }
            l++;
         }
         cnt = cnt + r-l+1;
         r++;
        }
    
      return cnt;
    }
}
