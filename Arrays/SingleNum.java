import java.util.*;
public class SingleNum {
  public static int singleNumber(int[] a) {
    int n = a.length;
    Arrays.sort(a);
    for(int i = 0; i < n-1 ; i+=2)
    {
        if(a[i] != a[i + 1])
            return a[i];
    }
    return a[n - 1];
}
  public static void main(String[] args) {
    int [] nums ={1,2,1};
    System.out.println(singleNumber(nums));
  }
}