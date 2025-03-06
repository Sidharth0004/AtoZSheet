package GrredyAlgo;
//! Candy
public class greed11 {
    // public int candy(int[] ratings) {
    //     int n = ratings.length;
    //     int left [] = new int [n];
    //     int right [] = new int [n];
    
    //   left[0] = 1;
    //   right[n-1]= 1;
       
    //    for(int i = 1 ; i<n ; i++){
    //     if(ratings[i]> ratings[i-1]){
    //     left[i] = left[i-1]+1;

    //     }else{
    //         left[i] = 1;
    //     }

    //    }
       
    //    for(int i = n-2 ; i>=0 ; i--){
    //     if(ratings[i]>ratings[i+1]){
    //  right[i] = right[i+1]+1;
    //     }else{
    //         right[i] = 1;
    //     }
    //    }
    //    for(int i = 0 ; i<n ; i++){
    //     System.out.print(left[i]+" " );
    //    }
    //       System.out.println();
    //     for(int i = 0 ; i<n ; i++){
    //     System.out.print(right[i]+" " );
    //    }

    //    int sum = 0 ;
    //    for(int i = 0 ; i<n ; i++){
    //     sum = sum+ Math.max(left[i], right[i]);

    //    }
    //    return sum;

    // }
    
    public int candy(int[] ratings) {
        int sum = 1;
         int i = 1; 
         int n  = ratings.length;
         while(i<n){
          if(ratings[i] == ratings[i-1]){
             sum++;
             i++;
             continue;
          }
   
   int peak = 1;
   while(i<n && ratings[i] >ratings[i-1]){
     peak++;
     sum = sum + peak;
     i++;
   }
   int down = 1;
   while(i<n && ratings[i]<ratings[i-1]){
     sum+= down ; 
     i++;
     down++;
   }
 if(down>peak){
     sum+= down - peak;
 }
 
         } 
 
 return sum;
     }
}
