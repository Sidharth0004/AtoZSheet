import org.w3c.dom.Node;

public class floor {
       public static int floor(Node root, int key) {
        // Code here
         if (root == null) return -1;
        // Code here
        int floor = -1;
        while(root != null){
            if(root.data == key){
                floor = root.data;
                return floor;
            }
            if(key> root.data){
                floor = root.data;
                root = root.right;
            }
            else{
                
                root = root.left;
            }
            
        }
        return floor;
    }
}
