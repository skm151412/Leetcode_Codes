class Solution {
    public int cal(int[] a, int k) {
        int l=0,r=0,n=a.length;
        int o=0,c=0;
        while(r<n){
            if(a[r]%2!=0) o++;
            while(o>k){
                if(a[l]%2!=0) o--;
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;

    }
    public int numberOfSubarrays(int[] a, int k) {
        return cal(a,k)-cal(a,k-1);
    }
}