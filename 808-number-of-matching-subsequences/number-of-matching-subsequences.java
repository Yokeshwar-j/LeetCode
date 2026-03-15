class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int fin=0;
        HashMap<Character,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ele = s.charAt(i);
            List<Integer> temp= new ArrayList<>(); 
            if(hm.containsKey(ele)){temp = hm.get(ele);temp.add(i);hm.put(ele,temp);}
            else{temp.add(i);hm.put(ele,temp);}
        }
        for(String p : words){
           int val=0;
            boolean check = true;
            for(char el : p.toCharArray()){
                //int ch = arr[el-'a'];
                if(!hm.containsKey(el)){check=false;break;}
                val = getindex(hm.get(el),val);
                if(val==-1){check=false;break;}
                val++;
            }
            if(check){fin++;}
        }
        return fin;
    }
    public int getindex(List<Integer> ls,int ind ){
        //binary search
        int i=0,res=-1;
        int j = ls.size()-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(ls.get(mid)>=ind){
                res=ls.get(mid);
                j=mid-1;
            }else{i=mid+1;}
        }
        return res;
    }
}