class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void bfs(char[][] grid , int i , int j){
        grid[i][j]='a';//visit
        if(i+1 < grid.length && grid[i+1][j]=='1')bfs(grid,i+1,j);
        if(j+1 < grid[0].length && grid[i][j+1]=='1')bfs(grid,i,j+1);
        if(i-1>=0 && grid[i-1][j]=='1')bfs(grid,i-1,j);
        if(j-1>=0 && grid[i][j-1]=='1')bfs(grid,i,j-1);
    }
}