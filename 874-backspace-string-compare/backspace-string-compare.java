class Solution {
    public boolean backspaceCompare(String s, String t) {
        //using double pointer no staack
        StringBuilder sb = new StringBuilder();
        StringBuilder sp = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x!='#')sb.append(x);
            else if(sb.length()!=0){sb.deleteCharAt(sb.length()-1);}
        }
        for(char x : t.toCharArray()){
            if(x!='#')sp.append(x);
            else if(sp.length()!=0){sp.deleteCharAt(sp.length()-1);}
        }
        System.out.print(sp+" "+sb);
        if((sb.toString()).equals(sp.toString()))return true;
        return false;

    }
}