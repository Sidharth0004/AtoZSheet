import java.util.ArrayList;
import java.util.List;


// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]


public class GenerateParen {

      
public static boolean isValid(String curr){
  int count =0;

  for(int i = 0 ; i<curr.length() ; i++ ){
    char ch = curr.charAt(i);
    if (ch == '(')
    count++;
else
    count--;
if (count < 0)
    return false;
}

return count ==0;
}  



  public static void helper( ArrayList<String> ans , StringBuilder curr , int n ){
    if(curr.length() == 2*n){
     if(isValid(curr.toString())){
        ans.add(curr.toString());
     }
     return;
    }

     curr.append("(");
    helper(ans , curr , n);
    curr.deleteCharAt(curr.length()-1);

     curr.append("(");
    helper(ans , curr , n);
  curr.deleteCharAt(curr.length()-1);

  }


    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
   
        helper(ans ,  new StringBuilder() , n);
        return ans;
    }
}





// public static void helper( ArrayList<String> ans , StringBuilder curr ,
// int n ,int open , int close){
//  if(curr.length() == 2*n){

//      ans.add(curr.toString());
  
//   return;
//  }


// if(open<n){
//   curr.append("(");
//  helper(ans , curr , n,open+1  ,close);
//  curr.deleteCharAt(curr.length()-1);
// }

// if(close<open){

//   curr.append(")");
//  helper(ans , curr , n,open , close+1);
// curr.deleteCharAt(curr.length()-1 );
// }


// }


//  public List<String> generateParenthesis(int n) {
//      ArrayList<String> ans = new ArrayList<>();

//      helper(ans ,  new StringBuilder() , n,0,0);
//      return ans;
//  }