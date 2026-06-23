class Solution {
    public int[][] insert(int[][] inter, int[] ne) {
        List<int[]> ls = new ArrayList<>();
        int idx=-1;
        boolean con=false;
        for(int i=0;i<inter.length;i++){
            if(ne[0]<=inter[i][1]){
                con=true;
                if(ne[0]<inter[i][0]){
                    idx=i;break;
                }
                else{inter[i][1]=Math.max(inter[i][1],ne[1]);break;}
            }
        }
        if(!con){idx=inter.length;}
        if(idx!=-1){
            boolean fon=false;
            for(int i=0;i<inter.length;i++){
                if(i==idx){ls.add(ne);fon=true;}
                ls.add(inter[i]);
            }
            if(!fon){ls.add(ne);}
            List<int[]> ds = new ArrayList<>();
            ds.add(ls.get(0));
            for(int i=1;i<ls.size();i++){
                int[] br = ds.get(ds.size()-1);
                if(br[1]>=ls.get(i)[0]){br[1]=Math.max(br[1],ls.get(i)[1]);}
                else{ds.add(ls.get(i));}
             }
             int[][]arr = new int[ds.size()][2];
            for(int i=0;i<ds.size();i++){arr[i]=ds.get(i);}
            return arr;
        }else{
            ls.add(inter[0]);
            for(int i=1;i<inter.length;i++){
                int[] br = ls.get(ls.size()-1);
                if(br[1]>=inter[i][0]){br[1]=Math.max(br[1],inter[i][1]);}
                else{ls.add(inter[i]);}
             }
             int[][]arr = new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){arr[i]=ls.get(i);}
        return arr;
        }
    }
}