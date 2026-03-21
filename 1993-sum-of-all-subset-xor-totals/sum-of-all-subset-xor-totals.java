class Solution {
    public int subsetXORSum(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        return subset(nums,0,0,ls);
    }
    public int subset(int[]arr , int x,int sum,List<Integer> ls){
        if(x>=arr.length){
            int vv=0;
            for(Integer p : ls){vv^=p;}
            sum+=vv;
            return sum;
        }
        ls.add(arr[x]);
        sum=subset(arr,x+1,sum,ls);
        ls.remove(ls.indexOf(arr[x]));
        sum=subset(arr,x+1,sum,ls);
        return sum;

    }
}