class Solution {
    public String[] createGrid(int m, int n) {
        char c[][]=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(c[i],'#');
        }
        for(int i=0;i<n;i++){
            c[0][i]='.';
        }
        for(int i=0;i<m;i++){
            c[i][n-1]='.';
        }
        String s[]=new String[m];
        for(int i=0;i<m;i++){
            s[i]=new String(c[i]);
        }
        return s;
    }
}