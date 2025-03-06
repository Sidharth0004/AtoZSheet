public class BSTfromPreorder {
    public TreeNode bstFromPreorder(int[] A) {
        return bstFromPreorder(A ,Integer.MAX_VALUE , new int[]{0});
    }
    public TreeNode bstFromPreorder(int A [] , int bound , int [] i){
        if(i[0] ==A.length || A[i[0]] >bound) return null;
        TreeNode node = new TreeNode(A[i[0]++]);
        node.left = bstFromPreorder(A , node.val , i);
        node.right = bstFromPreorder(A, bound , i);
        return node;
    }
}
