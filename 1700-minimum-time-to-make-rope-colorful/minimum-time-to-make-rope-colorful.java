class Solution {
    public int minCost(String colors, int[] need) {
        int i=0,j=1,otime=0,ntime=0;
        for(int x : need){otime+=x;}
        int max=need[0];
        boolean con=false;
        while(j<colors.length()){
            while(j<colors.length() && colors.charAt(i)==colors.charAt(j)){max=Math.max(max,need[j]);j++;
            }
            ntime+=max;
            if(j>=colors.length()){con=true;break;}
            i=j;j++;
            max=need[i];
        }
        if(!con)ntime+=max;
        return otime-ntime;
    }
}