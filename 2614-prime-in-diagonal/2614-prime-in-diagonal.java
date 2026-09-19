class Solution {
    static boolean p[];
    static {
        int n = 4000001;
        p = new boolean[n];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (p[i]) {
                for (int j = i * i; j < n; j += i) {
                    p[j] = false;
                }
            }
        }
    }

    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int ans = (int)-1e9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || i + j == m - 1) {
                    if (p[nums[i][j]]) {
                        ans = Math.max(ans, nums[i][j]);
                    }
                }
            }
        }

        return ans == (int)-1e9 ? 0 : ans;
    }
}