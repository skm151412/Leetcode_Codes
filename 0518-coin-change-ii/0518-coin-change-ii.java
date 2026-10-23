class Solution {
    public int change(int x, int[] c) {
        int ans=0;
        int n=c.length+1;
        int m=x+1;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++) dp[i][0]=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j]+(c[i-1]<=j?dp[i][j-c[i-1]]:0);
            }

        }
        return dp[n-1][m-1];
    }
}