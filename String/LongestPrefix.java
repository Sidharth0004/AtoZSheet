import java.util.Arrays;

public class LongestPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length ==0) {
            return "-1";
        }
        Arrays.sort(strs);
       
        String first = strs[0];
        String last = strs[strs.length-1];

        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i<minLength && first.charAt(i)== last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
        

    }



    public static void main(String[] args) {
        String []  input = {"flower" ,"flow" , "flight"};
      
        System.out.println(longestCommonPrefix(input));
    }
}
