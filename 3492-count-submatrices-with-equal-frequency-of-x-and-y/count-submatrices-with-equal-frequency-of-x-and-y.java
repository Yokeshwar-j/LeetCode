class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int val=0,c=0,x=0,m = grid.length+1,n=grid[0].length+1;
        int[][] fin = new int[m][n];
        int[][] xx = new int[m][n];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                x=0;
                if(grid[i-1][j-1]=='X'){x=1;val=1;}
                else if(grid[i-1][j-1]=='Y')val=-1;
                else val=0;
                fin[i][j] = fin[i-1][j]+fin[i][j-1]+val-fin[i-1][j-1];
                xx[i][j] = xx[i-1][j]+xx[i][j-1]+x-xx[i-1][j-1];
                if(fin[i][j]==0 && xx[i][j]>0)c++;
            }
        }
        return c;
    }
}