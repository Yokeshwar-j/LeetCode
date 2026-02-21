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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ex = head;
        int c = 0;
        while(ex!=null){
            ex=ex.next;
            c++;
        }
        System.out.print(c);
        int[] arr = new int[c];
        left--;right--;ex=head;int i=0,t=0;
        while(ex!=null){
            arr[i++]=ex.val;ex=ex.next;
        }
        while(left<right){
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left] ^= arr[right];
            left++;right--;
        }
        ex=head;i=0;
        while(ex!=null){
            ex.val=arr[i++];ex=ex.next;
        }
        return head;
    }
}