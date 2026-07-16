class Solution {
    public int minimumTotal(List<List<Integer>> tri) {
        for(int i=tri.size()-2;i>=0;i--){
            back(tri,i);
        }
        return tri.get(0).get(0);
    }
    public void back(List<List<Integer>> ls ,int x ){
        if(x<0)return;
        List<Integer> pp = ls.get(x);
        for(int i=0;i<pp.size();i++){
            pp.set(i,Math.min(pp.get(i)+ls.get(x+1).get(i),pp.get(i)+ls.get(x+1).get(i+1)));
        }
    }
}