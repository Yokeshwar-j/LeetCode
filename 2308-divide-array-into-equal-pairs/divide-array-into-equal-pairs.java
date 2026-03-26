class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];
        for(int x:nums)arr[x]++;
        for(int x : arr){
            if((x&1)==1)return false;
        }
        return true;
    }
}