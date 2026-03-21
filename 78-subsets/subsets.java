class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        sub(ls,fin,nums,0);
        return fin;
    }
    public void sub(List<Integer> ls,List<List<Integer>> fin,int[] arr,int x){
        if(x>=arr.length){
            if(!fin.contains(ls)){
                fin.add(new ArrayList<>(ls));
            }
            return;
        }
        ls.add(arr[x]);
        sub(ls,fin,arr,x+1);
        ls.remove(ls.indexOf(arr[x]));
        sub(ls,fin,arr,x+1);
    }
}