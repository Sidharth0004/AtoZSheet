// package GrredyAlgo;

// import java.util.ArrayList;
// import java.util.Arrays;
// //! Job sequencing Problem
// class Job {
//     int deadline;
//     int profit;

//     Job(int deadline, int profit) {
//         this.deadline = deadline;
//         this.profit = profit;
//     }
// }

// public class greed10 {
//     ArrayList<Integer> JobScheduling(Job jobs[], int n) {
        
//        Arrays.sort(jobs,(a,b)->(b.profit-a.profit));
//        int totProfit = 0 ;
//        int cnt = 0 ; 
//        int maxdedline = 0 ;
//        for(int i = 0 ; i<n ; i++){
//          maxdedline = Math.max(maxdedline , jobs[i].deadline)  ;
         
//        }
//        int [] hash = new int [maxdedline+1];
      
//       Arrays.fill(hash , -1);
//       for(int i = 0 ; i<n ; i++){
//           for(int j = jobs[i].deadline ; j>0; j--){
//               if(hash[j] ==-1){
//                   cnt++;
//                   hash[j] = i;
//                   totProfit += jobs[i].profit;
//                   break;
//               }
//           }
//       }
      
//          ArrayList<Integer> a = new ArrayList<Integer>();
//          a.add(cnt);
//          a.add(totProfit);
         
//          return a;
     
//     }
// }
package GrredyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greed10 {

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        // code here..
        int n = id.length;
        int [][] job = new int [n][3];
        
        for(int i =0 ; i<n ; i++){
            job[i][0] = id[i];
            job[i][1] = deadline[i];
            job[i][2] = profit[i];
        }
        
        Arrays.sort(job, (a, b) -> b[2] - a[2]);
        int cnt = 0 ; 
        int totprofit = 0 ;
        
        int maxdeadline = 0;
        for(int i = 0 ; i<n ; i++){
            maxdeadline = Math.max(maxdeadline ,deadline[i]);
        }
        int hash [] = new int [maxdeadline+1];
              Arrays.fill(hash , -1);

        for(int i = 0; i<n ; i++){
            for(int j = job[i][1] ; j>0 ; j--){
                
               if(hash[j] == -1){
                    cnt++;
                   hash[j] = i;
                  
                   totprofit += job[i][2];
                   break;
               } 
                
                
            }
        }
        
                 ArrayList<Integer> a = new ArrayList<Integer>();
         a.add(cnt);
         a.add(totprofit);
         
         return a;
        
    }
}