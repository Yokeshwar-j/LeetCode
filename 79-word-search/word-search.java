class Solution {
    public boolean exist(char[][] board, String word) {
        int l1 = board.length,l2=board[0].length;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(board[i][j]==word.charAt(0)){
                    char[][] arr =board;
                    //System.out.println(arr[i][j]);
                    //arr = 
                    if(dfs(arr,word,i,j,1))return true;
                    //if(l==word.length())return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][]bd ,String p,int i,int j,int ind){
        //System.out.println(bd[i][j] +"and ind : "+bd.length);
        if(ind>=p.length())return true;
        char temp = bd[i][j];
        bd[i][j]='0';
        boolean c1=false,c2=false,c3=false,c4=false;
       // System.out.println(bd[i+1][j]+" and "+p.charAt(ind));
        if(j+1< bd[0].length && bd[i][j+1]==p.charAt(ind))c1 = dfs(bd,p,i,j+1,ind+1);
        if(j-1>=0 && bd[i][j-1]==p.charAt(ind))c2= dfs(bd,p,i,j-1,ind+1);
        if(i-1>=0 && bd[i-1][j]==p.charAt(ind))c3= dfs(bd,p,i-1,j,ind+1);
        if(i+1 < bd.length && bd[i+1][j]==p.charAt(ind)){System.out.println("in");c4 =dfs(bd,p,i+1,j,ind+1);}
        bd[i][j]=temp;
        return c1 || c2 || c3 || c4;
    }
}