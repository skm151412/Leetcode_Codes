class Solution {
    public boolean isRectangleOverlap(int[] rec, int[] rec2) {
        if((rec2[2]<=rec[0]) || (rec[2]<=rec2[0]) || (rec2[3]<=rec[1]) || (rec[3]<=rec2[1]))
            return false;
        return true;
    }
}