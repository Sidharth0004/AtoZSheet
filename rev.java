public class rev {
    

    public static void main(String[] args) {
        int nums [] = {1,2,3,1};
        int n = nums.length;
        int num1[] = new int[n-1] ;
        int num2[] = new int[n-1];

        for(int i = 0 ; i<n-1; i++){
            num1[i]= nums[i];
        }
   
    
          int k =0;
           for(int i = 1; i<n ; i++){
            num2[k]= nums[i];
            k++;
        }

        for (int i = 0; i < num1.length; i++) {
            System.out.print( num1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            System.out.print( num2[i] + " ");
        }
    }
}
