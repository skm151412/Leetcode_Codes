/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        int ans = 0;
    public int rangeSumBST(TreeNode root, int p, int q) {
        if (root == null) return ans;
        // System.out.println(ans);
        if (root.val >= p && root.val <= q) ans += root.val;
        rangeSumBST(root.left, p, q);
        rangeSumBST(root.right, p, q);
        return ans;
    }    
}