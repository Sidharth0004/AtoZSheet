import java.util.Stack;

public class MAximalRec {
    
   public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int leftSmall [] = new int [n];
        int rightSmall [] = new int [n];

        for(int i = 0 ; i<n ; i++){
            while(!st.isEmpty() &&  heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) {
                leftSmall[i] = 0; 
            }
            else{
                leftSmall[i] =st.peek()+1;  
            }
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();

        for(int i = n-1 ; i>=0 ; i-- ){
            while(!st.isEmpty() &&  heights[st.peek()]>= heights[i]){
                st.pop();
            }
            if(st.isEmpty()) {
                rightSmall[i] = n - 1; 
            }
            else{
                rightSmall[i] =st.peek()-1;  
            }
            st.push(i);
        }
        int maxA = 0;
        for(int i = 0 ; i<n ; i++){
            maxA = Math.max(maxA , heights[i] *(rightSmall[i] -leftSmall[i] +1 ));
        }
        return maxA;
    }

    public int maximalRectangle(char[][] matrix) {
       if (matrix.length == 0) return 0;
       int n = matrix.length;
       int m = matrix[0].length;
       int maxA = 0 ;
       int preSum[][] = new int [n][m];

       for(int j = 0 ; j<m ; j++){
            int sum = 0 ;
            for(int i = 0 ; i<n ; i++){
                sum += matrix[i][j] - '0';
                if(matrix[i][j] == '0' ){
                    sum =0 ;
                }
                preSum[i][j] = sum;
            }
       }
       for(int i =0 ; i<n ;i++){
            maxA = Math.max(maxA, largestRectangleArea(preSum[i]));
       }
       return maxA;
    }

    public static void main(String[] args) {
        MAximalRec obj = new MAximalRec();
        char[][] matrix = { {'0', '1'}, {'1', '0'} };
        System.out.println(obj.maximalRectangle(matrix)); // Output: 1
    }
}
