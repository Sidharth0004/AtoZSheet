import java.util.ArrayList;

public class RootToNodePath {
     public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> list = new ArrayList<>();
        if(root== null){
            return list;
        }
        helper(root , x, list);
        return list;
    }
    public static boolean helper(TreeNode root, int x ,ArrayList<Integer> list ){
        if (root == null){
            return false;
        }
     
       list.add(root.data);
   if(root.data == x) return true;
   if(helper(root.left , x , list)|| helper(root.right , x , list)){
       return true;
   }

   list.remove(list.size()-1);
   return false;

    }
}
