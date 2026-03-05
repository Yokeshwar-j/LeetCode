class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //using monotonic stack(min stack)
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums2.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums2.length;i++){
            while(!st.empty() && nums2[i]>nums2[st.peek()]){
                arr[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],arr[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = hm.get(nums1[i]);
        }
        return nums1;
    }
}