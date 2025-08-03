package BitManupulation;

public class DecimaltoBinary {
    static String decToBinary(int n) {
        // code here
  StringBuilder s = new StringBuilder();
        
        while(n > 0){
            if(n % 2 == 1) s.append('1');
            else s.append('0');
            n = n / 2;
        }
        s.reverse();
        return s.toString();
        
    } 
}
