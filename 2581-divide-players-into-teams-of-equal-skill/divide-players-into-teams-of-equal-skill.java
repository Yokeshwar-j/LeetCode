class Solution {
    public long dividePlayers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
       // int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int suma=0;
        for(int x : nums){
            suma+=x;
        }   

        int sum = suma/(nums.length/2);
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