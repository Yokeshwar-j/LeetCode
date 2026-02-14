class Solution {
    public String mapWordWeights(String[] words, int[] w) {
        StringBuilder sb = new StringBuilder();
        List<Integer> ls = new ArrayList<>();
        for(String x : words){
            int sum=0;
            for(char c : x.toCharArray()){
                sum+=w[c-'a'];
            }
            System.out.print(sum%26);
            ls.add(sum%26);
        }
        for(int x : ls){
            int p = 96+26-x;
            char h =(char)p;
            sb.append(h);
        }
        return sb.toString();
        
    }
}