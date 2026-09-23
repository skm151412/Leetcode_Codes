class Solution {
    public void merge(int[] a, int x, int[] b, int y) {
        int l=x-1;
        int r=y-1;
        int n=x+y-1;
        while(l>=0 && r>=0){
            if(a[l]>=b[r]){
                a[n--]=a[l--];
            }
            else
                a[n--]=b[r--];

        }
        while(r>=0)
                a[n--]=b[r--];
    }
}