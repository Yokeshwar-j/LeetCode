class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr = new int[nums.length+1];List<Integer> ls = new ArrayList<>();int i=0;
        for(int x : nums){
            arr[x]++;
            if(arr[x]==2)ls.add(x);
        }
        return ls;
    }
}