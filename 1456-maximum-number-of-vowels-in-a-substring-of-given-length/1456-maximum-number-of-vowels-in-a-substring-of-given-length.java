class Solution {
    public static boolean check(char c){
            if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') return true;
            return false;
    }
    public int maxVowels(String s, int k) {
        int ct=0,n=s.length(),mx=(int)-1e9;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(check(c)) ct++;
        }
        mx=Math.max(mx,ct);
        for(int i=1;i<n-k+1;i++){
            char p=s.charAt(i-1);
            char ne=s.charAt(i+k-1);
            // if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') ct++;
            if(check(p)) ct--;
            if(check(ne)) ct++;
            mx=Math.max(mx,ct); 
            
        }
        return mx;
    }
}