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
    boolean con = true;
    public boolean isBalanced(TreeNode root) {
        get(root);
        return con;
    }
    public int get(TreeNode x){
        if(x==null)return 0;
        int l = get(x.left);
        int r = get(x.right);
        if(Math.abs(l-r)>1)con=false;
        return Math.max(l,r)+1;
    }
}