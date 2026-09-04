class Solution {
    public String customSortString(String o, String s) {
        ArrayList<Character> ls=new ArrayList<>();
        for(char c:s.toCharArray()){
            ls.add(c);
        }
        String ans="";
        Collections.sort(ls,(a,b)->{
            return o.indexOf(a)-o.indexOf(b);
        });
        for(char c:ls){
            ans+=c;
        }
        return ans;
    }
}