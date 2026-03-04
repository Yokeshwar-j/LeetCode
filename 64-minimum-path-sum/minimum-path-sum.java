class Solution {
    public int minPathSum(int[][] grid) {
        //using memoization findin min path at each step
        int[][] arr = new int[grid.length][grid[0].length];
        arr[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0)continue;
                if(i==0)arr[i][j] =grid[i][j] + arr[i][j-1];
                else if(j==0)arr[i][j]= grid[i][j]+arr[i-1][j];
                else{
                    arr[i][j] =grid[i][j] + Math.min(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[grid.length-1][grid[0].length-1];
    }
}