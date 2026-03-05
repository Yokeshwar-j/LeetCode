class Solution {
    public int[] dailyTemperatures(int[] t) {
        //Monotonic decreasing
        Stack<Integer> sm = new Stack<>();
        int[]arr = new int[t.length];
        Arrays.fill(arr,0);
        for(int i=0;i<t.length;i++){
            while(!sm.empty() && t[i]>t[sm.peek()]){
                arr[sm.peek()]=i-sm.pop();
            }
            sm.push(i);
        }
        return arr;
    }
}