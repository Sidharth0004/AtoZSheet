import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
        static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}


// ! TLE Marega 172/176
// private void helper(int ind , int target , int [] nums ,List<List<Integer>> ans, List<Integer> ds ){

//     if(ind == nums.length){
//         if(target==0){
//             if(!ans.contains(ds))
//             ans.add(new ArrayList<>(ds));
//         }
//         return;
//     }
    
    
    
    
    
    
//     if(nums[ind]<= target){
//         ds.add(nums[ind]);
//         helper(ind+1 , target-nums[ind] , nums , ans , ds);
//         ds.remove(ds.size()-1);
//     }
    
//      helper(ind+1 , target , nums , ans , ds);
    
    
//      }
    
    
    
//         public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//           List<List<Integer>> ans = new  ArrayList<>();
//                  Arrays.sort(candidates);
//         helper(0 , target , candidates , ans , new ArrayList<>());
//         return ans;
//         }