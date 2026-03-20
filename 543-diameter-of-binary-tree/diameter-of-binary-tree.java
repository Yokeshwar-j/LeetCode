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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return max;
    }
    public int find(TreeNode x){
        if(x==null)return 0;
        int l = find(x.left);
        int r = find(x.right);
        max = Math.max(l+r,max);
        return 1+Math.max(l,r);//this is for the largest subtree of the given node(most confusing!)
    }
}