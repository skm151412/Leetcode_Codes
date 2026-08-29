class Solution {
    public int[] deckRevealedIncreasing(int[] d) {
        Deque<Integer> dq= new ArrayDeque<>();
        // while(n-->0){
        //     dq.add(i++);
        // }
        Arrays.sort(d);
        for(int i=d.length-1;i>=0;i--){
            // ans[i++]=dq.removeLast();
            if(dq.size()>0) dq.addFirst(dq.removeLast());
            dq.addFirst(d[i]);
        }
        int i=0;
        int ans[]=new int[d.length];
        for(int x:dq) ans[i++]=x;
        return ans;
    }
}