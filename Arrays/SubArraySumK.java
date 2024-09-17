// Subarray Sum Equals K
public class SubArraySumK {
    
    public static int subarraySum(int[] numbers, int m) {
        int count =0;
          
              int currsum=0;
              int prefix[]=new int[numbers.length];
              prefix[0]=numbers[0];
          
              for (int i = 1; i < numbers.length; i++) {
                  prefix[i]=prefix[i-1]+numbers[i];  
                  System.out.println(prefix[i]);
              }   
              
              for (int i = 0; i < numbers.length; i++) {
                  int start=i;
                  for (int j = i; j < numbers.length; j++) {
                      int end = j;
                     if (start==0) {
                          currsum=prefix[end];
                      }
                      else{
                      currsum=prefix[end]-prefix[start-1];
                  
                  }
                    if(currsum == m){
                      count++;
                    }
              }
              }
              return count;
    
      
          }

    public static void main(String[] args) {
        
    }
}
