class Solution {
    public int strStr(String hay, String nee) {
        //KarpRabin(Rolling Hash)
        int a = hay.length();int b = nee.length();
        if(b>a)return -1;
        int h=1 , q=101;
        for(int i=0;i<b-1;i++){h=(h*26)%101;}
        int th =0 , ph=0;
        for(int i=0;i<nee.length();i++){
            ph = ((ph*26)+value(nee.charAt(i)))%101;
            th = ((th*26)+value(hay.charAt(i)))%101;
        }
      //  System.out.println("Pattern : "+ph);
        for(int i=0;i<=(a-b);i++){
           // System.out.println("Text : "+th);
            String temp = hay.substring(i,i+b);
            if(th==ph){
                if(temp.equals(nee))return i;
            }
            if((i+b)<a){
                th = th - (value(hay.charAt(i))*h);
                th = ((th*26)+value(hay.charAt(i+b)))%101;
                if(th<0)th+=101;
            }
        }
        return -1;
    }
    public int value(char p){return p-'a'+1;}
}