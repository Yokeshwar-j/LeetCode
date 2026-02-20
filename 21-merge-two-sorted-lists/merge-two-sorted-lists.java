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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                ListNode cur = new ListNode(l2.val);
                l2=l2.next;
                prev.next=cur;
                prev=cur;
            }else{
                ListNode cur = new ListNode(l1.val);
                l1 = l1.next;
                prev.next=cur;
                prev=cur;
            }    
        }
        while(l1!=null){
            ListNode cur = new ListNode(l1.val);
            prev.next=cur;
            prev=cur;
            l1 = l1.next;
        }
        while(l2!=null){
            ListNode cur = new ListNode(l2.val);
            prev.next=cur;
            prev=cur;
            l2 = l2.next;
        }
        return head.next;
    }
}