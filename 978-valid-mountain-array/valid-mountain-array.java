class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        int i=0,j=arr.length-1;
        boolean c1=false,c2=false;
        while(i+1<arr.length && arr[i]<arr[i+1]){c1=true;i++;}
        while(j-1>=0 && arr[j-1]>arr[j]){j--;c2=true;}
        return c1&&c2&&i==j;
    }
}