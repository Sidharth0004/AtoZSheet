import java.util.Arrays;

public class sortCharbyFreq {
    
    public static void main(String[] args) {
        String s = "abee";
        char [] strArray = s.toCharArray();
        String newstr = "";

        System.out.println(strArray);
        Arrays.sort(strArray);
        System.out.println(strArray);

         for (int i = 0; i < strArray.length; i++) {
             
            while (strArray[i] != strArray[i+1]) {
                
            }

        }
    }
}
