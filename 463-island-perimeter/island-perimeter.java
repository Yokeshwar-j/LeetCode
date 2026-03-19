class Solution {
    int p = 0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    bfs(i,j,grid);return p;
                }
            }
        }
        return p;
    }
    public void bfs(int i,int j,int[][] is){
        int l = 4;
        is[i][j]=-1;
        
        if(i-1>=0){
            if(is[i-1][j]==-1)l--;
            else if(is[i-1][j]==1){l--;bfs(i-1,j,is);}
        }
        if(i+1<is.length){
            if(is[i+1][j]==-1)l--;
            else if(is[i+1][j]==1){l--;bfs(i+1,j,is);}
        }
        if(j-1>=0){
            if(is[i][j-1]==-1)l--;
            else if(is[i][j-1]==1){l--;bfs(i,j-1,is);}
        }
        if(j+1<is[i].length){
            if(is[i][j+1]==-1)l--;
            else if(is[i][j+1]==1){l--;bfs(i,j+1,is);}
        } 
        p+=l;
    }
}