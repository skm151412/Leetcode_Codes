class Solution {
    static int n=200;
    static long f[]=new long[n];
    static long inf[]=new long[n];
    static long m=2147483647L;
    static{
        f[0]=1;
        for(int i=1;i<n;i++)
            f[i]=((long)f[i-1]*i%m);
        inf[n-1]=pow(f[n-1],m-2)%m;
        for(int i=n-2;i>=0;i--){
            inf[i]=((long)inf[i+1]*(i+1)%m);
        }

    }
    public static long pow(long a, long b){
        long ans=1;
        while(b>0){
            if((b&1)==1)
                ans=ans*a%m;
            a=((long)a*a%m);
            b>>=1;
        }
        return ans;
    }
    public int uniquePaths(int a, int b) {
        int n=a+b-2;
        int r=Math.min(a-1,b-1);
        long ans=f[n]%m;
        ans=ans*inf[r]%m;
        ans=ans*inf[n-r]%m;
        return (int)ans;
    }
}