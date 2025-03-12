public class NumofSubThree {
   
    // 1358. Number of Substrings Containing All Three Characters
    // "abcabc"

    public int numberOfSubstrings(String s) {

        int len = 0;
      int r = 0 ;
      int n = s.length();
      
       int arr []=new int[3];

      for(int i = 0 ; i<3 ; i++){
        arr[i] = -1;
      }

      while(r<n){
          char c = s.charAt(r); 
          arr[c -'a'] =r;
          if(arr[0]!= -1 && arr[1]!=-1 && arr[2] != -1){
            len =len+ 1+ Math.min(arr[0],Math.min(arr[1],arr[2]));
          }
          r++;
      }
   return len; 
    }
}
