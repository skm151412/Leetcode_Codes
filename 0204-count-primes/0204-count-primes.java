class Solution {
    static boolean p[];
    static{
        p=new boolean[5000001];
        int l=p.length;
        Arrays.fill(p,true);
        p[0]=p[1]=false;
        for(int i=2;i*i<l;i++){
            if(p[i]){
            for(int j=i*i;j<l;j+=i){
                    p[j]=false;
                }
            }

        }
    }
    public int countPrimes(int n) {
        int c=0;
        while(n-->1){
            if(p[n]) c++;
        }
        return c;
    }
}