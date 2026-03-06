class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ls = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;int k = nums.length-1;
            while(j<k){
                int val = nums[i]+nums[j]+nums[k];
                if(val==0){
                    ls.add(Arrays.asList(nums[i],nums[j],nums[k]));j++;k--;
                }
                else if(val<0){j++;}
                else{k--;}
            }
        }
        List<List<Integer>> fin = new ArrayList<>();
        for(List<Integer> p : ls){fin.add(p);}
        return fin;

    }
}