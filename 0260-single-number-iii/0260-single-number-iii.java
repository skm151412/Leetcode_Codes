class Solution {
    public int[] singleNumber(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:a)
            map.put(x,map.getOrDefault(x,0)+1);
        int ans[]=new int[2];
        int i=0;
        for(int x:map.keySet()){
            if(map.get(x)==1 || map.get(x)%2!=0)
                ans[i++]=x;
        }
        return ans;
    }
}