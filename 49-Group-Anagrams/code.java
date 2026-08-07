class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>();
        List<String> org = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            org.add(strs[i]);
        }
        int i=0;
        while(i<org.size()){
            int j=i+1;
            List<String> ll = new ArrayList<>();
            ll.add(org.get(i));
            while(j<org.size()){
                if(check(org.get(i),org.get(j))){ll.add(org.get(j));org.remove(j);}
                else{j++;}
            }
            ls.add(ll);i++;
        }
        return ls;
     
    }
    public boolean check(String a,String b){
        if(a.length()!=b.length())return false;
        List<Character> ll = new ArrayList<>();
        for(int i=0;i<a.length();i++){
            ll.add(a.charAt(i));
        }
        for(int j=0;j<b.length();j++){
            if(ll.contains(b.charAt(j))){ll.remove(Character.valueOf(b.charAt(j))); }
            else{return false;}
        }
        if(ll.size()==0)return true;
        else return false;
    }
}
