/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> ls =new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        check(root,"");
        return ls;
    }
    public void check(TreeNode root,String s){
        if(root==null)return;
        if(root.left==null && root.right==null){
            if(s.length()!=0)s+="->"+root.val;
            else s+=""+root.val;
            ls.add(s);return;}
        if(s.length()!=0)s+="->"+root.val;
        else s+=""+root.val;
        check(root.left,s);
        check(root.right,s);
    }
}