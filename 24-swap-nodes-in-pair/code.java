/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = head;
        ListNode cur = head;
        int i=0;
        while(cur!=null){
            i++;
            if(i==2){
            int d1 = prev.val;
            prev.val = cur.val;
            cur.val=d1;i=0;
            }
            prev= cur;
            cur = cur.next;    
        }
        return head;
    }
}
