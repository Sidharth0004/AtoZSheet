import java.util.ArrayList;
import java.util.List;

public class Comibination3 {
        public static void helper(int ind , int tar, int k , int [] nums , List < List < Integer >> ans  , ArrayList<Integer> ds){
        int n = nums.length;
if(ind == n){
    if(k==0 && tar ==0){
        ans.add(new ArrayList < > (ds));
    }
    return;
}

  if(k!=0 && nums[ind]<=tar){
   ds.add(nums[ind]);
    helper(ind+1 , tar-nums[ind],k-1,nums , ans , ds);
     ds.remove(ds.size() - 1);
  }

helper(ind+1 , tar , k, nums , ans , ds);

    }


    public List<List<Integer>> combinationSum3(int k, int n) {
         List < List < Integer >> ans = new ArrayList < > ();
        int nums[] = new int[9];
        int p = 0;
        for(int i = 1 ; i<=9 ; i++){
            nums[p] = i;
            p++;
        }
          helper(0 ,n,k, nums ,ans , new ArrayList<>() );
   return ans;
    }
}
