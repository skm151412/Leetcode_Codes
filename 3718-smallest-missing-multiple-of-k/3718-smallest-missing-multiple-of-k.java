class Solution {
    public int missingMultiple(int[] a, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:a) set.add(x);
        int ans=-1,f=0,i=1;
        while(f!=1){
            int r=(i++)*k;
            if(!set.contains(r)){
                ans=r;
                f=1;
            }
        }
        return ans;
    }
}