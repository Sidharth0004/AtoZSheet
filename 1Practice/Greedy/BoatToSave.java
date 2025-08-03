public class BoatToSave {

    public int numRescueBoats(int[] people, int limit) {
        int cnt = 0;
       
        int n = people.length;
        int l =0;
        int r = n-1;
        Arrays.sort(people);
 
    while(l<=r){
        if(people[l]+people[r] <= limit){
            l++;
            r--;
        }
        else{
            r--;
        }
        cnt++;
    }
      
        
        return cnt;
    

    }
}