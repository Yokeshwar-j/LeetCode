class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
          //  System.out.print("hi");
            int x = nums[i];
            int y = target - x;
            if(hm.containsKey(y) && hm.get(y)!=i){
                return new int[]{i,hm.get(y)};
            }
            hm.put(x,i);
        }
        return new int[]{};
    }
}