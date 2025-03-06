import java.util.LinkedList;
import java.util.Queue;

public class StackwQueue {
    class MyStack {
        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }
    
        public void push(int x) {
            q.add(x);
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());
            }
        }
    
        int pop() {
            return q.remove();  
        }
    
        int top() {
            return q.peek();
        }
    
        boolean empty() {
            return q.isEmpty();
        }
    }
}
