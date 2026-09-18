class Solution {
    static boolean p[];
    static{
        int n=48;
        p=new boolean[n];
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<n;i++){
            if(p[i]){
                for(int j=i*i;j<n;j+=i){
                    p[j]=false;
                }
            }
        }
    }
    public int countPrimeSetBits(int x, int r) {
        int ans=0;
        while(x<=r){
            int c=0;
            int l=x;
            while(l>0){
                if((l&1L)>0) c++;
                l=l>>1;
            }
            if(p[c]) ans++;
            x++;
        }
        return ans;
    }
}