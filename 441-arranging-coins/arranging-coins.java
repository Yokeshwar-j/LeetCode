class Solution {
    public int arrangeCoins(int n) {
        int res = 0,min=1;
        while(n>0){
            res++;
            n=n-(min++);
        }
        return n==0?res:res-1;
        
    }
}