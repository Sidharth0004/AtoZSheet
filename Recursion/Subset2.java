import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void helper(int ind , int n , int [] nums , List<List<Integer>> ans ,
ArrayList<Integer> ds ){

if(ind==n){
     if(!ans.contains(ds))
    ans.add(new ArrayList < > (ds));
    return;
}
  
   ds.add(nums[ind]);
    helper(ind+1 , n ,nums,ans ,ds );
    ds.remove(ds.size()-1);
    helper(ind+1 , n ,nums,ans ,ds );
}



    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        helper(0 ,n, nums ,ans , new ArrayList<>() );
        return ans;
    }
}
