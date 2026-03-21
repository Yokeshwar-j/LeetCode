class Solution {
    public List<List<Integer>> combinationSum(int[] can, int t) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        comb(fin,l,can,t,0);
        return fin;
    }
    public void comb(List<List<Integer>> fin,List<Integer> l,int[] arr,int tar,int id){
        if(id>=arr.length)return;
        if(tar==0){
            fin.add(new ArrayList<>(l));return;
        }
        if(arr[id]<=tar){
            l.add(arr[id]);
            comb(fin,l,arr,tar-arr[id],id);
            l.remove(l.indexOf(arr[id]));
        }
        comb(fin,l,arr,tar,id+1);
    }
}