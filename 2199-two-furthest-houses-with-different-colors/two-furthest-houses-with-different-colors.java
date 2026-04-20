class Solution {
    public int maxDistance(int[] colors) {
        int i=0,lmax=0,rmax=0;
        for(int j=1;j<colors.length;j++){
            if(colors[j]!=colors[i]){lmax=j;}
        }
        for(int j=0;j<colors.length;j++){
            if(colors[j]!=colors[i]){rmax=j;break;}
        }
        return Math.max(colors.length-rmax-1,lmax);
    }
}