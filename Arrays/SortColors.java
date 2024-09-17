public class SortColors {
    public void sortColors(int[] a) {
        int c0 = 0, c1 = 0, c2 = 0;
        int n = a.length;

      
       for (int i = 0; i < n; i++) {
           if (a[i] == 0) {
               c0 += 1;
           }
           else if (a[i] == 1) {
               c1 += 1;
           }
           else {
               c2 += 1;
           }
       }

       int idx = 0;
      
       for (int i = 0; i < c0; i++)
           a[idx++] = 0;

       for (int i = 0; i < c1; i++)
           a[idx++] = 1;

      
       for (int i = 0; i < c2; i++)
           a[idx++] = 2;
   }

   public static void main(String[] args) {
    int nums []= {0,2,2,0,1};
    
   }
}
