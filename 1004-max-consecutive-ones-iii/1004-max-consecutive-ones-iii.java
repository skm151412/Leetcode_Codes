class Solution {
    public int longestOnes(int[] a, int k) {
        int l=0,r=0,n=a.length;
        int c=0,m=-1;
        while(r<n){
            if(a[r]==0) c++;
            while(c>k){
                if(a[l]==0) c--;
                l++;
            }
            m=Math.max(m,(r-l+1));
            r++;
        }
        return m;
    }
}