// Rearrange Array Elements by Sign
import java.util.*;
public class RearrangeArr {
    

    public static void main(String[] args) {
        int nums [] = {3,1,-2,-5,2,-4};

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >0) {
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        int m=0;
        int n=0;

     for (int i = 0; i < nums.length; i++) {
        if (i%2==0) {
            nums[i] = list1.get(m);
            m++;
        }
        else{
            nums[i] = list2.get(n); 
            n++;
        }
     }
     for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + ",");
     }

    }
}
