import java.util.HashMap;

public class SubarraySumK {
    
    
public static int subarraySum(int[] nums, int k) {
        int currSum = 0, count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            currSum += nums[i];

            if(map.containsKey(currSum-k))
                count += map.get(currSum-k);

            if(currSum == k)
                count++;

            if(map.containsKey(currSum))
                map.put(currSum, map.get(currSum)+1);
            else
                map.put(currSum, 1);
        }

        return count;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        System.out.println(subarraySum(nums, k));
    }
}
