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
    public boolean isPalindrome(ListNode head) {
        ListNode p = null;
        ListNode it = head;
        while(it!=null){
            ListNode cur = new ListNode(it.val);
            cur.next=p;
            p=cur;
            it=it.next;
        }
        while(p!=null){
            if(p.val!=head.val)return false;
            head=head.next;p=p.next;
        }
        return true;
    }
}