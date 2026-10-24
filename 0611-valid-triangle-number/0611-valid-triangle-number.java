class Solution {
    public int triangleNumber(int[] a) {
        Arrays.sort(a);
        int n=a.length;long ans=0;
        int m=(int)1e9+7;
        for(int k=n-1;k>=2;k--){
            int i=0;
            int j=k-1;
            while(i<j){
                if((long)a[i]+a[j]>a[k]){
                    ans=(ans+j-i)%m;
                    j--;
                }
                else i++;
            } 
        }
        return (int)(ans%m);
    }
}