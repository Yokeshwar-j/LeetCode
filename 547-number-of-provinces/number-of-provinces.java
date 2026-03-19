class Solution {
    public int findCircleNum(int[][] con) {
        //using dfs 
        int c=0;
        boolean[] vis = new boolean[con.length+1];
        for(int i=0;i<con.length;i++){
            if(!vis[i+1]){c++;dfs(i,vis,con);}
        }
        return c;
    }
    public void dfs(int x,boolean[]vis,int[][] con){
        vis[x+1]=true;
        for(int i=0;i<con[x].length;i++){
            if(con[x][i]==1 && !vis[i+1]){
                dfs(i,vis,con);
            }
        }
    }
}