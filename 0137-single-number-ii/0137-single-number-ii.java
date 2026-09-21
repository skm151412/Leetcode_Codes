class Solution {
    public int singleNumber(int[] a) {
        int ans=0;
        for (int i = 0; i < 64; i++) {
            int c = 0;
            for (int x : a) {
                if ((x & (1 << i)) != 0) c++;
            }
            if (c % 3 != 0) ans = (ans | (1 << i));
        }
        return ans;
    }
}