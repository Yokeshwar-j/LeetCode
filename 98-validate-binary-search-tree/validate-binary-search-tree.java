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
    public boolean isValidBST(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        in(ls,root);
        long max = Long.MIN_VALUE;
        for(int x : ls){
            if(x<=max)return false;
            max=x;
        }
        return true;
    }
    public void in(List<Integer>ls , TreeNode root){
        if(root==null)return;
        in(ls,root.left);
        ls.add(root.val);
        in(ls,root.right);
    }
}