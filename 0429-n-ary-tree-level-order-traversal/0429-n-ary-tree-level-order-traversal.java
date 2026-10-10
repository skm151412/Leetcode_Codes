/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ls=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null) return ls;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans=new ArrayList<>();
            int n=q.size();
            while(n-->0){
                Node t=q.remove();
                ans.add(t.val);
                if(t.children!=null) q.addAll(t.children);
            }
            ls.add(ans);
        }
        return ls;
    }
}