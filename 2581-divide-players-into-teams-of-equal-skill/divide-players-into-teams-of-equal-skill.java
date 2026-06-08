class Solution {
    public long dividePlayers(int[] nums) {
        long sol = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int x : nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }   
        int sum = min+max;
        long prod=0;
        for(int p : nums){
            int v= sum-p;
            if(hm.containsKey(v)){
                int value = hm.get(v);
                if(value==1)hm.remove(v);
                else hm.put(v,value-1);
                prod+=(p*v);
            }else{
                hm.put(p,hm.getOrDefault(p,0)+1);
            }
        } 
        return hm.size()!=0?-1:prod;
    }
}