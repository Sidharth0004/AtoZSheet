import java.util.ArrayList;
import java.util.List;

public class BtRightSideView {
     public List<Integer> rightSideView(TreeNode root) {

   ArrayList<Integer> res = new ArrayList<>();

        recursionRight(root, 0, res);

        return res;
    }

   public void  recursionRight(TreeNode root , int level, ArrayList<Integer> res){
    if(root == null){
    return;
    }
    if(res.size() == level){
        res.add(root.val);
    }
     recursionRight(root.right ,level+1, res);

    recursionRight(root.left ,level+1, res);


   }
}
