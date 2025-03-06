package GrredyAlgo;
	
//! Valid Paranthesis Checker
public class greed5 {
    // public static boolean helper(int ind , int cnt , String s){
    //     if(cnt<0) return false;
    //     if(ind == s.length()){
    //         if(cnt== 0){
    //             return true;
    //         }
    //         return false;
    //     }
    
    //     if(s.charAt(ind)=='('){
    //   return helper(ind+1 , cnt+1 , s);
    //     }
     
    //     if(s.charAt(ind)==')'){
    //    return helper(ind+1 , cnt-1 , s);
    //     }
    
    //     return helper(ind+1 , cnt+1 , s)|| helper(ind+1 , cnt-1 , s)|| helper(ind+1 , cnt , s);
    
    
    
    //  }
    //     public boolean checkValidString(String s) {
            
    //         return helper(0,0,s);
    //     }
    public boolean checkValidString(String s) {
        int n=s.length();
      int min=0,max=0;
      for(int i=0;i<n;i++)
      {
           if(s.charAt(i)=='(')
           {
               min=min+1;
               max=max+1;

           }
           else if(s.charAt(i)==')')
           {
               min=min-1;
               max=max-1;

           }
           else
           {
               min=min-1;
               max=max+1;
           }
           if(min<0)
           {
               min=0;
           }
           if(max<0)
           {
               return false;
           }
      }
      return (min==0); 
   }
}
