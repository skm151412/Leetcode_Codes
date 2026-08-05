class Solution {
    public int[] finalPrices(int[] p) {
        Stack<Integer> st = new Stack<>();
        int a[]=new int[p.length];
        int ans[]=new int[p.length];
        for(int i=0;i<p.length;i++){
            while(!st.isEmpty() && p[i]<=p[st.peek()]){
                a[st.peek()]=p[i];
                st.pop();
            }
            st.push(i);
        }
        int i=0;
        for(int x:a){
            ans[i]=p[i]-x;
            i++;
        }
        return ans;
    }
}