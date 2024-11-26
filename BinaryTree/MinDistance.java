import org.w3c.dom.Node;

public class MinDistance {
    public static int lcaDist( Node  root , int n){
      if (root == null) {
        return -1;
      }
      
      if (root.data == n) {
        return 0;
      }
       
      int leftDist = lcaDist(root.left, n);
      int rightDist = lcaDist(root.right, n);

      if (leftDist == -1 && rightDist ==-1) {
        return -1;
      }
      else if (leftDist == -1) {
       return rightDist +1;
      } else{
       return leftDist +1;
      }
     }
     public static int minDist(Node root , int n1 , int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1 + dist2;
     }
}
