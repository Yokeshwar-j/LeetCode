class Solution {
    public int maxProduct(int[] nums) {
        int maxp = nums[0],cmin = nums[0],cmax = nums[0];
        for(int i=1;i<nums.length;i++){
            int pp = Math.max(nums[i],Math.max(nums[i]*cmin,nums[i]*cmax));
            cmin = Math.min(nums[i],Math.min(nums[i]*cmin,nums[i]*cmax));
            cmax = pp;
            maxp = Math.max(maxp,cmax);
            //System.out.println("i->"+i+"\ncmin->"+cmin+"\ncmax->"+cmax);
            //System.out.println();
        }
        return maxp;
           
    }
}