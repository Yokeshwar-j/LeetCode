class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int c=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[0].length;j++){
                if(grid2[i][j]==1){
                    List<List<Integer>> ls = new ArrayList<>();
                    dfs(grid2,i,j,ls);
                    if(check(ls,grid1))c++;
                }
            }
        }
        return c;
    }
    public void dfs(int[][] grid, int i, int j, List<List<Integer>> ls){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1)return;
        int[] arr = {1,0,-1,0};
        int[] brr = {0,1,0,-1};
        grid[i][j]=-1;
        List<Integer> lm = new ArrayList<>();lm.add(i);lm.add(j);ls.add(lm);
        for(int k=0;k<4;k++){
            dfs(grid,i+arr[k],j+brr[k],ls);
        }
    }
    public boolean check(List<List<Integer>> ls,int[][] grid){
        for(int i=0;i<ls.size();i++){
            int r = ls.get(i).get(0);
            int c = ls.get(i).get(1);
            if(grid[r][c]!=1)return false;
        }
        return true;
    }
}