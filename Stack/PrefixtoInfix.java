import java.util.Stack;

public class PrefixtoInfix {
     static String preToInfix(String pre_exp) {
        Stack<String> st = new Stack<>();
        int n = pre_exp.length();
        
        for(int i = n-1 ; i>=0 ; i--){
           char c =pre_exp.charAt(i);
           String s = Character.toString(c);
           
           if(Character.isLetterOrDigit(c)){
               st.push(s);
           }else{
               String t1 = st.pop();
               String t2 = st.pop();
               String str = "("+t1 +c+t2+")";
               st.push(str);
           }
            
         
        }
        
      return st.peek();     
        
    }
}
