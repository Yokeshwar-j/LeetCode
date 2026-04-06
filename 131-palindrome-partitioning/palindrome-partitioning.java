class Solution {
    List<List<String>> fin = new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> ls = new ArrayList<>();
        back(0,s,ls);
        return fin;
    }
    public void back(int i,String s,List<String> ls){
        if(i>=s.length()){
            fin.add(new ArrayList<>(ls));return;
        }
        for(int j = i;j<s.length();j++){
            if(pal(s.substring(i,j+1))){
                ls.add(s.substring(i,j+1));
                back(j+1,s,ls);
                ls.remove(ls.size()-1);
            }
        }
    }
    public boolean pal(String l){
        int i=0,j=l.length()-1;
        while(i<j){
            if(l.charAt(i)!=l.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}