import java.util.*;
// import java.util.AbstractMap.SimpleEntry;

import org.w3c.dom.Node;

public class TopView {

     class Pair<u, v> {
    public u first;
    public v second;

    public Pair(u first, v second) {
        this.first = first;
        this.second = second;
    }

    public u getKey() {
        return first;
    }

    public v getValue() {
        return second;
    }
}
  
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Map<Integer , Integer> mpp = new TreeMap<>();
        // Queue<Pair<Node , Integer>> q = new LinkedList<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root , 0));
        
        while(!q.isEmpty()){
            Pair<Node, Integer> pair = q.poll();
            Node node = pair.getKey();
            Integer line = pair.getValue();
            
            if(!mpp.containsKey(line)){
                mpp.put(line , node.data);
            }
            if(node.left!= null){
                q.add(new Pair<>(node.left, line - 1));
            }
             if(node.right!= null){
                q.add(new Pair<>(node.right, line + 1));
            }
            
        }
          for (int value : mpp.values()) {
            ans.add(value);
        }
        
        return ans;
        
    }
}