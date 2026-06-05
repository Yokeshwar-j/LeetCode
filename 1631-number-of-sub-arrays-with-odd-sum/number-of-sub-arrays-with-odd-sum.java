class Solution {
    public int numOfSubarrays(int[] arr) {
        int sum = 0,oc=0,ec=0,s=0;
        int val = (int)Math.pow(10,9)+7;
        for(int x : arr){
            sum+=x;
            if(sum%2==0){
                if(oc>0)s=(s+oc)%val;
                ec++;
            }
            else{
                s++;
                if(ec>0)s=(s+ec)%val;
                oc++;
            } 
        }
        return s;
    }
}