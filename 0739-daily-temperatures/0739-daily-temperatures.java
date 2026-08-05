class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int arr[]=new int[t.length];
        Arrays.fill(arr,-1);
        int ans[]=new int[t.length];
        for(int j=0;j<t.length;j++){
            while(!st.isEmpty() && t[j]>t[st.peek()]){
                arr[st.peek()]=j;
                st.pop();
            }
            st.push(j);
        }
        int i=0;
        for(int x:arr){
            if(x!=-1)
                ans[i]=x-i;
            else
                ans[i]=0;
            i++;
        }
        return ans;
    }
}