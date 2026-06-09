class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int i=0,j=0;
        int sum=0,sol=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i==k-1){
                if((sum/k)>=th)sol++;
                sum-=arr[i++];
            }
            j++;
        }
        return sol;
    }
}