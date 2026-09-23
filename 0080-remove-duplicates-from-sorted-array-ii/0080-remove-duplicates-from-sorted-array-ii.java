class Solution {
    public int removeDuplicates(int[] a) {
            int i = 2, n = a.length;

    for (int j = 2; j < n; j++) {
        if (a[j] != a[i - 2]) {
            a[i] = a[j];
            i++;
        }
    }

    return i;

    }
}