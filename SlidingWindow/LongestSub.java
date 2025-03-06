import java.util.*;
// Longest Substring with At Most K Distinct Characters
public class LongestSub {


    public static int kDistinctChars(int k, String str) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < str.length()) {
            map.put(str.charAt(r), map.getOrDefault(str.charAt(r), 0) + 1);
            if (map.size() <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            } else {
                map.put(str.charAt(l), map.getOrDefault(str.charAt(l), 0) - 1);
                if (map.get(str.charAt(l)) == 0) {
                    map.remove(str.charAt(l));
                }
                l++;
            }
            r++;
        }
        return maxlen;
    }
    
	// public int longestkSubstr(String s, int k) {
    //     // code here
    //     int n = s.length();
    //     int r = 0;
    //     int l =0 ;
    //     int maxlen = 0 ;
    //     HashMap<Character , Integer> map = new HashMap<>();
        
    //     while(r<n){
    //         char c = s.charAt(r);
    //         map.put(c,map.getOrDefault(c,0)+1);
            
    //         while(map.size()>k){
    //            char cl = s.charAt(l);
    //                  map.put(cl,map.get(cl)-1);
    //                  if(map.get(cl) == 0){
    //                      map.remove(cl);
    //                  }
    //                  l++;
    //         }
            
            
    //         if(map.size()<=k){
    //             maxlen = Math.max(maxlen , r-l+1);
    //         }
    //         r++;
    //     }
        
    //    return maxlen; 
        
    // }
}
