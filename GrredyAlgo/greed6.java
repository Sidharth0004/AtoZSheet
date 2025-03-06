package GrredyAlgo;

import java.util.Arrays;
import java.util.Comparator;
//! N meetings in one room
public class greed6 {
    public int maxMeetings(int start[], int end[]) {
        
        int activities[][] = new int[start.length][3];
        for(int i = 0 ; i<start.length ;i++){
              activities[i][0]=i;
           activities[i][1]=start[i];
           activities[i][2]=end[i];
        }
        
            Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));
               int maxAct = 1;
               int lastEnd = activities[0][2];
         
       for (int i = 1; i < end.length; i++) {
          if(activities[i][1] > lastEnd){

           maxAct++;

           lastEnd =activities[i][2];

          } 
       } 
       return maxAct;
   }
}
