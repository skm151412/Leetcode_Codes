class Solution {
    public int sumSubarrayMins(int[] a) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st1=new Stack<>();
        int pse[]=new int[a.length];
        int nse[]=new int[a.length];
        Arrays.fill(pse,-1);
        Arrays.fill(nse,a.length);
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[i]<=a[st.peek()]){
                nse[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        for(int i=a.length-1;i>=0;i--){
            while(!st1.isEmpty() && a[i]<a[st1.peek()]){
                pse[st1.peek()]=i;
                st1.pop();
            }
            st1.push(i);
        }
        long ans=0;
        int mod=1000000007;
        for(int i=0;i<a.length;i++){
            int l=i-pse[i];
            int r=nse[i]-i;
            ans=(ans+(long)a[i]*l*r)%mod;
        }
        return (int)ans;
    }
}