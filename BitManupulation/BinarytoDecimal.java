package BitManupulation;

public class BinarytoDecimal {
    public int binaryToDecimal(String b) {
        // Code here
        int n = b.length();
        int p2 = 1;
        int num = 0 ;
        
        for(int i = n-1 ; i>= 0 ; i --){
            char ch = b.charAt(i);
            if(ch == '1'){
                num += p2;
            }
            p2 = p2*2;
            
        }
        return num;
        
    }
}
