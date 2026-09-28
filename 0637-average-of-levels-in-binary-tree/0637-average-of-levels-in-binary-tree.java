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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            int k = q.size();
            long s=0;
            // Double d=0;
            while(n-->0){
                TreeNode t=q.remove();
                s+=t.val;
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            ls.add((double)s/k);
        }
        return ls;
    }
}