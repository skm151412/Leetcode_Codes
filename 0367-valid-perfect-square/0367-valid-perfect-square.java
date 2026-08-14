class Solution {
    public boolean isPerfectSquare(int n) {
        int l=1,r=n;
        while(l<=r){
            int m=l+(r-l)/2;
            int k=n/m;
            if(m==k && n%m==0) return true;
            else if(k<m) r=m-1;
            else l=m+1;
        }
        return false;
    }
}