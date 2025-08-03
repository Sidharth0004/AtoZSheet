import java.util.Stack;

public class ValidateStackSeq {
      public boolean validateStackSequences(int[] pushed, int[] popped) {
        
   Stack<Integer> st = new Stack<>();
   int n = pushed.length;
   int r = 0 ;

  for(int i = 0 ; i <n ; i++){
     st.push(pushed[i]);
    while(!st.isEmpty() && st.peek() == popped[r]){
        st.pop();
        r++;
    }
   
  }

return st.isEmpty();

    }
}
