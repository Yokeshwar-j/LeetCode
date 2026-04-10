class Solution {
    char[] arr = new char[]{'a','b','c'};
    public String getHappyString(int n, int k) {
        //List<Character> ls= new ArrayList<>();
        
        int i=0,len=n;
        /**while(n!=0){
            ls.add(arr[(i++)%len]);
        }*/
        List<String> fin = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        back(fin,len,sb,'t');
        return fin.size()>=k?fin.get(k-1):"";
    }
    public void back(List<String>fin,int len,StringBuilder sb,char last){
        if(sb.length()==len){fin.add(sb.toString());return;}
        for(int i=0;i<3;i++){
            if(last==arr[i]){continue;}
            char temp = last;
            last=arr[i];
            sb.append(arr[i]);
            //System.out.println("Push->"+sb);
            back(fin,len,sb,last);
            last=temp;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}