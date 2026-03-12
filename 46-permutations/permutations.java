class Solution {
    List<List<Integer>> ll = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int[] arr= new int[nums.length];
        perm(arr,ls,nums);
        return ll;
    }
    public void perm(int[] check,List<Integer> ls,int[] nums){
        if(ls.size()==nums.length){ll.add(new ArrayList<>(ls));return;}
        for(int i=0;i<nums.length;i++){
            if(check[i]==1)continue;
            ls.add(nums[i]);check[i]=1;perm(check,ls,nums);
            ls.remove(ls.size()-1);check[i]=0;
        }
    }
}