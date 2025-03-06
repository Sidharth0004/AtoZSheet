import java.util.Stack;

public class SumSubArrMin {
    

  public static int[] nextSmaller(int[] arr) {

      
        Stack<Integer> s = new Stack<>();
        int nxtSmaller[]=new int[arr.length];

        for (int i = arr.length -1; i >= 0; i--) {
            
            while (!s.isEmpty() && arr[i]< arr[s.peek()]) {
                s.pop();
            }
   if (s.isEmpty()) {
    nxtSmaller[i] = arr.length  ;
   }
   else{
    nxtSmaller[i]= s.peek();
   }

s.push(i);
        }

        return nxtSmaller;
        

    }


    public static int [] prevSmaller (int [] arr){

        Stack<Integer> s = new Stack<>();
        int[] prevSmall = new int[arr.length];

        
        for (int i = 0; i < arr.length; i++) {
            
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                prevSmall[i] = -1;
            } else {
                prevSmall[i] = s.peek();

            }

            s.push(i);

        }

        return prevSmall;




    }



    public static int sumSubarrayMins(int[] arr) {
       
        int [] nse  = nextSmaller(arr);
        int [] pse = prevSmaller(arr);
        long total = 0;
        int mod = (int)(1e9+7);

        for (int i = 0; i < pse.length; i++) {
            int left = i - pse[i];
            int right = nse[i] -i;
            long prod= (left*right)%mod;
            prod = (prod*arr[i])%mod;

           total = (total%mod +prod)%mod;
            // total = (total + left*right*arr[i])%mod;

            
        }
  return (int)total;

    }
}
