class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        // int mx=(int)-1e9;
        int n=a.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && a[i]>=a[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[0]=a[dq.peekFirst()];
        for(int i=1;i<n-k+1;i++){
            int p=i-1;
            int ne=i+k-1;
            if(!dq.isEmpty() && p==dq.peekFirst())
                dq.removeFirst();
            while(!dq.isEmpty() && a[ne]>=a[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(ne);
            ans[i]=a[dq.peekFirst()];
        }
        return ans;
    }
}