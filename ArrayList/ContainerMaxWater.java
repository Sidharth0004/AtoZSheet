//Container With Most Water

import java.util.*;


public class ContainerMaxWater {
    
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int lp = 0;
        int rp = n-1;

        while (lp<rp) {
           int ht = Math.min(height[lp], height[rp]);
           int width = rp-lp;
           int currwater = ht*width;
           
           maxWater = Math.max(maxWater, currwater);
           if (height[rp]>height[lp]) {
            lp++;
           }else rp--;

        }
   
        return maxWater;
        
    }

    public static void main(String[] args) {
      int [] height = {1,8,6,2,5,4,8,3,7}  ;

      System.out.println(maxArea(height));
    }
}
