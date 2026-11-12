class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int n=a.length;
        int c=0,ans=1;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]) {
                c++;
                ans=Math.max(c+1,ans);
            }
            else c=0;
        }
        c=0;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]) {
                c++;
                ans=Math.max(c+1,ans);
            }
            else c=0;
        }
        return ans;
    }
}