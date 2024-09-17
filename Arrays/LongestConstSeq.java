//Longest Consecutive Sequence
import java.util.*;
public class LongestConstSeq {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
            Arrays.sort(nums);
            int count =0;
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i]+",");
            }
           System.out.println();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]!= nums[(i+1)%n]) {
                    // System.out.println(nums[i]);
                    list.add(nums[i]);
                }
            }

            System.out.println(list);
            int l = list.size();

            for (int i = 0; i < list.size(); i++) {
                if (list.get((i+1)%l)==list.get(i) +1  ) {
                   count++; 
                }
                else {
                    count =0;
                }
                ans = Math.max(ans, count);
            }
      return ans+1;
           
        }
   

    public static void main(String[] args) {
        int nums[] ={-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2};
       System.out.println(longestConsecutive(nums));
    }
}
