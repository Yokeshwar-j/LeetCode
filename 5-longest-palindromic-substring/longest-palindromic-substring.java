class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
        String p = String.valueOf(s.charAt(0));
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                if(check(s.substring(i,j+1)) && (j-i+1)>=p.length()){p=s.substring(i,j+1);}
            }
        }
        return p;
    }
    public boolean check(String x){
        int i=0,j=x.length()-1;
        while(i<j){
            if(x.charAt(i)!=x.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}