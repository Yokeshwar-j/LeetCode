class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i=0;i<graph.length;i++){color[i]=-1;}
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!dfs(graph,i,0,color))return false;
            }
        }
        return true;
    }
    public boolean dfs(int[][] grid , int i,int p,int[] color){
        color[i] = p;
        for(int j=0;j<grid[i].length;j++){
            if(color[grid[i][j]]==-1){
                if(!dfs(grid,grid[i][j],1-color[i],color))return false;
            }
            else if(color[i]==color[grid[i][j]])return false;
        }
        return true;
    }
}