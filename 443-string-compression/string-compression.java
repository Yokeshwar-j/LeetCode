class Solution {
    public int compress(char[] cr) {
        //StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        int idx = 0;
        while(j<cr.length){
            if(cr[i]==cr[j]){j++;}
            else{
                System.out.println("hi");
                int val = j-i;
                if(val>1){
                    cr[idx++]=cr[i];
                    //sb.append(cr[i]);
                    String vval = String.valueOf(val);
                    for(char k : vval.toCharArray()){cr[idx++]=k;}
                }else{cr[idx++]=cr[i];}
                i=j;
            }
        }
        System.out.println("hello");
        if(j-i==1){cr[idx++]=cr[i];}
        else{
            cr[idx++]=cr[i];
                    //sb.append(cr[i]);
            String vval = String.valueOf(j-i);
            for(char k : vval.toCharArray()){cr[idx++]=k;}
        }
        return idx;

    }
}