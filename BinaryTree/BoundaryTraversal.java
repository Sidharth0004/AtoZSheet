import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    
    public class Solution {
        boolean isLeaf(TreeNode root) {
          return root.left == null && root.right == null;
      }
  public void addLeftBoundary(TreeNode root , ArrayList<Integer> res){
      TreeNode cur = root.left;
      while(cur != null){
          if(isLeaf(cur) == false) res.add(cur.data);
          if(cur.left != null) cur = cur.left;
          else cur = cur.right;
      }
  }
  
  public void addRightBoundary(TreeNode root , ArrayList<Integer> res){
       TreeNode curr = root.right;
          List<Integer> temp = new ArrayList<>();
          while (curr != null) {
              if (!isLeaf(curr)) {
                  temp.add(curr.data);
              }
             
              if (curr.right != null) {
                  curr = curr.right;
              } else {
                  curr = curr.left;
              }
          }
         
          for (int i = temp.size() - 1; i >= 0; --i) {
              res.add(temp.get(i));
          }
  }
  
    void addLeaves(TreeNode root, ArrayList<Integer>  res ) {
          
          if (isLeaf(root)) {
              res.add(root.data);
              return;
          }
          if (root.left != null) {
              addLeaves(root.left, res);
          }
          if (root.right != null) {
              addLeaves(root.right, res);
          }
      }
  
  
      public static List<Integer> traverseBoundary(TreeNode root){
          ArrayList<Integer>  ans = new ArrayList<>();
          if(isLeaf(root)== false) ans.add(root.data);
          addLeftBoundary(root ,ans);
          addLeaves(root , ans);
          addRightBoundary(root , ans);
          return ans;
  
      }}
}