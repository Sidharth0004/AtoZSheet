import java.util.*;

public class prevSmal {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 10, 8 };
        Stack<Integer> s = new Stack<>();
        int[] prevSmaller = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                prevSmaller[i] = -1;
            } else {
                prevSmaller[i] = arr[s.peek()];

            }

            s.push(i);

        }

        for (int i = 0; i < prevSmaller.length; i++) {
            System.out.print(prevSmaller[i] + " ");
        }

    }
}
