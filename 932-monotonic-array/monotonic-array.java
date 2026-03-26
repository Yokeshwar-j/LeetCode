class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean con=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])con=false;
        }    
        if(con)return true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])con=true;
        }
        return !con;
    }
    
}