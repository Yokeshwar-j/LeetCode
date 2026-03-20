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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> fin = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();
        if(root==null)return fin;
        dq.addFirst(root);
        while(!dq.isEmpty()){
            List<Integer> ll = new ArrayList<>();
            int ss = dq.size();
            for(int i=0;i<ss;i++){
                TreeNode ele = dq.poll();
                if(ele.left!=null){dq.add(ele.left);}
                if(ele.right!=null){dq.add(ele.right);}
                ll.add(ele.val);
            }
            fin.add(ll.get(ll.size()-1));
        }
        return fin;
    }
}