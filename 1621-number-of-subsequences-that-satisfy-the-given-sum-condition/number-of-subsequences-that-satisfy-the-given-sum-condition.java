class Solution {
    public int numSubseq(int[] nums, int target) {
        long mod = (long)Math.pow(10,9)+7;
        Arrays.sort(nums);
        int i=0,j=nums.length-1;long sol=0;
        long[] brr = new long[nums.length];
        brr[0]=1;
        for(int p=1;p<nums.length;p++){
            brr[p] = (brr[p-1]*2)%mod;
        }
        while(i<=j ){
            if((nums[i]+nums[j])<=target){
                sol=(long)(sol+brr[j-i])%mod;
                i++;
            }else{j--;}
        }
        return (int)sol;
    }
}