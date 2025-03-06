public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        int[] cnt = new int[1];
        int[] ans = new int[1];
        helper(root, k, cnt, ans);
        return ans[0];
    }

    public void helper(TreeNode root, int k, int[] cnt, int[] ans) {
        if (root == null) {
            return;
        }

        helper(root.left, k, cnt, ans);
        cnt[0]++;
        if (cnt[0] == k) {
            ans[0] = root.val;
            return;
        }
        helper(root.right, k, cnt, ans);
    }
}
