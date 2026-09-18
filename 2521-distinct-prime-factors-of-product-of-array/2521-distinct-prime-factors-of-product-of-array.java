class Solution {
    static int lpf[];
    static{
        lpf=new int[1001];
        int n=lpf.length;
        for(int i=0;i<n;i++){
            lpf[i]=i;
        }
        for(int i=2;i*i<n;i++){
            if(lpf[i]==i){
                for(int j=i*i;j<n;j+=i){
                    if(lpf[j]==j) lpf[j]=i;
                }
            }
        }
    }
    public int distinctPrimeFactors(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:a){
            while(x>1){
                set.add(lpf[x]);
                x/=lpf[x];
            }
        }
        return set.size();
    }
}