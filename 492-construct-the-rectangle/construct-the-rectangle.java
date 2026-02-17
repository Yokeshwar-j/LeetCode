class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int x = (int)Math.pow(area,0.5);
        int l=x,r=x;
        while(l!=0){
            if((l*r)==area){arr[0]=r;arr[1]=l;return arr;}
            else if((l*r)>area)l--;
            else{r++;}
        }
        return arr;
    }
}