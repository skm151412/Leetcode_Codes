class Solution {
    public long maximumSubarraySum(int[] a, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0, r = 0, n = a.length;
        long s = 0, mx = 0;

        while(r < n) {
            map.put(a[r], map.getOrDefault(a[r], 0) + 1);
            s += a[r];

            while(map.get(a[r]) > 1) {
                map.put(a[l], map.get(a[l]) - 1);
                if(map.get(a[l]) == 0)
                    map.remove(a[l]);

                s -= a[l];
                l++;
            }
            if(r-l+1==k){
                mx=Math.max(mx,s);
                map.put(a[l], map.get(a[l]) - 1);
                if(map.get(a[l]) == 0)
                    map.remove(a[l]);
                s -= a[l];
                l++;
            }
                // mx=Math.max(mx,s);
            r++;

        }
        return mx;
    }
}