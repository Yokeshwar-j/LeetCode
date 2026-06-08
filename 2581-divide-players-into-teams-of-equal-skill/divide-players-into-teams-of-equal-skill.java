class Solution {
    public long dividePlayers(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,c=0;
        int sum=nums[0]+nums[j];
        long prod=0;
        while(i<j){
            int val = nums[i]+nums[j];
            if(val==sum){
                prod+=(nums[i]*nums[j]);
                i++;j--;
                c+=2;   
            }
            else if(val<sum){i++;}
            else{j--;}
        }
        return c!=nums.length?-1:prod;        
    }
    /**long sol = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min=Math.MAX_VLAUE,max=Math.MIN_VALUE;
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
            min=Math.min(min,x);
            max=Math.max(max,x);
        }   
        int sum = min+max;
        for() */
}