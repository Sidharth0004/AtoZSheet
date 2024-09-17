// Two Sum II - Input Array Is Sorted

import java.util.*;
public class TwoSumII {
    
    public static int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int lp = 0;
        int rp = n-1;

        while (lp!=rp) {
            // System.out.println("nknjn");
            if (numbers[lp]+ numbers[rp] == target) {
                return new int[] {lp+1,rp+1};
            }
             if (numbers[lp] + numbers[rp] < target) {
                System.out.println(lp);
                lp++;
            }
            else rp--;
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
     int [] req =    twoSum(numbers, 9);

        System.out.println(req.length);

    }
}
