import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three3sum {

        public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>>  st = new HashSet<>();

        int n = arr.length;

     for(int i = 0 ; i<n ; i++){
        for(int j = i+1 ; j<n ; j++){
           for(int k = j+1 ; k<n ; k++){
            if(arr[i]+arr[j]+arr[k] == 0){
                List<Integer> temp = Arrays.asList(arr[i] , arr[j] , arr[k]);
                  temp.sort(null);
                        st.add(temp);
            }
           }
        }
     }

 List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
 
}
