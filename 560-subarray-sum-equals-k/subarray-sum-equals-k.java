class Solution {
    public int subarraySum(int[] nums, int k) {
        int[]pref = new int[nums.length];
        int[]suf = new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            int j=0;
            if(pref[i]==k){c++;}
            while(j<i){
                if((pref[i]-pref[j])==k){c++;}
                j++;
            }
        }
        return c;

    }
}