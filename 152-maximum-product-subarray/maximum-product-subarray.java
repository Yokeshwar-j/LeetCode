class Solution {
    public int maxProduct(int[] nums) {
        int maxp = Integer.MIN_VALUE;
        for(int p=0;p<nums.length;p++){
            int t = nums[p];
            maxp = Math.max(maxp,t);
            for(int j=p+1;j<nums.length;j++){
                t *= nums[j];
                maxp = Math.max(maxp,t);
            }
        }
        return maxp;
    }
}