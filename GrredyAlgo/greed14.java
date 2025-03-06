package GrredyAlgo;
//! Insert Interval
import java.util.ArrayList;

public class greed14 {
      public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = intervals.length;
        int i =0;

        while(i<n && intervals[i][1]<newInterval[0]){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(intervals[i][0]);
             temp.add(intervals[i][1]);
             ans.add(temp);
  i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
             newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
         i++;
        }

       ArrayList<Integer> temp = new ArrayList<>();
        temp.add(newInterval[0]);
        temp.add(newInterval[1]);
        ans.add(temp);

        while(i<n){
               temp = new ArrayList<>();
            temp.add(intervals[i][0]);
             temp.add(intervals[i][1]);
             ans.add(temp);
  i++; 
        }

    int res[][] = new int[ans.size()][2];
    for(int j = 0 ; j<ans.size() ; j++){
        res[j][0] = ans.get(j).get(0);
        res[j][1] = ans.get(j).get(1);
    }
    return res;

        
    }
}


//! Arrays.sort(twoDim, (int[] o1, int[] o2) -> o2[0] - o1[0]);