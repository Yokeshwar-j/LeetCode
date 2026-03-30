class Solution {
    int val=0;
    HashSet<String> hs= new HashSet<>();
    public int numTilePossibilities(String tiles) {
        
        StringBuilder ls = new StringBuilder();
        back(ls,0,tiles);
       // for(String l : hs)System.out.println(l);
        return hs.size();
    }
    public void back(StringBuilder ls,int id,String p){
        //Collections.sort(p);
        if(id>=p.length()){
            //System.out.println(ls);
            //hs.add(ls.toString());
            if(ls.length()==0)return;
            int[]arr = new int[ls.length()];
            StringBuilder pp = new StringBuilder();
            permu(ls.toString(),arr,pp);
            return;
        }
        //if(id>=p.length())return ;
        ls.append(p.charAt(id));
        back(ls,id+1,p);
        ls.deleteCharAt(ls.length()-1);
        back(ls,id+1,p);
    }
    public void permu(String l,int[] arr,StringBuilder pp){
        if(pp.length()==arr.length){hs.add(pp.toString());}
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)continue;
            arr[i]=1;pp.append(l.charAt(i));
            permu(l,arr,pp);
            arr[i]=0;pp.deleteCharAt(pp.length()-1);
        }
    }
    /**
    public int check(List<Character> ll){
        int[]arr = new int[26];
        for(Character p : ll){
            arr[p-'A']++;
        }
        int tot = 0,mul=1;
        for(Character p : ll){
            tot+=arr[p-'A'];
            mul*=fact(arr[p-'A']);
        }
        return fact(tot)/mul;
    }
    public int fact(int x){
        if(x==0 || x==1)return 1;
        return x * fact(x-1);
    }*/
}