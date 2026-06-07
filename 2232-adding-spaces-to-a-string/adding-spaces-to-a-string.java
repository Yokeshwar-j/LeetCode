class Solution {
    public String addSpaces(String s, int[] sp) {
        int j=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(j<sp.length && i==sp[j]){
                sb.append(" ");j++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}