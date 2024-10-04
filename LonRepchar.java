// Longest Repeating Character Replacement
import java.util.*;
public class LonRepchar {

     public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int r = 0;
        int l = 0;
         int count = 0;
          int maxlen = 0 ;

          while(r<n){
        //    char c = s.charAt(r);

           if(r+1<n && (s.charAt(r)!= s.charAt(r+1))){
            count++;
           }
           if(count>k){
                if(r+1<n && s.charAt(l)!=s.charAt(r+1)){
                    count--;
                }
                 l++;
           }

           if(count<=k){
              maxlen = Math.max(maxlen , r-l+1);
           }

        r++;

          }




return maxlen;

    }

    public static void main(String[] args) {
        
    }
}

 