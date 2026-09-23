class Solution {
    public int abc(int[] a, long k){
        int l=0,r=0,n=a.length;
        int m=(int)-1e9;
        long s=0;
        while(r<n){
            s+=a[r];
            while(s>k){
                s-=a[l];
                l++;
            }
            if(s==k)
                m=Math.max(m,(r-l+1));
            r++;
        }
        return m;
    }
    public int minOperations(int[] a, int x) {
        long t=0;
        for(int c:a) t+=c;
        long k=t-x;
        if(k<0) return -1;
        int ans=abc(a,k);
        return ans<0?-1:a.length-ans;
    }
}