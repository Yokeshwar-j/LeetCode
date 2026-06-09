class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length,sol=0;
        int[] fin = new int[n*2];
        for(int i=0;i<n*2;i++){
            fin[i]=colors[i%n];
        }
        int last=-1,i=0,j=0;
        while(i<colors.length){
            int cur = fin[j];
            if(cur==last){i=j;}
            if(j-i==k-1){sol++;i++;}
            j++;
            last=cur;
        }
        return sol;
    }
}