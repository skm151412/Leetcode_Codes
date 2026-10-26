class Solution {
    public int threeSumClosest(int[] a, int t) {
        int n=a.length;
        Arrays.sort(a);
        long ans=a[0]+a[1]+a[2];
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                long s=a[i]+a[j]+a[k];
                if(Math.abs(s-t)<Math.abs(ans-t)) ans=s;
                if(s>t) k--;
                else j++;
            }
        }
        return (int)ans;
    }
}