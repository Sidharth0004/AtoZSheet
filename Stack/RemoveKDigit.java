public class RemoveKDigit {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();

     for(int i = 0 ; i<n ; i++){
      
       while(!st.isEmpty() && (num.charAt(i)-'0')<(st.peek()-'0') && k>0){
             st.pop();
             k-=1;
       }

        st.push(num.charAt(i));
     }
   
       while(k>0){
            st.pop();
            k-=1;
        }
          if(st.isEmpty()){
            return "0";
        }

        String result ="";
        while(!st.isEmpty()){
            result += st.pop();
        }
        String res ="";
         int index;
        for(index=result.length()-1;index>0;index--){
            if(result.charAt(index)!='0'){
                break;
            }
        }
        for(int i=index;i>=0;i--){
            res+=result.charAt(i);
        }
        return res;

    } 
}
