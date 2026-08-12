class Solution {
    public int missingInteger(int[] nums) {
        int i=0,s=nums[0];
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1 )
                break;
            s+=nums[i];
        }
        HashSet<Integer> set =new HashSet<>();
        for(int x:nums) set.add(x);
        while(set.contains(s)) s++;
        return s;
    }
}