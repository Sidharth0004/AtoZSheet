import java.util.*;
public class isomorhic {
    static boolean areIsomorphic(String str1, String str2)
    {

        HashMap<Character, Character> charCount
            = new HashMap();
        char c = 'a';
        for (int i = 0; i < str1.length(); i++) {
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;
            }
            else if (!charCount.containsValue(
                         str2.charAt(i))) {
                charCount.put(str1.charAt(i),
                              str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "add";
        String t = "dda";




        System.out.println(areIsomorphic(s,t));
        // HashMap<Character , Character> map = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
            
        //     if (map.containsKey(s.charAt(i))) {
        //        if (map.get(s.charAt(i)) != t.charAt(i)) {
        //         System.out.println("no");
        //         break;
        //        }
        //     }
        //     map.put(s.charAt(i), t.charAt(i));

        // }
      
    }
}
