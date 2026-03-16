class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int x : piles){max=Math.max(max,x);}
        int i=1,j=max;
        int res=max,diff=Integer.MAX_VALUE;
        while(i<=j){
            int mid = (i+j)/2;
            System.out.println(mid);
            int we = check(piles,mid);
            int d = h-we;
            if(d>=0 && d<=diff){diff=d;res=Math.min(res,mid);j=mid-1;}
            else{i=mid+1;}
        }
        return res;
    }
    public int check(int[] arr , int x){
        int ans = 0;
        for(int l : arr){
            if(l%x==0)ans+=(l/x);
            else{ans+=(l/x);ans++;}
        }
        return ans;
    }
}