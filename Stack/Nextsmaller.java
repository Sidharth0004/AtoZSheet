package Stack;

import java.util.Stack;

public class Nextsmaller {

        public int[] prevSmaller(int[] A) {
        
        int n = A.length;
        int nse [] = new int [n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i<n;i++){
            
            while(!st.isEmpty() && st.peek()>= A[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                nse[i] = -1;
            }
            else{
                nse[i]  = st.peek();
            }
            
            st.push(A[i]);
        }
        
        return nse; 
    }
}