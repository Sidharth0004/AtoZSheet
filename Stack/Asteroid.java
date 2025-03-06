import java.util.Stack;

public class Asteroid {
        public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st  = new Stack<>();
        int n = asteroids.length;
         for(int i = 0 ; i<n ; i++){
             if(asteroids[i]>0){
                st.push(asteroids[i]);
             }
             else {
             while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i]))
                {
                    st.pop();
                }

                 if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                 }
                 else if(st.isEmpty() && asteroids[i]<0 || (st.peek()<0 && asteroids[i]<0)){
                    st.push(asteroids[i]);
                }
             }
        

         }
                 int y = st.size();
        int arr[] = new int[y];
        int i = y-1;;
    
        while (!st.isEmpty()) {
            arr[i--] = st.pop();
        }
        return arr;



    }
}
