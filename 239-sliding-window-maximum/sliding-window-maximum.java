class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //using a  monotonic deque
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> ls= new ArrayList<>();
        int i=0,j=0;
        while(j<nums.length){
            while(!dq.isEmpty() && dq.getLast()<nums[j]){dq.removeLast();}
            dq.addLast(nums[j]);
            if(j-i+1==k && !dq.isEmpty()){
                ls.add(dq.getFirst());
                if(nums[i++]==dq.getFirst())dq.removeFirst();
            }
            j++;
        }
        int[]arr = new int[ls.size()];i=0;
        for(Integer x : ls){arr[i++]=x;}
        return arr;
    }
}