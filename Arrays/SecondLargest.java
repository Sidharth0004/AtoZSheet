public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int l1 = arr[0];
        int l2 = -1;
        
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] >  l1){
               l2 = l1;
               l1 = arr[i];
            }
            
            	else if (arr[i] > l2 && arr[i] != l1)
		{
			l2 = arr[i];
		}
            
        }
        return l2;
        
    }
}
