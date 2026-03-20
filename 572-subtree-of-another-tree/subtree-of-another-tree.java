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
    boolean con=false;
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        iter(root,sub);
        return con;
    }
    public void iter(TreeNode root,TreeNode sub){
        if(root==null || sub==null)return;
        if(root.val==sub.val){boolean val = check(root,sub);if(val)con=true;}
        iter(root.left,sub);iter(root.right,sub);
    }
    public boolean check(TreeNode x , TreeNode y){
        if(x==null && y==null)return true;
        if(x==null || y==null || x.val!=y.val)return false;
        return check(x.left,y.left) && check(x.right,y.right);
    }
}