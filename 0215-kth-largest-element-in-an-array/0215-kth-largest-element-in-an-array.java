class Solution {
    public int partition(int[] a,int l,int h){
        int i=l,j=h,p=a[l];
        while(i<=j){
            while(i<=h && a[i]<=p) i++;
            while(j>=l && a[j]>p) j--;
            if(i<j){
                int t=a[i];a[i]=a[j];a[j]=t;
            }
        }
        int t=a[l];a[l]=a[j];a[j]=t;
        return j;
    }
    public int quickselect(int[] a,int l,int h, int k){
        if(l==h) return a[l];
        int p=partition(a,l,h);
        if(p==k) return a[p];
        if(p>k) return quickselect(a,l,p-1,k);
        return quickselect(a,p+1,h,k);
    }
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        return quickselect(nums,0,n-1,n-k);
    }
}