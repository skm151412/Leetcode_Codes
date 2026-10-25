class Solution {
    public int maxArea(int[] a) {    
        int i=0,j=a.length-1;
        int mx=0;
        while(j>=0){
            int h = Math.min(a[i],a[j]);
            int l = j-i;
            int ar =l*h;
            if(a[i]<a[j]) i++;
            else j--;
            if(mx<ar) mx = ar;
            
        }
        
        return mx;
    }
}