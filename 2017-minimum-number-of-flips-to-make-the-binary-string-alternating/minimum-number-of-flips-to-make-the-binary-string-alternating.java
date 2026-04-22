class Solution {
    public int minFlips(String s) {
        String x = s+s;
        int v1=0,v2=0;
        int[]odd = new int[x.length()];
        int[]even = new int[x.length()];
        for(int i=0;i<x.length();i++){
           if((i&1)==0){
            if(x.charAt(i)!='0')v1++;
            else v2++;
           }else{
            if(x.charAt(i)!='1')v1++;
            else v2++;
           }
           odd[i]=v1;even[i]=v2;
        }
        int i=0,j=s.length()-1,min=Integer.MAX_VALUE;
        while(j<x.length()){
            v1 = odd[j]-(i>0?odd[i-1]:0);
            v2=even[j]-(i>0?even[i-1]:0);
            int val=Math.min(v1,v2);
            min = Math.min(min,val);
           // System.out.println("Min : "+min);
           j++;i++;

        }
        return min;
    }
  
}