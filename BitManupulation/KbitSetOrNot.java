package BitManupulation;

public class KbitSetOrNot {
    static boolean checkKthBit(int n, int k) {
        // Your code here
  
   if ((n & (1 << k)) != 0) {
       return true;
   }
  else{
      return false;
  }
    }


}
