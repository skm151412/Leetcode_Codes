class Solution {
    public int cal(int[] a, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,r=0,n=a.length,c=0;
        while(r<n){
            map.put(a[r],map.getOrDefault(a[r],0)+1 );
            while(map.size()>k){
                map.put(a[l],map.getOrDefault(a[l],0)-1 );
                if(map.get(a[l])==0) map.remove(a[l]);
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;

    }
    public int countCompleteSubarrays(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        int k=set.size();
        return cal(a,k)-cal(a,k-1);
    }
}