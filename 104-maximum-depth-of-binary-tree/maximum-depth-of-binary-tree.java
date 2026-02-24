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
    int max=0;
    public int maxDepth(TreeNode root) {
        check(0,root);
        return max;
    }
    public void check(int x,TreeNode p){
        x++;
        if(p==null){x--;return;}
        max=Math.max(x,max);
        check(x,p.left);check(x,p.right);
    }
}