class Solution {
    public int hammingWeight(int n) {
        // String s=Integer.toBinaryString(n);
        int ct=0;
        for(int i=0;i<32;i++){
            if((n & (1<<i))!=0) ct++;
        }
        return ct;
    }
}