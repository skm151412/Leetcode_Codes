class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        int c=0,s=0,n=a.length;
        for(int i=0;i<k;i++){
            s+=a[i];
        }
        if(s/k>=t) c++;

        for(int i=1;i<n-k+1;i++){
            s-=a[i-1];
            s+=a[i+k-1];
            if(s/k>=t) c++;
            
        }
        return c;
    }
}