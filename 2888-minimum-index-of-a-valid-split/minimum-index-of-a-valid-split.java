class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int mv=0,key=nums.get(0);
        for(Map.Entry<Integer,Integer> hs : hm.entrySet()){
            if(hs.getValue()>mv){key=hs.getKey();mv=hs.getValue();}
        }
        int c=0,llen=0,rlen=nums.size();
        for(int i=0;i<nums.size();i++){
            llen++;rlen--;
            if(nums.get(i)==key){
                c++;mv--;
                if(c>llen/2 && mv>rlen/2)return i;
            }
        }
        return -1;
    }
}