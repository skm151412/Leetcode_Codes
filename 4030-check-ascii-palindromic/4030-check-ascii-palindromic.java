class Solution {
    public boolean isPalindromic(String s) {
        String ans="";
        for(char c:s.toCharArray()){
            // int x=(int)c;
            // String st=Integer.toBinaryString(x);
            for(int i=7;i>=0;i--){
                
                ans+=(c>>i)&1;
            }
        }
        int i=0,j=ans.length()-1;
        while(i<=j){
            char c=ans.charAt(i);
            char d=ans.charAt(j);
            if(c!=(d)) return false;
            i++;j--;
        }
        return true;
    }
}