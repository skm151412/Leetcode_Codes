class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int[] a = new int[n1.length+n2.length];
        int i=0;
        for(int x:n1) a[i++]=x;
        for(int x:n2) a[i++]=x;
        Arrays.sort(a);
        return a.length%2==0?((double)a[a.length/2]+a[a.length/2-1])/2:a[a.length/2];
    }
}