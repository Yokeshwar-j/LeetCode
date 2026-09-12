class Solution {
    public List<String> commonChars(String[] words) {
        List<HashMap<Character,Integer>> ls = new ArrayList<>();
        for(String x : words){
            HashMap<Character,Integer> hm = new HashMap<>();
            for(char p : x.toCharArray()){
                hm.put(p,hm.getOrDefault(p,0)+1);
            }
            ls.add(hm);
        }
        List<String> ll = new ArrayList<>();
        for(int i=97;i<123;i++){
            char ele = (char)i;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<words.length;j++){
                HashMap<Character,Integer> hs = ls.get(j);
                min = Math.min(min,hs.getOrDefault(ele,0));
            }
            for(int j=0;j<min;j++){ll.add(""+ele);}
        }
        return ll;
    }
}