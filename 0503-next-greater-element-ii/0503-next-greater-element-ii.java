class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n = arr.length;
        int a[]=new int[n];
        Arrays.fill(a,-1);
        for(int i=0;i<2*n;i++){
            int j = i%n;
            while(!st.isEmpty() && arr[j]>arr[st.peek()]){
                a[st.peek()]=arr[j];
                st.pop();
            }
            if(i<n)
                st.push(j);
        }
        return a;
    }
}