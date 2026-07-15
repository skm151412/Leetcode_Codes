class Solution {
    public static int gc(int a,int b) {
        if(b==0) return a;
        return gc(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
            // int e=0,o=0;
        // for(int i=1;i<n;i++){
        //     if(i%2==0) e+=i;
        //     else o+=i;
        // }
            return gc(n*n,n*(n+1));

    }
}