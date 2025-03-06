package GrredyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// Fractional Knapsack Problem
public class greed2 {
    
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
    
       double[][] ratio = new double[val.size()][2];
       
       for(int i = 0 ; i< val.size() ; i++){
           ratio[i][0] = i;
           ratio[i][1] =val.get(i)/(double)wt.get(i);
       }
    
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    // Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
    double ans = 0;
    int k =val.size()-1;
    for(int i = k ; i>=0 ; i--){
        int ind = (int)ratio[i][0];
       if(capacity>=wt.get(ind)){
           ans += val.get(ind);
         capacity -=   wt.get(ind);
       }
       else{
           ans += (capacity*ratio[i][1]);
           capacity = 0;
           break;
           
       }
       
       
    }
    return ans;
    
    }
}
