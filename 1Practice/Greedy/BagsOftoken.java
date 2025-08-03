import java.util.Arrays;

public class BagsOftoken {
    
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int l =0 ;
        int r = n-1;
        int gain = 0 ;

        while(l <= r){
            if(tokens[l] <= power){
                power -= tokens[l];
                gain++;
                l++;
            } else if(gain > 0 && l != r) {
                power += tokens[r];
                gain--;
                r--;
            } else {
                break;
            }
        }
        return gain;
    }

}
