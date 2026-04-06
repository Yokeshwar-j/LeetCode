class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(List<Integer> p : wall){
            int v = 0;
            for(int i=0;i<p.size()-1;i++){v+=p.get(i);hm.put(v,hm.getOrDefault(v,0)+1);}
        }
        int ma = 0;
        for(Map.Entry<Integer,Integer> hs : hm.entrySet()){ma=Math.max(ma,hs.getValue());}
        return wall.size()-ma;
    }
}