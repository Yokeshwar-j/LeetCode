class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] fin = new int[nums.length];
        int a=0,b=1;
       // boolean con = false;
        for(int x : nums){
            if(x>0){fin[a]=x;a+=2;}
            else{fin[b]=x;b+=2;}
        }
        return fin;
    }
}