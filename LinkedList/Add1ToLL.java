import org.w3c.dom.Node;

public class Add1ToLL {
    public Node reverse(Node head){
        Node curr =  head;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
       head = reverse(head);
       
       Node temp = head;
      int carry = 1;
       
       while(temp!= null){
           temp.data =  temp.data+1;
           if(temp.data <10){
               carry = 0;
               break;
           }
           else{
               temp.data = 0;
               carry =1;
           }
           temp = temp.next;
       }
        if(carry ==1){
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
            return newNode;
        }
        
          head = reverse(head);
          return head;
        
        
        
    }
}
