class Solution {
    public int candy(int[] a) {
        int ans = 0;
        int n = a.length;
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) 
                c[i] = c[i - 1] + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) 
                c[i] = Math.max(c[i + 1] + 1, c[i]);
        }
        for (int x : c) 
            ans += x;   
        return ans;
    }
}