class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            nums[i] = (nums[i]&1)==1?1:0;
        }
        int psum=0,res=0;
        HashMap<Integer,Integer> hm = new HashMap<>();hm.put(0,1);
        for(int n : nums){
            psum += n;
            int tar = psum-k;
            if(hm.containsKey(tar)){res+=hm.get(tar);}
            hm.put(psum,hm.getOrDefault(psum,0)+1);
        }
        return res;
    }
} 