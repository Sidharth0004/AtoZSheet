

public class MaxValOrderedTriplet {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0;

        int[] maxLeft = new int[n];
        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }

        int minRight = Integer.MIN_VALUE;
        for (int j = n - 2; j > 0; j--) {
            minRight = Math.max(minRight, nums[j + 1]);
            if (nums[j] < maxLeft[j - 1]) {
                ans = Math.max(ans, (long) (maxLeft[j - 1] - nums[j]) * minRight);
            }
        }

        return ans;
    }
}
