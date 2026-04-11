class Solution {
   // int c=0;
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        int[] arr = new int[10];
        StringBuilder sb = new StringBuilder();
        Set<Integer> fin = new HashSet<>();
        back(arr,n,sb,fin);
        return fin.size();
    }
    public void back(int[] arr ,int n,StringBuilder sb,Set<Integer> fin){
        if(sb.length()==n)return;
        for(int i=0;i<=9;i++){
            if(arr[i]==1)continue;
            arr[i]=1;sb.append(String.valueOf(i));
             fin.add(Integer.parseInt(sb.toString()));
            //System.out.println(sb);
            back(arr,n,sb,fin);
            sb.deleteCharAt(sb.length()-1);arr[i]=0;
        }
    }
}