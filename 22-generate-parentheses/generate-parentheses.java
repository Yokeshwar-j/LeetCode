class Solution {
   // int v;
    public List<String> generateParenthesis(int n) {
        int v=n;
        List<String> fin = new ArrayList<>();
        StringBuilder x = new StringBuilder();
        back(fin,x,n,v);
        return fin;
    }
    public void back(List<String> fin, StringBuilder sb , int n,int p){
        if(n==0 && p==0){
            fin.add(sb.toString());
            return;
        }
        if(n>0){
            sb.append('(');
            back(fin,sb,n-1,p);
            sb.deleteCharAt(sb.length()-1);
        }
        if(p>0 && p>n){
            sb.append(')');
            back(fin,sb,n,p-1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}