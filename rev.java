import java.util.ArrayList;

public class rev {

     public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
     int rem = grid[0][0] % x;
     for(int i = 0 ; i< grid.length ; i++){
        for(int j = 0 ; j< grid[i].length ; j++){
          if(grid[i][j]%x != rem ){
            return -1;
          }
          arr.add(grid[i][j]);

        }
     }
 java.util.Collections.sort(arr);
 int n = arr.size();
 int mid = n/2;

 int step = 0 ;
 for(int i = 0 ;i<n ; i++){
    step += Math.abs(arr.get(i)-arr.get(mid))/x;
 }

return step;
    }
}


