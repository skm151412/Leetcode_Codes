class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long sm=0,a=0;
        String an="";
        for(char c:s.toCharArray()){
            // if(c!='0'){
            //     an+=c;
            //     sm+=(int)(c-'0');
            // }
            int d=c-'0';
            sm+=d;
            if(d>0) {

                a=a*10+d;
            }
        }
        return a*sm;
        // while(n>0){
        //     int r=n%10;
        //     if(r!=0){

        //         s=r*10+s;
        //     a+=r;
        //     }
        //     n/=10;
        // }
        // return s*10;
    }
}