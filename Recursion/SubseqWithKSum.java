public class SubseqWithKSum {
    public static boolean helper(int ind , int n , int k , int []a ){

        if(ind ==n ){
            if(k==0){
                return true;
            }
            return false;
        }
      
        if(a[ind]<= k ){
            if(helper(ind+1 , n , k-a[ind] , a)){
                return true;
            }
        }
        return helper(ind+1 , n , k , a);
    }
      
          public static boolean isSubsetPresent(int n, int k,int []a) {
              // Write your code here
      
      
            return  helper(0,n , k , a);
          }
}
