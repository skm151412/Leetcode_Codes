class Solution {
    public List<Integer> findMissingElements(int[] a) {
        int i=-1;
        int j=101;
        HashSet<Integer> st=new HashSet<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:a){
            j=Math.min(x,j);
            i=Math.max(x,i);
            st.add(x);
        }
        for(int k=j;k<=i;k++){
            if(!st.contains(k)) l.add(k);
        }
        return l;
    }
}