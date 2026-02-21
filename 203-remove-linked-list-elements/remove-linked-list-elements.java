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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dum = new ListNode();
        dum.next=head;
        ListNode p=dum;
        ListNode it = head;
        while(it!=null){
            if(it.val==val){
                p.next=it.next;
                it=it.next;
            }
            else{
                p=it;it=it.next;
            }
        }
        return dum.next;
    }
}