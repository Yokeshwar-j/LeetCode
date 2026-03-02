class Solution {
    List<Integer>ls = new ArrayList<>();
    int tot;
    public int findTheWinner(int n, int k) {
        tot=k-1;
        for(int i=1;i<=n;i++){ls.add(i);}
        get(0);
        return ls.get(0);
    }
    public void get(int po){
        if(ls.size()==1)return;
        int f = ((po+tot)%ls.size());
        ls.remove(f);
        get(f);
    }
}