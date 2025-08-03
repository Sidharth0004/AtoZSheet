public class BreakPalindrome {
    public String breakPalindrome(String pal) {
        int n = pal.length();
         StringBuilder sb = new StringBuilder(pal);
         if(n==1){
             return "";
         }
         
         for(int i = 0; i < n / 2; i++) {
             char ch = sb.charAt(i);
             if(ch != 'a') {
                 sb.setCharAt(i, 'a');
                 return sb.toString();
             }
         }
         sb.setCharAt(n - 1, 'b');
         return sb.toString();
     }
}
