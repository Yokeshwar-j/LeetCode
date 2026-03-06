class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)continue;
            int k=i;
            for(int j=i;j<nums.length && nums[j]==0;j++){k=j;}
            System.out.println(k-i+1);
            c=c + per(k-i+1);
            i+=(k-i+1);
        }
        return c;
    }
    public long  per(long i){
        return (i*(i+1))/2;
    }
}