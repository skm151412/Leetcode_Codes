class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int ct=0;
        for(char c:s.toCharArray()){
            if(c=='1') ct++;
        }
        return ct;
    }
}