import java.util.*;
public class anagrams {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
         t = t.toLowerCase();

         if(s.length()==t.length()){
            char Array1[] = s.toCharArray();
            char Array2[] = t.toCharArray();

            Arrays.sort(Array1);
            Arrays.sort(Array2);
             boolean result = Arrays.equals(Array1, Array2 );

             if(result){
                return true;
             }
             else{
                return false;
             }
         }
    return false;     
}
public static void main(String[] args) {
    
}
}
