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
    public TreeNode invertTree(TreeNode root) {
        inv(root);
        return root;
    }
    public void inv(TreeNode x){
        if(x==null)return ;
        TreeNode t = x.left;
        x.left=x.right;
        x.right=t;
        inv(x.left);
        inv(x.right);

    }
}