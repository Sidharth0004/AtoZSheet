import org.w3c.dom.Node;

public class PreorSuc {
        public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key

Node temp = root;
       
        while(root!=null){
           if(key<=root.data){
              
              root = root.left;
           }
           else{
               pre[0] = root;
               root = root.right;
           }
       }
       
       
       while(temp!=null){
           if(key>=temp.data){
              
              temp = temp.right;
           }
           else{
               suc[0] = temp;
               temp = temp.left;
           }
       }
       
      
       
       
    }
}
