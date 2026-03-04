class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0)continue;
                int sum=0;
                for(int k=0;k<mat[0].length;k++){
                    sum+=mat[i][k];
                }
                if(sum!=1)break;
                sum=0;
                for(int k=0;k<mat.length;k++){
                    sum+=mat[k][j];
                }
                if(sum==1)c++;
            }
        }
        return c;
    }
}