package GrredyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//! Merge Intervals
public class greed15 {
        public int[][] merge(int[][] arr) {
         int n = arr.length;
        Arrays.sort(arr,(a,b) -> (a[0]-b[0]));

                List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
        
            else {
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
         int res[][] = new int[ans.size()][2];
    for(int j = 0 ; j<ans.size() ; j++){
        res[j][0] = ans.get(j).get(0);
        res[j][1] = ans.get(j).get(1);
    }
    return res;



    }
}
