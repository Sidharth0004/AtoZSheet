import java.util.Stack;

public class RemoveAllAdjElem {
        public String removeDuplicates(String s) {

   int n = s.length();
   Stack<Character> st = new Stack<>();

   String res = "";
  
  for(int i = 0 ; i<n ; i++){
 char ch = s.charAt(i); 
 if(!st.isEmpty() && st.peek() == ch){
    st.pop();
    continue;
 }

 st.push(ch);

  }

while(!st.isEmpty()){
    res += st.pop(); 
}

String result = "";
int r = res.length();
for(int i  = r-1 ; i>=0 ;i-- ){
    char ch = res.charAt(i); 
    result += ch; 
}
  return result;      
    }
}
