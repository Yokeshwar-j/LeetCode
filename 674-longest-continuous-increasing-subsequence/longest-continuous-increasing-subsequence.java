class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int i=0,j=0,last=Integer.MIN_VALUE,max=0;
        while(j<nums.length){
            if(nums[j]>last){max=Math.max(max,j-i+1);last=nums[j];}
            else{i=j;last=nums[i];}
            j++;
        }
        return max;
    }
}