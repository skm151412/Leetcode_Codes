class Solution {
    public int minMoves(int[] a) {
        int m=(int)-1e9,ans=0;
        for(int x:a) m=Math.max(x,m);
        for(int x:a){
            ans+=(m-x);
        }
        return ans;
    }
}