package 1Practice.LL;

public class LLRandomNode {
 
    ArrayList<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        double rand=Math.random()*list.size();
        return list.get((int)rand);
    }
}
