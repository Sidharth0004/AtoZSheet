package GrredyAlgo;
//! Shortest Job first

import java.util.Arrays;

public class greed12 {
        static int solve(int bt[] ) {

Arrays.sort(bt);
int t =  0;
int wt = 0 ;

for(int i = 0 ; i<bt.length ; i++){
        wt += t;
    t += bt[i];

    
}

return wt/bt.length;

  }
}
