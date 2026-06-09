class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return j-i+1;
            else{
                while(i<j && s.charAt(i)==s.charAt(j)){i++;}
                i--;
                while(i<j && s.charAt(j)==s.charAt(i)){j--;}
                i++;
            }
        }
        return i==j?1:0;
    }
}