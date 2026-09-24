class Solution {
    public int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public int smallestIndex(int[] a) {
        for(int i=0;i<a.length;i++){
            int k=sum(a[i]);
            if(k==i) return i;
        }
        return -1;
    }
}