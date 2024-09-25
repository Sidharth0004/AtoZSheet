import java.util.*;


public class MinSubArrSum {
    public static int[] nextSmaller(int[] arr) {

      
        Stack<Integer> s = new Stack<>();
        int nxtSmaller[]=new int[arr.length];

        for (int i = arr.length -1; i >= 0; i--) {
            
            while (!s.isEmpty() && arr[i]<= arr[s.peek()]) {
                s.pop();
            }
   if (s.isEmpty()) {
    nxtSmaller[i] = arr.length ;
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
            
            while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
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

        for (int i = 0; i < nse.length; i++) {
           System.out.print(nse[i]+"-"); 
        }
System.out.println();

        int [] pse = prevSmaller(arr);
        for (int i = 0; i < nse.length; i++) {
            System.out.print(pse[i]+"-"); 
         }
 System.out.println();

        int total = 0;
        int mod = (int)(1e9+7);

        for (int i = 0; i < pse.length; i++) {
            int left = i - pse[i];
            int right = nse[i] -i;
        

            
            total = (total + left*right*arr[i])%mod;
            
        }
  return total;

    }
    
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};
        // System.out.println(sumSubarrayMins(nums));

        int sum = 0 ;
        int mod = (int)(1e9+7);

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];

            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                sum  += min;

            }

        }

        System.out.println(sum);

    }
}

// int ans = 0;
// int n = nums.length;


// for (int i = 0; i < n; i++) {
//     int min_ele = nums[i];

//     for (int j = i; j < n; j++) {
//         min_ele = Math.min(min_ele, nums[j]);

//         ans += min_ele;
//     }
// }

// System.out.println(ans);






//   public static int[] nextSmaller(int[] arr) {

      
//         Stack<Integer> s = new Stack<>();
//         int nxtSmaller[]=new int[arr.length];

//         for (int i = arr.length -1; i >= 0; i--) {
            
//             while (!s.isEmpty() && arr[i]< arr[s.peek()]) {
//                 s.pop();
//             }
//    if (s.isEmpty()) {
//     nxtSmaller[i] = arr.length ;
//    }
//    else{
//     nxtSmaller[i]= s.peek();
//    }

// s.push(i);
//         }

//         return nxtSmaller;
        

//     }


//     public static int [] prevSmaller (int [] arr){

//         Stack<Integer> s = new Stack<>();
//         int[] prevSmall = new int[arr.length];

        
//         for (int i = 0; i < arr.length; i++) {
            
//             while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
//                 s.pop();
//             }

//             if (s.isEmpty()) {
//                 prevSmall[i] = -1;
//             } else {
//                 prevSmall[i] = s.peek();

//             }

//             s.push(i);

//         }

//         return prevSmall;




//     }



//     public static int sumSubarrayMins(int[] arr) {
       
//         int [] nse  = nextSmaller(arr);
//         int [] pse = prevSmaller(arr);
//         long total = 0;
//         int mod = (int)(1e9+7);

//         for (int i = 0; i < pse.length; i++) {
//             int left = i - pse[i];
//             int right = nse[i] -i;
//             long prod= (left*right)%mod;
//             prod = (prod*arr[i])%mod;

//            total = (total%mod +prod)%mod;
//             // total = (total + left*right*arr[i])%mod;

            
//         }
//   return (int)total;

//     }