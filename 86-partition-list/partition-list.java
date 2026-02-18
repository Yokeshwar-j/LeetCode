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
    public ListNode partition(ListNode head, int x) {
        ListNode hd = new ListNode(0);
        ListNode prev = hd;
        ListNode hh = head;
        while(hh!=null){
            if(hh.val<x){
                ListNode cur = new ListNode(hh.val);
                cur.next=null;
                prev.next=cur;
                prev=cur;
            }
            hh=hh.next;
        }
        hh=head;
        while(hh!=null){
            if(hh.val>=x){
                ListNode cur = new ListNode(hh.val);
                cur.next=null;
                prev.next=cur;
                prev=cur;
            }
            hh=hh.next;
        }
        return hd.next;
    }
}