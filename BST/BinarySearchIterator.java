import java.util.Stack;

public class BinarySearchIterator {
    class BSTIterator {
private Stack<TreeNode> stack = new Stack<>();


    public BSTIterator(TreeNode root) {
        pushAll(root); 
    }
    
    public int next() {
      TreeNode tmpNode = stack.pop();
      pushAll(tmpNode.right);
      return tmpNode.val;  
    }
    
    public boolean hasNext() {
       return !stack.isEmpty(); 
    }
    public void pushAll(TreeNode node){
        // for(;node!=null ;stack.push(node)  , node = node.left );
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}
}
