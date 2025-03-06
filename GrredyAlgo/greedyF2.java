package GrredyAlgo;

public class greedyF2 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int [][] ans = new int [n + 1][11];

        for(int i = 0 ; i< reservedSeats.length ; i++){
           int m =  reservedSeats[i][0];
           int k =   reservedSeats[i][1];
           ans[m][k]=-1;
        }
        int res = 0 ;
   for(int i = 1 ; i<ans.length ; i++){
    if(ans[i][2]!=-1 && ans[i][3]!=-1 && ans[i][4]!=-1&&ans[i][5]!=-1&&ans[i][6]!=-1&&
    ans[i][7]!=-1 && ans[i][8]!=-1 && ans[i][9]!=-1){
    res += 2;
    }
    else if( ans[i][2]!=-1 && ans[i][3]!=-1 && ans[i][4]!=-1 && ans[i][5]!=-1 ){
    res += 1;
    }
    else if( ans[i][6]!=-1 && ans[i][7]!=-1 && ans[i][8]!=-1 && ans[i][9]!=-1 ){
    res += 1;
    }
     else if( ans[i][4]!=-1&&ans[i][5]!=-1&&ans[i][6]!=-1&& ans[i][7]!=-1 ){
    res += 1;
    }
  

   }
   return res;

    }  
}
