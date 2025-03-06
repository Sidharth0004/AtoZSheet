import java.util.Stack;

public class PrefixtoPostfix {
        static String preToPost(String pre_exp) {
        int n = pre_exp.length();
        Stack<String> st = new Stack<>();
        
        for(int i = n-1 ; i>=0 ; i--){
            char ch = pre_exp.charAt(i);
            String s = Character.toString(ch);
            
            if(Character.isLetterOrDigit(ch)){
                st.push(s);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String str = t1+t2+ch;
                st.push(str);
            }
            
        }
      return st.pop();  
    }
}
