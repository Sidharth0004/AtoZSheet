package BitManupulation;

public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int temp = n & (n - 1);
        return temp == 0;
    }
}
