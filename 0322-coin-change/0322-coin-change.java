class Solution {
    public int coinChange(int[] c, int t) {
        int n=c.length+1;
        int m=t+1;
        int inf=(int)1e9;
        int dp[][]=new int[n][m];
        for(int i=0;i<m;i++)
            dp[0][i]=inf;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j];
                if(c[i-1]<=j){
                    int inc=1+dp[i][j-c[i-1]];
                    dp[i][j]=Math.min(inc,dp[i][j]);
                }
            }

        }
        return dp[n-1][m-1]==inf?-1:dp[n-1][m-1];
    }
}