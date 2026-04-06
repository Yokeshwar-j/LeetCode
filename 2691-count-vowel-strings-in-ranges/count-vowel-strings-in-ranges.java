class Solution {
    public int[] vowelStrings(String[] words, int[][] qry) {
        int[] arr = new int[words.length];
        int[] sol = new int[qry.length];
        int v=0,i=0;
        List<Character> ls = new ArrayList<>();
        ls.add('a');ls.add('e');ls.add('o');ls.add('u');ls.add('i');
        for(String  p : words){
            if(ls.contains(p.charAt(0)) && ls.contains(p.charAt(p.length()-1))) {
                arr[i]=++v;
            }else{arr[i]=v;}
            i++;
        }
        i=0;
        for(int[]ar : qry){
            int res = arr[ar[1]];
            if(ar[0]>0)res -= arr[ar[0]-1];
            sol[i++]=res;
        }
        return sol;

    }
}