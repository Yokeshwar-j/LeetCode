/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode x = head;
        while(x!=null){
            if(x.val==Integer.MAX_VALUE){
                return true;
            }
            x.val=Integer.MAX_VALUE;
            x=x.next;
        }
        return false;
    }
}