import java.util.Stack;

public class InfixtoPost {

      static int prec(char ch ){
        switch(ch){
         case '+':
         case '-':
             return 1;
             
    case '*':
    case '/':
      return 2;

    case '^':
      return 3;
    }
    return -1;

        
    }
    
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String result = "";
        int n = s.length();
        
        
        for(int i = 0; i<n ; i++){
           
           char ch = s.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               result += ch;
           }
            else if (ch =='('){
                st.push(ch);
                
            }
            else if( ch ==')'){
                while(!st.isEmpty() && st.peek() !='('){
                    result += st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(ch)<=prec(st.peek())){
                    result += st.pop();
                }
                st.push(ch);
            }
            
         }
        while (!st.isEmpty()) {
      if (st.peek() == '(')
        return "Invalid Expression";
      result += st.pop();
    }
     
    return result;
        
        
        
    }
}
