class Solution {
    public int firstUniqueFreq(int[] nums) {
        LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> he = new LinkedHashMap<>();
        int freq=0;
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> hh : hm.entrySet()){
            he.put(hh.getValue(),he.getOrDefault(hh.getValue(),0)+1);
        }
        for(Map.Entry<Integer,Integer> hh : he.entrySet()){
            if(hh.getValue()==1){
                freq=hh.getKey();break;
            }
        }
        for(Map.Entry<Integer,Integer> hh : hm.entrySet()){
            if(freq==hh.getValue())return hh.getKey();
        }
        return -1;
    }
}