class Solution {
    public int pivotIndex(int[] a) {
        int s=0;
        for(int x:a) s+=x;
        int ls=0;
        for(int i=0;i<a.length;i++){
            if(ls==s-ls-a[i]) return i;
            ls+=a[i];
        }
        return -1;
    }
}