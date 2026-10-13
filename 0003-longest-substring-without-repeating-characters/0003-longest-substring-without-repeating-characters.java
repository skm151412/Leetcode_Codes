class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,r=0, ans = 0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n) {
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while (map.get(c) > 1) {
                char d = s.charAt(l);
                map.put(d,map.getOrDefault(d,0)-1);
                if(map.get(d)==0) map.remove(d);

                l++;
            }


            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
