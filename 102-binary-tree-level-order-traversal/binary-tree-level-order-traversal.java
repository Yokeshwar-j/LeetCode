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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> qq = new ArrayDeque<>();
        List<List<Integer>> ls= new ArrayList<>(); 
        if(root==null)return ls;
        qq.addFirst(root);
        while(!qq.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int lsize = qq.size();
            for(int i=0;i<lsize;i++){
                TreeNode p = qq.poll();
                if(p.left!=null)qq.add(p.left);
                if(p.right!=null)qq.add(p.right);
                l.add(p.val);
            }
            ls.add(l);
        }
        return ls;
    }
}