// package SlidingWindow;
// // package SlidingWindow;
// Longest Substring Without Repeating Characters
import java.util.*;


public class LonSub {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length()  ;
        int r =0; 
        int l =0 ;
        int maxlen =0;
       
       int [] hash = new int[128];
//  "abcabcbb";`
       while(r<n){
          char c = s.charAt(r);
          l =  Math.max(l, hash[c]);
         maxlen = Math.max(maxlen , r-l+1);
         hash[c] =r+1;
         r++;
       }
     

      return maxlen;  
    }
    

    // public static int lengthOfLongestSubstring(String s) {
    //     int n = s.length() -1 ;
    //     int r =0; 
    //     int l =0 ;
    //     int maxlen =0;
    //     HashMap<Character, Integer> map = new HashMap<>();
     

    //     while (r<n) {
          
    //         char c = s.charAt(r);
    //         if (map.get(c)>l) {
    //             l= map.get(c) +1;
    //             map.put(c, r);
                
    //         }
    //         maxlen = Math.max(maxlen, r-l+1);
    //         map.put(c, r);

            
    //         r=r+1;

    //     }
    //     return maxlen;
    // }





    public static void main(String[] args) {
    
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
                    
    }
}
