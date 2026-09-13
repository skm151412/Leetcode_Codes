class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        int n=s.length();
        if(k > n)
            return new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<k;i++){
            char c=p.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int f=0;
        for (char c : map.keySet()) {
            if (!map.get(c).equals(map1.get(c))) {
                f = 1;
                break;
            }
        }
        ArrayList<Integer> ls=new ArrayList<>();
        if(f==0) ls.add(0);
        for(int i=1;i<n-k+1;i++){
            f=0;
            char c=s.charAt(i-1);
            char d=s.charAt(i+k-1);
            map1.put(d,map1.getOrDefault(d,0)+1);
            map1.put(c,map1.getOrDefault(c,0)-1);
            if(map1.get(c)==0) map1.remove(c);
            for (char e : map.keySet()) {
                if (!(map1.containsKey(e)) || !(map.get(e).equals(map1.get(e)))) {
                    f = 1;
                    break;
                }
            }
        if(f==0) ls.add(i);
        }
        return ls;
    }
}