class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int mx=(int)-1e9,ans=0;
        while(r<n){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            mx=Math.max(mx,map.get(c));
            while((r-l+1)-mx>k){
                char d=s.charAt(l);
                map.put(d,map.get(d)-1);
                if(map.get(d)==0) map.remove(d);
                l++;
            }
            ans=Math.max(r-l+1,mx);
            r++;
        }
        return ans;
    }
}