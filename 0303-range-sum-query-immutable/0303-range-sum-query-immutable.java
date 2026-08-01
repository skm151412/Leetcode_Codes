class NumArray {

    int[] s;

    public NumArray(int[] nums) {
        int n = nums.length;
        s = new int[n];

        if (n > 0) {
            s[0] = nums[0];
            for (int i = 1; i < n; i++) {
                s[i] = s[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int left, int right) {
        int ans;

        if (left != 0)
            ans = s[right] - s[left - 1];
        else
            ans = s[right];

        return ans;
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */