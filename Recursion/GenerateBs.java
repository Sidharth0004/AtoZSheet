import java.util.ArrayList;
import java.util.List;
//3211 Generate Binary Strings Without Adjacent Zeros


// Input: n = 3

// Output: ["010","011","101","110","111"]

// Explanation:

// The valid strings of length 3 are: "010", "011", "101", "110", and "111".
public class GenerateBs {
    
    
public static void helper(int prev , int n , StringBuilder curr , 
ArrayList<String> ans){

if(curr.length() == n){
    ans.add(curr.toString());
    return;
}

if(prev == -1 || prev == 1){
    curr.append('0');
    helper(0, n , curr, ans);
    
    curr.deleteCharAt(curr.length()-1);
}

  curr.append('1');
    helper(1, n , curr, ans);
curr.deleteCharAt(curr.length()-1);


}




    public List<String> validStrings(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(-1 , n , new StringBuilder()  , ans);
        return ans;
    }
}
