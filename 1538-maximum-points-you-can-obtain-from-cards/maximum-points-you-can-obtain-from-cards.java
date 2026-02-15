class Solution {
    public int maxScore(int[] cd, int k) {
        int[] pref = new int[cd.length];
        int[] suf = new int[cd.length];
        pref[0]=cd[0];suf[cd.length-1]=cd[cd.length-1];
        for(int i=1;i<cd.length;i++){
            pref[i]=pref[i-1]+cd[i];
        }
        for(int i=cd.length-2;i>=0;i--){
            suf[i]=suf[i+1]+cd[i];
        }
        int i=k-2,j=cd.length-1,max=0;
        while(i!=-1){
            int val=0;
            val=pref[i]+suf[j];
            max=Math.max(val,max);i--;j--;
        }
        max =  Math.max(max,pref[k-1]);
        return Math.max(max,suf[cd.length-k]);
        
    }
}