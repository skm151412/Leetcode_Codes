class Solution {
    public int triangleNumber(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int ans=0;
        for(int i=n-1;i>=2;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                if(a[j]+a[k]>a[i]){
                    ans+=(k-j);k--;
                }
                else j++;
            }
        }
        return ans;
    }
}