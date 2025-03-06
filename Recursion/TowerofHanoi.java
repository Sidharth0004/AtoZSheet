public class TowerofHanoi {
    
    public int towerOfHanoi(int n, int from, int to, int aux) {
        int[] cnt = new int[1];
        helper(n, from, to, aux, cnt);
        return cnt[0];
    }
    public void helper(int n, int from, int to, int aux, int[] cnt) {
        if (n == 0) {
            return;
        }
        helper(n - 1, from, aux, to, cnt);
        cnt[0]++;
        helper(n - 1, aux, to, from, cnt);
    }
}

// public int towerOfHanoi(int n, int from, int to, int aux) {
//     int cnt = 0;
//     cnt = helper(n, from, to, aux, cnt);
//     return cnt;
// }

// public int helper(int n, int from, int to, int aux, int cnt) {
//     if (n == 0) {
//         return cnt;
//     }
//     cnt = helper(n - 1, from, aux, to, cnt);
//     cnt++;
//     cnt = helper(n - 1, aux, to, from, cnt);
//     return cnt;
// }
