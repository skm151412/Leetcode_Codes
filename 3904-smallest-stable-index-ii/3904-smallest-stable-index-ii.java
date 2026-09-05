class Solution {
    public int firstStableIndex(int[] a, int k) {
        int n=a.length;
        int pf[]=new int[n];
        int sf[]=new int[n];
        pf[0]=a[0]; 
        for(int i=1;i<n;i++){
            pf[i]=Math.max(pf[i-1],a[i]);    
        }
        sf[n-1]=a[n-1]; 
        for(int i=n-2;i>=0;i--){
            sf[i]=Math.min(sf[i+1],a[i]);    
        } 
        // int m=(int)1e9;
        for(int i=0;i<n;i++){
            int sc=pf[i]-sf[i];
            if(sc<=k){
                return i;
            }
        }
        return -1;
    }
}