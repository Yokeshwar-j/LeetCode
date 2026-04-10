class Solution {
    public List<String> letterCombinations(String d) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2,"abc");hm.put(3,"def");hm.put(4,"ghi");hm.put(5,"jkl");hm.put(6,"mno");hm.put(7,"pqrs");
        hm.put(8,"tuv");hm.put(9,"wxyz");
        List<String> fin = new ArrayList<>();
        List<String> inp = new ArrayList<>();
        for(char x : d.toCharArray()){inp.add(hm.get(x-'0'));}
        System.out.println(inp.size());
        StringBuilder sb = new StringBuilder();
        back(fin,inp,sb,0);
        return fin;
    }
    public void back(List<String>fin,List<String>ls,StringBuilder sb,int i){
        if(sb.length()==ls.size()){
           // System.out.println("hi");
            StringBuilder pp = new StringBuilder(sb);
            fin.add(pp.toString());return;
        }
        String v = ls.get(i);
        for(int j=0;j<v.length();j++){
            sb.append(v.charAt(j));
            back(fin,ls,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}