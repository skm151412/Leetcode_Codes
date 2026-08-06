class Solution {
    public int[] canSeePersonsCount(int[] h) {
        Stack<Integer> st=new Stack<>();
        int n=h.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int c=0;
            while(!st.isEmpty() && h[i]>h[st.peek()]){
                st.pop();
                c++;
            }
            if(!st.isEmpty()) c++;
            ans[i]=c;
            st.push(i);
            
        }
        return ans;
    }
}