class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> ls=new ArrayList<>();
        for(int x:nums){
            ls.add(String.valueOf(x));
        }
        Collections.sort(ls,(a,b)->{
            String as=a+b;
            String bs=b+a;
            return bs.compareTo(as);
        });
        if(ls.get(0).equals("0")) return "0";
        String ans="";
        for(String s:ls){
            ans+=s;
        }
        return ans;
    }
}