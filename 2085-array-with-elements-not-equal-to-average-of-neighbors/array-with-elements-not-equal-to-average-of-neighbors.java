class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] fin = new int[nums.length];
        Arrays.sort(nums);
        int i=0,j=1,k=0;
        for( i=0;j<nums.length;i++){
            fin[j]=nums[i];j+=2;k=i;
        }
        j=0;
        for(i=k+1;j<nums.length && i<nums.length;i++){
            fin[j]=nums[i];j+=2;
        }
        return fin;
    }
}