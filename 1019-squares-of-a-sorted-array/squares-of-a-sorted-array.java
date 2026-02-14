class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int i=Integer.MIN_VALUE,j=Integer.MAX_VALUE,k=0;
        boolean con=false;
        for(int x=0;x<nums.length;x++){
            if(nums[x]<0){i=x;}
            else if(!con){con=true;j=x;}
            nums[x]=nums[x]*nums[x];
        }
        while(i>=0 && j<nums.length){
            if(nums[i]<nums[j]){arr[k++]=nums[i--];}
            else{arr[k++]=nums[j++];}
        }
        while(i>=0){arr[k++]=nums[i--];}
        while(j<nums.length){arr[k++]=nums[j++];}
        return arr;

    }
}