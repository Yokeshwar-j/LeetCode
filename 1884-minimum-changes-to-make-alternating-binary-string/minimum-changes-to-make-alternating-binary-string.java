class Solution {
    public int minOperations(String s) {
        return Math.min(check(s,0),check(s,1));
    }
    public int check(String s , int p){
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char h = (String.valueOf(p)).charAt(0);
            if(s.charAt(i)!=h)cnt++;
            p++;p=p%2;
        }
        return cnt;
    }
}