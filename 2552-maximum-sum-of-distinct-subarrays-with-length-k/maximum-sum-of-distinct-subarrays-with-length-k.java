class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int i=0,j=0;
        long sum=0,max=0;
        while(j<nums.length){
            if(hs.contains(nums[j]) || hs.size()==k){
                sum-=nums[i];
                hs.remove(nums[i++]);continue;
            }
            sum+=nums[j];
            hs.add(nums[j]);
            if((j-i+1)==k){max = Math.max(max,sum);}
            j++;
        }
        return max;
    }
}