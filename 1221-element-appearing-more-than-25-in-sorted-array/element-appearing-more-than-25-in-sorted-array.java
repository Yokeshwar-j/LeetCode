class Solution {
    public int findSpecialInteger(int[] arr) {
        //sliding window
        int i=0,j=0,max=Integer.MIN_VALUE,ele=-1;
        while(j<arr.length){
            if(arr[j]!=arr[i]){
                if(j-i>max){
                    max=j-i;ele=arr[i];
                }
                i=j;
            }
            j++;
           // System.out.println("max->"+max);
            //System.out.println("i->"+i+"  j->"+j);
        }
        if(j-i>max){max=j-i;ele=arr[i];}
        return ele;
    }
}