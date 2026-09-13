class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int x : nums){min.add(x);}
        int[] arr = new int[nums.length];
        int i=0;
        while(min.size()!=0){
            arr[i+1] = min.poll();
            arr[i]=min.poll();
            i+=2;
        }
        return arr;
    }
}