class Solution {
    public String shortestPalindrome(String s) {
        //KarpRabin
        if(s.length()<2)return s;
        int idx=0,h=1,i=0;
        long fh=0,th=0,po=1;
        long ha = 1000000007L;
        String v = reverse(s);
        int sl = s.length();
        while(i<sl){
            fh = ((fh*26)+value(s.charAt(i)))%ha;
            th = (po*value(v.charAt(sl-1-i))+th)%ha;
            po = (po*26)%ha;
            if(fh==th)idx=i;
            i++;
        }
        idx++;
        String p = reverse(s.substring(idx,s.length()));
        return p+s;
    }
    public String reverse(String a){
        String x = "";
        for(int i=a.length()-1;i>=0;i--){x+=a.charAt(i);}
        return x;
    }
    public int value(char p){return p-'a'+1;}
}