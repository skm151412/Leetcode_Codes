class Solution {
    public long subArrayRanges(int[] a) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st3=new Stack<>();
        Stack<Integer> st4=new Stack<>();
        int n=a.length;
        int pse[]=new int[n];
        int nse[]=new int[n];
        int pge[]=new int[n];
        int nge[]=new int[n];
        Arrays.fill(pse,-1);
        Arrays.fill(pge,-1);
        Arrays.fill(nse,n);
        Arrays.fill(nge,n);
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && a[i]>=a[st1.peek()]){
                nge[st1.peek()]=i;
                st1.pop();
            }
            st1.push(i);
            while(!st2.isEmpty() && a[i]<=a[st2.peek()]){
                nse[st2.peek()]=i;
                st2.pop();
            }
            st2.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st3.isEmpty() && a[i]>a[st3.peek()]){
                pge[st3.peek()]=i;
                st3.pop();
            }
            st3.push(i);
            while(!st4.isEmpty() && a[i]<a[st4.peek()]){
                pse[st4.peek()]=i;
                st4.pop();
            }
            st4.push(i);
        }
        long ls=0,rs=0;
        for(int i=0;i<n;i++){
            long l=i-pse[i];
            long r=nse[i]-i;
            long p=nge[i]-i;
            long q=i-pge[i];
            ls=ls+a[i]*l*r;
            rs=rs+a[i]*p*q;
        }
        return rs-ls;
    }
}