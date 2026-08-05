class Solution {
    public int[] nextGreaterElement(int[] nm, int[] a) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int x:a){
            map.putIfAbsent(x,i++);
        }
        int arr[]=new int[a.length];
        Arrays.fill(arr,-1);
        int ans[]=new int[nm.length];
        for(int j=0;j<a.length;j++){
            while(!st.isEmpty() && a[j]>a[st.peek()]){
                arr[st.peek()]=a[j];
                st.pop();
            }
            st.push(j);
        }
        int j=0;
        for(int x:nm){
            ans[j++]=arr[map.get(x)];
        }
        return ans;
    }
}