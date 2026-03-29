class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int t) {
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(can);
        comb(fin,ls,can,t,0);
        return fin;
    }
    public void comb(List<List<Integer>> fin,List<Integer> ls ,int[]arr , int tar, int id){
        if(tar==0){
            //Collections.sort(ls);
            fin.add(new ArrayList<>(ls));return;
        }
        if(id>=arr.length || tar<0){return;}
        //sum+=arr[id];
        ls.add(arr[id]);
        comb(fin,ls,arr,tar-arr[id],id+1);
        //sum-=arr[id];
        ls.remove(ls.indexOf(arr[id]));
        while(id+1< arr.length && arr[id]==arr[id+1]){id++;}
        comb(fin,ls,arr,tar,id+1);
    }
}