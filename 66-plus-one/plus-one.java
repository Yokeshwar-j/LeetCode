class Solution { 
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
            }
        else{
            int i = digits.length-1;
            while(digits[i]==9){
                digits[i]=0;
                if(i==0){break;}
                i--;

            }
            if(i!=0){
                digits[i]+=1;
                return digits;
            }else{
                if(digits[0]!=9 && digits[0]!=0){
                    digits[0]+=1;
                    return digits;
                }
                else{
                int[] arr = new int[digits.length+1];
                for(int k=digits.length;k>-1;k--){
                    arr[k]=0;
                }
                arr[0]=1; 
                return arr;
                }
            }
        }
    }
}
