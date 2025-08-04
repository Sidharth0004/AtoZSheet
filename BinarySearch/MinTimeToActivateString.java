public class MinTimeToActivateString {
   
    
    public int minTime(String s, int[] order, int k) {
        int n = order.length;

        long max = ((long) n * (n + 1)) / 2;

        if (max < (long) k) return -1;

        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            char[] ch = s.toCharArray();
            for (int i = 0; i <= mid; i++) {
                ch[order[i]] = '*';
            }

            long cnt = 0;
            int prev = -1;
            for (int i = 0; i < n; i++) {
                if (ch[i] == '*') {
                    int left = i - prev;
                    int right = n - i;

                    prev = i;

                    cnt += (long) left * right;
                }
            }

            if (cnt >= (long) k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}












