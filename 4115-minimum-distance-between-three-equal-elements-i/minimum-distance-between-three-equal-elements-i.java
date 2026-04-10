class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                List<Integer> ll = hm.get(nums[i]);ll.add(i);hm.put(nums[i],ll);
            }else{
                List<Integer> ll = new ArrayList<>();ll.add(i);
                hm.put(nums[i],ll);
            }
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Integer,List<Integer>> hs : hm.entrySet()){
            List<Integer> ls = hs.getValue();if(ls.size()<3)continue;
            int i=0,j=2,l=0;
            while(j<ls.size()){
                int sum = Math.abs(ls.get(i+1)-ls.get(i))+Math.abs(ls.get(i+1)-ls.get(i+2))+Math.abs(ls.get(i+2)-ls.get(i));
                min = Math.min(min,sum);i++;j++;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}