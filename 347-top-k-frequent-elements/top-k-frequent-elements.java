class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x: nums){hm.put(x,hm.getOrDefault(x,0)+1);}
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<arr.length;i++){arr[i]=nums[i];}
        Arrays.sort(arr,(a,b)->{
            return hm.get(b)-hm.get(a);
        });
        for(int i=0;i<arr.length && ls.size()!=k;i++){
            if(!ls.contains(arr[i])){ls.add(arr[i]);}
        }
        int jj=0;
        int[] fin = new int[k];
        for(int i : ls){fin[jj++]=i;}
        return fin;

    }
}