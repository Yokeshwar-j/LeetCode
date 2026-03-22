class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            mat = rot(mat);
            if(check(mat,target))return true;
        }
        return false;
    }
    public int[][] rot(int[][]a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[0].length;j++){
                int t = a[i][j];a[i][j]=a[j][i];a[j][i]=t;
            }
        }
        for(int i=0;i<a.length;i++){
            int j=0,k=a[0].length-1;
            while(j<k){
                int t = a[i][j];a[i][j]=a[i][k];a[i][k]=t;j++;k--;
            }
        }
        return a;
    } 
    public boolean check(int[][]a,int[][]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]!=b[i][j])return false;
            }
        }
        return true;
    }
}