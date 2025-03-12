import java.util.ArrayList;




public class Subset1 {
      public static void helper(int ind , int sum , int [] arr , ArrayList<Integer> ans){
       int n = arr.length;
        if(ind == n){
            ans.add(sum);
            return;
        }
        
        
        
        helper(ind+1, sum+arr[ind] , arr , ans);
        
        helper(ind+1 , sum , arr , ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
      int n = arr.length;
      helper(0 ,0, arr ,ans );
      return ans;
    }
}
