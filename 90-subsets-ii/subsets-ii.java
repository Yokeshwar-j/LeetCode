class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        back(fin,ls,nums,0);
        return fin;
    }
    public void back(List<List<Integer>> fin,List<Integer> ls , int[]nums, int id){
        if(id>=nums.length){
            fin.add(new ArrayList<>(ls));return;
        }
        ls.add(nums[id]);back(fin,ls,nums,id+1);
        ls.remove(ls.size()-1);
        while(id+1<nums.length && nums[id]==nums[id+1])id++;
        back(fin,ls,nums,id+1);
    }
}