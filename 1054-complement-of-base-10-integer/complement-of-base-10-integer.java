class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int res=0;
        int val=1;
        while(n!=0){
            int x = n&1;
            x=x^1;
           // System.out.println(x);
            res =res + (val*x);
            val*=2;
            n=n>>1;
        }
        return res;
    }
}