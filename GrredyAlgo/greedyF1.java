package GreedyAlgo;

import java.util.ArrayList;

// ! Wiggle
public class greedyF1 {

    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
    
    int n = nums.length;
    if (n < 2) return n;
    
    int up = 1, down = 1;
    
    for (int i = 1; i < n; ++i) {
        if (nums[i] > nums[i - 1]) {
            up = down + 1;
        } else if (nums[i] < nums[i - 1]) {
            down = up + 1;
        }
    }
    
    return Math.max(up, down);

}



    // public int wiggleMaxLength(int[] nums) {
    //     if (nums == null || nums.length == 0) {
    //         return 0;
    //     }

    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(nums[0]);

    //     int n = nums.length; 

    //     int i = 1;
    //     while (i < n) {
    //         if (nums[i] == ans.get(ans.size() - 1)) {
    //             i++;
    //             continue;
    //         }
    //         if (ans.size() % 2 != 0 && nums[i] > ans.get(ans.size() - 1)) {
    //             ans.add(nums[i]);
    //         } else if (ans.size() % 2 == 0 && nums[i] < ans.get(ans.size() - 1)) {
    //             ans.add(nums[i]);
    //         }
    //         i++;
    //     }
    //     return ans.size();
    // }
}
