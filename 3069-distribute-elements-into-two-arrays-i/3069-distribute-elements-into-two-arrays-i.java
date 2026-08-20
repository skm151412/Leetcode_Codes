class Solution {
    public int[] resultArray(int[] nums) {
        int j=0,k=0,n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
        int res[]=new int[n];
        a[0]=nums[0];
        b[0]=nums[1];
        int la=a[0],lb=b[0];
        for(int i=2;i<n;i++){
            if(la>lb) {
                a[++j]=nums[i];
                la=a[j];
            }
            else{
                b[++k]=nums[i];
                lb=b[k];
            }
        }
        int l=0;
        for (int i = 0; i <= j; i++) {
            res[l++] = a[i];
        }

        for (int i = 0; i <= k; i++) {
            res[l++] = b[i];
        }

        return res;
    }
}