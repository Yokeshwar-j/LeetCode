class Solution {
    public int jump(int[] nums) {
        //level wise jump until we reaach the last index
        int l=0,r=nums[0],c=1;
        if(nums.length<=1)return 0;
        while(r<nums.length-1){
            int large = 0;
            for(int i=l;i<=r;i++){
                large = Math.max(large,i+nums[i]);
            }
            l=r+1;r=large;
            c++;
        }
        return c;
    }
}