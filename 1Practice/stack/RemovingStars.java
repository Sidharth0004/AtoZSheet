import java.util.Stack;

public class RemovingStars {
    public String removeStars(String s) {
       Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i<n ; i++){
            char ch = s.charAt(i);
           if(Character.isLetter(ch)){
            st.push(ch);
           }
           else{
            st.pop();
           }

        }
        
        String res = "";
        while(!st.isEmpty()){
            res += st.pop();
        }
        String result = "";

        for(int i = res.length()-1 ; i>=0 ; i--){
            result += res.charAt(i);
        }
        return result;
        
    }
}
