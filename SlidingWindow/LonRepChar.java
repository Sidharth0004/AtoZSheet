//! 424. Longest Repeating Character Replacement
 
// Example 1:

// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
// Example 2:

// Input: s = "AABABBA", k = 1
// Output: 4
// Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
// The substring "BBBB" has the longest repeating letters, which is 4.
// There may exists other ways to achieve this answer too.

public class LonRepChar {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0 ;
        int maxlen = 0 ;
       int maxf = 0 ;
       int hash[] = new int[26];
        int n = s.length();
      //  for(int i = 0; i<hash.length ; i++){
      //     hash[i]= 0;
      //  }
      
  while(r<n){
      char ch  = s.charAt(r);
      hash[ch-'A']++;
       maxf = Math.max(maxf,hash[ch-'A']);
  
  
       if((r-l+1)-maxf >k){
         hash[s.charAt(l)-'A']--;
         l++; 
       }
  
       maxlen = Math.max(r-l+1 , maxlen);
       r++;
  
  }
  return maxlen;
  
  
      }
}
