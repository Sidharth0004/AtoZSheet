import java.util.ArrayList;
import java.util.List;
// Input: n = 4, k = 2
// Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
// Explanation: There are 4 choose 2 = 6 total combinations.
// Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
public class Combinations {
    
    
public static void helper(int ind , int k , int [] nums , List < List < Integer >> ans  , ArrayList<Integer> ds){

int n = nums.length;
if(ind == n){
    if(k==0 ){
        ans.add(new ArrayList < > (ds)); 
    }
    return;
}


if(k!= 0 ){
     ds.add(nums[ind]);
  helper(ind+1 , k-1 , nums , ans , ds);
   ds.remove(ds.size() - 1);
}
helper(ind+1 , k , nums , ans , ds);


}



    public List<List<Integer>> combine(int n, int k) {
         List < List < Integer >> ans = new ArrayList < > ();

        int nums[] = new int[n];
         int p = 0;
        for(int i = 1 ; i<=n ; i++){
            nums[p] = i;
            p++;
        }
     

          helper(0 ,k, nums ,ans , new ArrayList<>() );
   return ans;
    }
}
