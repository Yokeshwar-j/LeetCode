class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char x : s.toCharArray()){
            arr[x-'a']++;
        }
        for(char x : t.toCharArray()){
            arr[x-'a']--;
        }
        int sum=0;
        for(int x : arr){if(x!=0)return false;}
        return true;
    }
}