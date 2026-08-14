class Solution {
    public int mySqrt(int x) {
        int l=1,r=x;
        if(x<=1) return x;
        while(l<=r){
            int m=l+(r-l)/2;
            int k=x/m;
            if(k==m && x%m==0) return m;
            else if(k<m) r=m-1;
            else l=m+1;
        }
        return r;
    }
}