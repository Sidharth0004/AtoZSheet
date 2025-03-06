package BSonAnswer;

import java.util.ArrayList;

public class PaintersPartitions {
    public static int noOfPainters(ArrayList<Integer> boards , int load){
    int n = boards.size();
    int sum = 0;
    int painters= 1;
    for (int i = 0; i < n; i++) {
        if(sum + boards.get(i) <= load ){
            sum += boards.get(i);
        }
        else{
            painters++;
            sum = boards.get(i);
        }
    } 
       return painters;
}

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int n = boards.size();
        int maxi= 0 ;
        int sum = 0 ;
        
        for(int i = 0 ; i<n ; i++){
         maxi = Math.max(boards.get(i), maxi);
         sum += boards.get(i);
        }
        if (k>n) {
            return -1;
        }
        int low = maxi;
        int high = sum;
        int ans =0;
        while (low<=high) {
            int mid = (low+high)/2;
            int painters = noOfPainters(boards , mid );

            if (painters>k) {
                low = mid+1;
            }
            else{
               high = mid -1;
               ans = mid;
            }

            
        }
return ans;


    }
}
