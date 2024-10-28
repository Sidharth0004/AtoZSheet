package BinarySearch;

public 
class ImplementLowerBound {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int start = 0, end = n-1;
        
        int mid = start + (end-start)/2;
        
        while(start <= end){
            
            if(arr[mid] == x) return mid;
            
            else if(arr[mid] < x) start = mid+1;
            
            else end = mid-1;
            
            mid = start + (end-start)/2;
        }
        
        return end;
    }
}
 