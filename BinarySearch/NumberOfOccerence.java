package BinarySearch;

public class NumberOfOccerence {
    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == k) {
                first = mid;
                
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; 
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == k) {
                last = mid;
                
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return last;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int first = firstOccurrence(arr , n , target);
        int last = lastOccurrence(arr , n ,target);
        if(first==last && first != -1){
            return 1;
        }
        if(last == -1 && first == -1) return 0;
        int ans = last - first+1;
        return ans;
        
        
    }
}
