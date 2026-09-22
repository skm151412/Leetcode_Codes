class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        int ans = 0;
        int n = ob.length;
        int m = ob[0].length;
        int y = (int) 1e9;
        int x = (int) 1e9;
        
        int a[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            if (ob[i][0] == 1) break;
            a[i][0] = 1;
        }
        
        for (int i = 0; i < m; i++) {
            if (ob[0][i] == 1) break;
            a[0][i] = 1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (ob[i][j] == 1) continue;
                a[i][j] = a[i][j - 1] + a[i - 1][j];
            }
        }
        
        return a[n - 1][m - 1];
    }
}