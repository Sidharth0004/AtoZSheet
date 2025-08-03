import java.util.Stack;

public class DailyTemp {

     public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
       int nge [] = new int[n];
       Stack<Integer> st = new Stack<>();

       for(int i = n-1; i>=0 ; i--){
        while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
            st.pop();
        }
     if(st.isEmpty()){
        nge[i] = 0;
     }
     else{
        nge[i] = st.peek()-i;
     }
     st.push(i);

       }

 return nge;

    }
}