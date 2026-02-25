class Solution {
    public String countAndSay(int n) {
        StringBuilder x = new StringBuilder("1");
        StringBuilder temp = new StringBuilder();
        int j=1;
        while(j<n){
            int c=1;
            for(int i=0;i<x.length();i++){
                String t = String.valueOf(x.charAt(i));
                if(i+1<x.length() && x.charAt(i)==x.charAt(i+1)){c++;continue;}
                temp.append(String.valueOf(c));
                c=1;
                temp.append(String.valueOf(x.charAt(i)));
            }
            x.setLength(0);x.append(temp);j++;temp.setLength(0);
        }
        return x.toString();
    }
}