class Solution {
    public String reverseWords(String s) {
        String w[]=s.trim().split("\\s+");
        int n=w.length,i=0;
        int j=n-1;

        while(i<j){
            String t=w[i];
            w[i]=w[j];
            w[j]=t;
            i++;
            j--;
        }

        String ans="";
        for(String k:w){
            ans+=k;
            ans+=" ";
        }

        return ans.substring(0,ans.length()-1);
    }
}