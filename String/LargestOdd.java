//! Largest odd Number in String

// class Solution {
//     public String largestOddNumber(String num) {
        
//         for (int i = num.length() - 1; i >= 0; i--) 
//     {
 
//       if (num.charAt(i) % 2 != 0) 
//       {
 
    
//         String s1 = num.substring(0, i + 1);
//         return s1;
//       }
//     }

//      return "";
//     }
// }





import java.util.*;
public class LargestOdd {
  
    public static String largestOddNumber(String num) {
         
        if (num.charAt(num.length()-1) %2 != 0) {
            return num;
          }   
      
     

          else{
            ArrayList<Integer> list = new ArrayList<>();
           for (int i = 0; i < num.length(); i++) {
               String ch = num.substring(i, i+1);
               int c = Integer.parseInt(ch);
             
               list.add(c); 
               }
        // System.out.println(list);
        int index = 0;
              for (int i = list.size()-1; i>=0; i--) {
               if (list.get(i)%2 != 0) {
                  index = i;
                   return num.substring(0, index+1);
                  
               }
              }

           

          }
       
       return "";
       
        }  
    
    public static void main(String[] args) {
       
        String num = "7542351161";
      
        System.out.println(largestOddNumber(num));





        
    } 
}
    


  