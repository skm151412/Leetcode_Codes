class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int n=t.length;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                a[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        int j=0;
        for(int x:a){
            if(x!=0) a[j]=x-j;
            // if(t!=0) a[j]=x-a[j];
            j++;
        }
        return a;
    }
}