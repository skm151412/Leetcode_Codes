class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#') 
                st.push(c);
            else if(st.size()!=0) st.pop();

        }
        for(char c:t.toCharArray()){
            if(c!='#') 
                st2.push(c);
            else if(st2.size()!=0) st2.pop();

        }
        // String ans="";
        // for(int i=0;i<st.size();i++){

        // }
        return String.valueOf(st).equals(String.valueOf(st2));

    }
}