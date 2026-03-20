/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode res = null;
    boolean c1=false,c2=false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        get(root,p.val,q.val);
        return res;
    }
    public void get(TreeNode x,int a,int b){
        if(x==null)return;
        if(a<x.val && b<x.val){get(x.left,a,b);}
        else if(x.val<a && x.val<b){get(x.right,a,b);}
        else {
            check(x,a,b);
            if(c1 && c2)res=x;
            c1=false;c2=false;
            return;
        }
    }
    public void check(TreeNode x,int a ,int b){
        if(x==null)return;
        if(x.val==a)c1=true;
        if(x.val==b)c2=true;
        check(x.left,a,b);check(x.right,a,b);
    }
}