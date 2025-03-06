public class PostfixtoInfix {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        int n = exp.length();
        
        for(int i =0 ; i< n ; i++){
            char ch =  exp.charAt(i);
            String s = Character.toString(ch);
            
            if(Character.isLetterOrDigit(ch)){
              st.push(s);    
            }
            else{
                String t1 = st.pop();

                String t2 = st.pop();

                String str= "("+t2+ch+t1+")";
                st.push(str);
            }
            
            
        }
        return st.peek();
        
    }
}
