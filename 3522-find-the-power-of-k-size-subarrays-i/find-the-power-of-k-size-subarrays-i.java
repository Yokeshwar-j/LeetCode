class Solution {
    public int[] resultsArray(int[] nums, int k) {
        //hard when done with sliding window
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int val=nums[i];
            for(int j=i+1;j<i+k;j++){
                if((nums[j]-nums[j-1])!=1){val=-1;break;}
                val=nums[j];
            }
            l.add(val);
        }
        int m=0;
        int[] arr = new int[l.size()];
        for(int x : l){
            arr[m++]=x;
        }
        return arr;
    }
}