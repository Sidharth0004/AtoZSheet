package DpLis;

import java.util.ArrayList;
public class Lis2 {


    private ArrayList<Integer> ans = new ArrayList<>();

    public void helper(int ind, int prevInd, int[] nums, ArrayList<Integer> list) {
        int n = nums.length;
        if (ind == n) {
            if (list.size() > ans.size()) {
                ans.clear();
                ans.addAll(list);
            }
            return;
        }

        helper(ind + 1, prevInd, nums, list);

        if (prevInd == -1 || nums[ind] > nums[prevInd]) {
            list.add(nums[ind]);
            helper(ind + 1, ind, nums, list);
            list.remove(list.size() - 1);
        }
    }

    public ArrayList<Integer> longestIncreasingSubsequence(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(0, -1, arr, list);
        return ans;
    }
}