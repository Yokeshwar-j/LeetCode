class Solution {
    public void sortColors(int[] nums) {
        int[]color = new int[3];
        for(int x : nums){color[x]++;}
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(color[j]==0)j++;
            if(j>2)break;
            nums[i]=j;
            color[j]--;
        }  
    }
}