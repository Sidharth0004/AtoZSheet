import java.util.Stack;

public class RevString {
    
    public static String reverseWords(String s) {
        
      String []  str = s.split(" +");

        Stack<String> st = new Stack<>();

        for (int i = 0; i < str.length-1; i++) {
           
           st.push(str[i]);
           
           st.push(" ")  ;
        }
        st.push(str[str.length-1]);

  StringBuilder result = new StringBuilder("");
  while (!st.isEmpty()) {
    String curr = st.pop();
   result.append(curr);
  }
   
   return result.toString().trim();
    }
    public static void main(String[] args) {
        String s =  "the sky is blue";
        String k =  "a good   example";
        String kq =  "  hello world  ";
        
        
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(k));
        System.out.println(reverseWords(kq));

    }
}
