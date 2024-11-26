import java.util.ArrayList;

import org.w3c.dom.Node;

public class lca {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return root;
        }
   
       if(root.val == p.val || root.val == q.val){
        return root;
       }

   TreeNode leftlca =     lowestCommonAncestor(root.left , p ,q);
    TreeNode rightlca =    lowestCommonAncestor(root.right , p ,q);

    if (rightlca == null ) {
        return leftlca;
      }
      if (leftlca == null) {
        return rightlca;
      }

      return root;



    }

    // !0R

    // public static boolean getPAth(Node root,  int n , ArrayList<Node> path){
    //    if (root == null) {
    //        return false;
    //    } 

    //    path.add(root);
    //     if (root.data == n) {
    //        return true; 
    //     }
    // boolean foundLeft =  getPAth(root.left, n, path);
    // boolean foundRight =  getPAth(root.right, n, path);

    // if (foundLeft ||foundRight) {
    //     return true; 
    // }

    // path.remove(path.size()-1);
    // return false;
    // }

    // public static Node Lca(Node root , int n1 , int n2){
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPAth(root , n1 , path1);
    //     getPAth(root , n2 , path2);

    //     // last common ancestor
    //     int i = 0;
    //     for ( ;  i < path1.size() && i< path2.size(); i++) {
    //         if (path1.get(i) != path2.get(i)) {
    //             break;
    //         }
    //     }
    //     // last equal node 
    //     Node lca = path1.get(i-1);
    //     return lca;
    // }

}
