class Solution {
    public int maximumLengthSubstring(String s) {
        int mx=(int)-1e9;
        for(int i=0;i<s.length();i++){
            int fre[]=new int[26];
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                fre[c-'a']++;
                int k=0;
                for(k=0;k<26;k++){
                    if(fre[k]>2) break;
                }
                if(k==26)
                    mx=Math.max(mx,j-i+1);
            }

        }
        return mx;
    }
}