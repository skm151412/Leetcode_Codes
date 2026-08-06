class Solution {
    public int smallestNumber(int n, int t) {
        int ans=-1,f=0;
        for(int i=n;f==0;i++){
            int p=1;    
            int k=i;
            while(k>0){
                int r=k%10;
                p=p*r;
                k/=10;
            }
            if(p%t==0) {
                f=1;
                ans=i;
                break;
            }

        }
        return ans;

    }
}