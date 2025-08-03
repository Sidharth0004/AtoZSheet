import java.util.ArrayList;

public class factOfLargeNum {
       static int size = 1;  // GLOBAL size

    public static void multiply(int[] nums, int multiplier) {
        int carry = 0;

        for (int i = 0; i < size; i++) {
            int res = nums[i] * multiplier + carry;
            nums[i] = res % 10;
            carry = res / 10;
        }

        while (carry > 0) {
            nums[size] = carry % 10;
            carry /= 10;
            size++;
        }
    }

    public static ArrayList<Integer> factorial(int n) {
        int[] nums = new int[10000];
        nums[0] = 1;
        size = 1; // initialize global size

        for (int multiplier = 2; multiplier <= n; multiplier++) {
            multiply(nums, multiplier); // size is handled globally
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            result.add(nums[i]);
        }

        return result;
    }
}


                                     //! OR
                                     import java.util.ArrayList;

// public class FactorialCalculator {

//     public static int multiply(int[] nums, int multiplier, int size) {
//         int carry = 0;

//         for (int i = 0; i < size; i++) {
//             int res = nums[i] * multiplier + carry;
//             nums[i] = res % 10;
//             carry = res / 10;
//         }

//         while (carry > 0) {
//             nums[size] = carry % 10;
//             carry /= 10;
//             size++;
//         }

//         return size; // return updated size
//     }

//     public static ArrayList<Integer> factorial(int n) {
//         int[] nums = new int[10000];
//         nums[0] = 1;
//         int size = 1;

//         for (int multiplier = 2; multiplier <= n; multiplier++) {
//             size = multiply(nums, multiplier, size); // update size after each multiply
//         }

//         ArrayList<Integer> result = new ArrayList<>();
//         for (int i = size - 1; i >= 0; i--) {
//             result.add(nums[i]);
//         }

//         return result;
//     }

//     // Optional: for testing
//     public static void main(String[] args) {
//         int n = 100;
//         ArrayList<Integer> result = factorial(n);
//         for (int digit : result) {
//             System.out.print(digit);
//         }
//         System.out.println(); // newline
//     }
// }
