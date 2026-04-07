class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ls = new ArrayList<>();
        List<String> fin = new ArrayList<>();
        back(ls,s,0,fin);
        return fin;
    }
    public void back(List<String> ls, String s,int i,List<String> fin){
        if(ls.size()==4 && i>=s.length()){
           // System.out.println(ls);
            String p = new String("");
            p=p+ls.get(0)+"."+ls.get(1)+"."+ls.get(2)+"."+ls.get(3);
            fin.add(p);
        }
        if(ls.size()==4)return;
        for(int j=i;j<s.length();j++){
           // System.out.println("hi");
            if(!check(s.substring(i,j+1)))break;
            ls.add(s.substring(i,j+1));
          //  System.out.println("hi");
            back(ls,s,j+1,fin);
            ls.remove(ls.size()-1);
        }
    }
    public boolean check(String x){
        if(x.length()>3 || x.length()<1)return false;
        if(x.length()>1 && x.charAt(0)=='0')return false;
        if(Integer.parseInt(x)>255)return false;
        return true;
    }
}