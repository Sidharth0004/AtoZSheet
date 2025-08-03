// package Stack;

/**
 * NextSmaller
 */



 
// public class NearestSmaller {

   
//    public int[] finalPrices(int[] prices) {
        
//       Stack<Integer> st = new Stack<Integer>();

//       for(int i=0; i<prices.length; i++){
//           while(!st.isEmpty() && prices[st.peek()] >=prices[i]){
//               prices[st.pop()]-= prices[i];
//           }

//           st.push(i);
//       }

//       return prices;
//   }
// }
                //! or
            //     public int[] finalPrices(int[] prices) {
        
            //       int len=prices.length;
            //       int[] arr=new int[len];
            //       Stack<Integer> stack=new Stack<>();
            //        for(int i=len-1;i>=0;i--){
            //            if(stack.isEmpty()){
            //                int x=prices[i];
            //                stack.push(x);
            //                arr[i]=x;
            //                continue;
            //            }
                       
            //            while(!stack.isEmpty() && prices[i]<stack.peek()){
            //                stack.pop();
            //            }
            //            if(stack.isEmpty()){
            //                arr[i]=prices[i];
            //            }else{
            //                arr[i]=prices[i]-stack.peek();
                           
            //            }
            //            stack.push(prices[i]);
            //        }
            //       return arr;
                  
            //   }
          