class Solution {
    public int characterReplacement(String s, int k) {
        int max=0,i=0,j=0,maxlen=0;
        int[] arr = new int[26];
        while(j<s.length()){
            arr[s.charAt(j)-'A']++;
            max=Math.max(arr[s.charAt(j)-'A'],max);
            if((j-i+1)-max>k){
                arr[s.charAt(i++)-'A']--;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}