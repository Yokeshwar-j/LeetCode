class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1,p=n;
        while(n!=0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return p%(sum+pro)==0;
    }
}