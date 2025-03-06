public class PostfixToPrefix {

    public   static String postToPre(String post_exp) {
   
        int n = post_exp.length();
        Stack<String> st = new Stack<>();
        
        for(int i = 0 ; i<n ; i++){
            
            char ch = post_exp.charAt(i);
            String s = Character.toString(ch);
            
            if(Character.isLetterOrDigit(ch)){
                st.push(s);
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String str = ch +t2 +t1;
                st.push(str);
            }
            
        }
        
        
        
      return  st.pop();
           
         }
}
