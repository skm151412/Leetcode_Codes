class Solution {
    public int[] twoSum(int[] a, int t) {
        int l=0,n=a.length;
        int r=n-1;
        while(l<r){
            int s=a[l]+a[r];
            if(l!=r && t==s) return new int[]{l+1,r+1};
            if(s>t || l==r) r--;
            else l++;
        }
        return new int[]{};
    }
}