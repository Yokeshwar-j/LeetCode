class Solution {
    public int[] frequencySort(int[] nums) {
        //getting into custom comparator
        HashMap<Integer,Integer> hm = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){arr[i]=nums[i];}
        for(int x : nums){hm.put(x,hm.getOrDefault(x,0)+1);}
        //HashMap<Integer,List<Integer>> hh = new HashMap<>();
        Arrays.sort(arr,(a,b)->{
            if(hm.get(a)==hm.get(b)){
                return b-a;
            }else{
                return hm.get(a)-hm.get(b);
            }
        });
        for(int i=0;i<nums.length;i++){ nums[i]=arr[i];}
        return nums;
    }
}