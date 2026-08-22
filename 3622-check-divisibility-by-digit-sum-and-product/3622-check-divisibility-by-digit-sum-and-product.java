class Solution {
    public boolean checkDivisibility(int n) {
        long s = 0, p = 1, k = n;

        while (k > 0) {
            long r = k % 10;
            s += r;
            p *= r;
            k /= 10;
        }

        return n%(s + p)== 0;
    }
}