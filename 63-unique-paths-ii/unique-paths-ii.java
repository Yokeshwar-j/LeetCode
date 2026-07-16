class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        if(ob.length==0 || ob[0][0]==1)return 0;
        int[][] mat = new int[ob.length][ob[0].length];
        for(int i=0;i<ob[0].length && ob[0][i]!=1;i++){mat[0][i]=1;}
        for(int i=0;i<ob.length && ob[i][0]!=1;i++){mat[i][0]=1;}
        for(int i=1;i<ob.length;i++){
            for(int j=1;j<ob[0].length;j++){
                if(ob[i][j]!=1){
                    mat[i][j] = mat[i-1][j]+mat[i][j-1];
                  //  System.out.print(mat[i][j]+" ");
                }
            }
           // System.out.println();
        }
        return mat[mat.length-1][mat[0].length-1];
    }
}