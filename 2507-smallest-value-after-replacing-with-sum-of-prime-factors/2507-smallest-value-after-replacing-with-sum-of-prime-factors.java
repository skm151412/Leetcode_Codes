class Solution {
    static int p[];
    static{
        // p[0]=0;p[1]=1;
        p=new int[100001];
        for(int i=0;i<100001;i++) p[i]=i;
        for(int i=2;i*i<100001;i++){
            if(p[i]==i){
                for(int j=i*i;j<100001;j+=i){
                    if(p[j]==j) p[j]=i;    
                }
            }

        }
    }
    public int smallestValue(int n) {
       while (true) {
            int s = 0;
            int temp = n;

            while (temp > 1) {
                s += p[temp];
                temp /= p[temp];
            }

            if (s == n) {
                return n;
            }

            n = s;
       }
    }
}