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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        st1.push(root);
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        if(root==null) return ans;
        while(!st1.isEmpty() || !st2.isEmpty()){
            while(!st1.isEmpty()){
                TreeNode t= st1.pop();
                a.add(t.val);
                if(t.left!=null) st2.push(t.left);
                if(t.right!=null) st2.push(t.right);

            }
            if(a.size()!=0)
                ans.add(new ArrayList<>(a));
            a.clear();
            while(!st2.isEmpty()){
                TreeNode t= st2.pop();
                a.add(t.val);
                if(t.right!=null) st1.push(t.right);
                if(t.left!=null) st1.push(t.left);

            }
            if(a.size()!=0)
                ans.add(new ArrayList<>(a));
            a.clear();
        }
        return ans;
    }
}