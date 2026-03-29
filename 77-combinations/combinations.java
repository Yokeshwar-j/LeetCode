class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> fin =  new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        //int[]arr = new int[n+1];
        comb(fin,ls,k,n+1,1);
        return fin;
    }
    public void comb(List<List<Integer>>fin , List<Integer>ls,int k, int n,int x){
        if(ls.size()==k){
            fin.add(new ArrayList<>(ls));return;
        }
        if(x>=n)return;
        ls.add(x);
        comb(fin,ls,k,n,x+1);
        ls.remove(ls.size()-1);
        comb(fin,ls,k,n,x+1);
    }
}