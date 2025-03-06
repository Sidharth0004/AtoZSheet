import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArr {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i = n-1 ; i>=0 ; i-- ){
            max = Math.max(arr[i] , max);
            if(arr[i]>= max){
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
      return ans;  
    }
}
