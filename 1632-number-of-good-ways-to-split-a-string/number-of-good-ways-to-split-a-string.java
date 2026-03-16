class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char  p : s.toCharArray()){
            hm.put(p,hm.getOrDefault(p,0)+1);
        }
        int c=0;
        HashMap<Character,Integer> hh = new HashMap<>();   
        for(char x : s.toCharArray()){
            hh.put(x,hh.getOrDefault(x,0)+1);
           // System.out.println("hh->"+hh.get(x));
            hm.put(x,hm.get(x)-1);
           // System.out.println("hm->"+hm.get(x));
            if(hm.get(x)==0)hm.remove(x);
            if(hm.size()==hh.size())c++;
          //  System.out.println("****");
        }
        return c;
    }
}