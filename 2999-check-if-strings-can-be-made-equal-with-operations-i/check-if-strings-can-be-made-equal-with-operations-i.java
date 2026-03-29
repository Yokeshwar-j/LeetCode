class Solution {
    public boolean canBeEqual(String s1, String s2) {
        String a = ""+s1.charAt(2)+s1.charAt(1)+s1.charAt(0)+s1.charAt(3);
        String b = ""+s1.charAt(0)+s1.charAt(3)+s1.charAt(2)+s1.charAt(1);
        String c = ""+s1.charAt(2)+s1.charAt(3)+s1.charAt(0)+s1.charAt(1);
        return a.equals(s2) || b.equals(s2) || c.equals(s2) || s1.equals(s2);
    }
}