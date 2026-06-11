class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int hay=0,need=0,k=s1.length();
        char[] pp = s1.toCharArray();
        Arrays.sort(pp);
        s1= new String(pp);
        for(int l=0;l<k;l++){need+=(int)s1.charAt(l);}
        int i=0,j=0;
        while(j<s2.length()){
            hay+=(int)s2.charAt(j);
            if((j-i+1)==k){
                if(hay==need){
                    String ne = s2.substring(i,j+1);
                    char[] cc = ne.toCharArray();
                    Arrays.sort(cc);
                    ne = new String(cc);
                    if(ne.equals(s1))return true;
                }
                hay-=(int)s2.charAt(i++);
            }
            j++;
        }
        return false;
    }
}