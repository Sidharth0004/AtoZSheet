package GrredyAlgo;

import java.util.Arrays;
// Assign Cookies
public class greed1 {

    
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int l = 0 ; 
        int r = 0;

      Arrays.sort(g);
       Arrays.sort(s);
        while(l<m && r<n){
        if(g[r]<= s[l]){
            r++;
        }


       l++;

        }

   return r;

    }
}