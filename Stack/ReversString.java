

import java.util.*;



public class ReversString {
    

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};

          Stack<Character> st = new Stack<>();
int idx = 0;
       while(idx<s.length){
          st.push(s[idx]);
          idx++;
       }
       StringBuilder result = new StringBuilder();
       while(!st.isEmpty()){
        char curr = st.pop();
         result.append(curr);

       }

System.out.println(result.toString());
    }
}

// int i=0;
// int j=s.length-1;

// while(i<j){
   
//     char temp=s[i];
//     s[i++]=s[j];
//     s[j--]=temp;