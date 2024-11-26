public class MaxPathSum {
    private int globalMax;

    public int maxPathSum(TreeNode root) {
        globalMax = Integer.MIN_VALUE;
        maxPathSumHelper(root);
        return globalMax;
    }

    private int maxPathSumHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(maxPathSumHelper(node.left), 0);
        int right = Math.max(maxPathSumHelper(node.right), 0);

        int localMax = left + right + node.val;
        globalMax = Math.max(globalMax, localMax);

        return node.val + Math.max(left, right);
    }
}
