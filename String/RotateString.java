public class RotateString {

    public static boolean rotateString(String s, String goal) {
        
        for (int i = 0; i < s.length(); i++) {
            String ans =     s.substring(i) + s.substring(0, i);
            if (ans.equals(goal)) {
                
                return true;
            }
            }
            return false;
    }
    

    public static void main(String[] args) {
        
        String s ="abcde";
        String goal = "cdeab";
 
      System.out.println(rotateString(s, goal));
        // String ans =     s.substring(2) + s.substring(0, 2);
        //  System.out.println(ans);
       
    }
}
